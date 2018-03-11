import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants{
	Image background;
	Player1 player1 = new Player1();
	Player2 player2 = new Player2();
	Timer timer;
	
	public Board(String p1, String p2){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		if(p1.compareTo("")==0){p1="PLAYER1";}
		if(p2.compareTo("")==0){p2="PLAYER2";}
		if(p1.compareTo(p2)==0){p2+="2";}
		player1.name = p1;
		player2.name = p2;
		
		background = new ImageIcon(Board.class.getResource(BACKGROUND)).getImage();
		GameLoop();
	}
	
	public void bindEvents(){
		setFocusable(true);
		this.addKeyListener(new KeyAdapter() {
			
			
		
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP){	
					player1.up();}
				
				if(e.getKeyCode() == KeyEvent.VK_DOWN){	
					player1.down();}
				
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					if(player1.x<player2.x-90){
					player1.doright();
					}
				}
				//else
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					
					player1.doleft();}
		
				//else
				if(e.getKeyCode() == KeyEvent.VK_SPACE){	
					player1.gopower();
			}
				if(e.getKeyCode() == KeyEvent.VK_K){	
					player1.doBlock();
			}
				if(e.getKeyCode() == KeyEvent.VK_L){	
					player1.doki();
					//player1.fire();
					PlaySong.songplayhit();
			}
				//else
				if(e.getKeyCode() == KeyEvent.VK_CONTROL){
				player1.dopunch();
				}
				//else
					if(e.getKeyCode() == KeyEvent.VK_ALT){
					player1.dokick();
					}
					
					if(e.getKeyCode() == KeyEvent.VK_S){	
						player2.down();}
					
					//else
						if(e.getKeyCode()==KeyEvent.VK_D){	
							player2.doright1();}
					//else
						if(e.getKeyCode()==KeyEvent.VK_A){	
							if(player2.x>player1.x+90){
							player2.doleft1();}}
				
						if(e.getKeyCode() == KeyEvent.VK_W){	
						player2.up();}
						
						if(e.getKeyCode()==KeyEvent.VK_X){	
							player2.doBlock();}
						//else
						if(e.getKeyCode() == KeyEvent.VK_Q){	
							player2.gopower1();
					}
						if(e.getKeyCode() == KeyEvent.VK_Z){	
							player2.doki();
							PlaySong.songplayki2();
					}
						//else
						if(e.getKeyCode() == KeyEvent.VK_E){
						player2.dopunch1();
						}
						//else
							if(e.getKeyCode() == KeyEvent.VK_R){
							player2.dokick1();
							}
//							else
//								if(e.getKeyCode()==KeyEvent.VK_5 && e.getKeyCode()==KeyEvent.VK_6){
//									if(player1.x<player2.x-90){
//									player1.doright();
//									}
//									if(player2.x>player1.x+90){
//										player2.doleft1();}
//
//								}
//				// TODO Auto-generated method stub
//				//System.out.println("Press "+e.getKeyCode()+" "+e.getKeyChar());
//			}
			}});
	}
	
	
	int end=0;
	int n=1;
	
	@Override
	public void paintComponent(Graphics g){
	
		super.paintComponent(g);
		printBg(g);
		drawHealth(g);
		printTime(g);
		if(isdraw==1 ){
			printDraw(g);
			
		}
		
		if(player1.health>0 && player2.health>0){
		
			if(!player1.getIshit()){
				player1.setback(g);
			}
			if(!player2.getIshit()){
				player2.setback(g);
			}
			
			player1.still(g);
		player1.right(g);
		player1.left(g);
		player1.powerup(g);
		player1.punch(g);
		player1.kick(g);
		player1.ki(g);
		player1.Block(g);
		player1.makeBeam(g);
		player2.still1(g);
		player2.right1(g);
		player2.left1(g);
		player2.ki(g);
		player2.makeBeam(g);
		player2.powerup1(g);
		player2.Block(g);
		player2.punch1(g);
		player2.kick1(g);}
		if(player2.health<=0){
			printResult1(g);
			if(n==1){
			PlaySong.songplay1();
			n++;}
		player1.win(g);
		end=1;
		player2.lose1(g);
		}//timer.stop();}
		if(player1.health<=0){
			if(n==1){
				PlaySong.songplay1();
				n++;}
		end=1;
			printResult2(g);
		player2.win1(g);
		player1.lose(g);
		
		}//timer.stop();}
		drawHealthbar(g);
		Blast(g);
		Blast1(g);
		Blast2(g);
		//player1.fly(g);
		}
	
	private void GameLoop(){
		timer = new Timer(DELAY,(e)->{
		repaint();
		checkCollision();
		checkBeamCollision();
		checkBeamCollision1();
		BeamCollision();
	//	player1.dofly();
		
		});
		timer.start();		
	}
	private void printResult1(Graphics g){
		g.setColor(Color.blue);
		g.setFont(new Font("ARIAL",Font.ITALIC,80));
		g.drawString(player1.name+" WINS", GAME_WIDTH/2-350, GAME_HEIGHT/2);
	}
	private void printResult2(Graphics g){
		g.setColor(Color.blue);
		g.setFont(new Font("ARIAL",Font.ITALIC,80));
		g.drawString(player2.name+" WINS", GAME_WIDTH/2-350, GAME_HEIGHT/2);
	}
	private void printDraw(Graphics g){
		g.setColor(Color.blue);
		g.setFont(new Font("ARIAL",Font.ITALIC,80));
		if(player1.health==player2.health){
		g.drawString("TIME OVER : DRAW", GAME_WIDTH/2-373, GAME_HEIGHT/2);
	}else
		if(player1.health<player2.health){
			g.drawString(player2.name+" WINS",GAME_WIDTH/2-373,GAME_HEIGHT/2);
			player1.lose(g);
			player2.win1(g);
		}
		else
		{
			g.drawString(player1.name+"  WINS",GAME_WIDTH/2-373,GAME_HEIGHT/2);
			player1.win(g);
			player2.lose1(g);
		}}
	
	String i="100";
	int c=0;
	int b=99;
	private void printTime(Graphics g){
		if (end==0){
			if(Integer.parseInt(i)>=0){
		g.setColor(Color.WHITE);
		g.setFont(new Font("ARIAL",Font.BOLD,100));
		g.drawString(i, GAME_WIDTH/2-50, 80);}
		c++;
		if(c==14){
			i=String.valueOf(b);
			b--;
			c=0;
		//	if(b<=0){b=0;}
			
		}
		if(b==-2){isdraw=1;}
	}}

	Image im = new ImageIcon(Board.class.getResource("blast.png")).getImage();
	private void Blast(Graphics g){
		if(q==1){
			if(beamlist.size()>0){
			for(Beam beam:beamlist){
				if(!beam.ishit){
					g.drawImage(im, player2.x, player2.y, player2.w, player2.h,null);
					beam.ishit=true;
				}
			}
		}}
	}
	
	private void Blast1(Graphics g){
		if(t==1){
			if(beamlist1.size()>0){
			for(Beam beam:beamlist1){
				if(!beam.ishit){
					g.drawImage(im, player1.x, player1.y, player1.w, player1.h,null);
					beam.ishit=true;
				}
			}
		}}
	}
	int o=0;
	private void Blast2(Graphics g){
		
			
			for(Beam beam:beamlist1){
				for(Beam beam1:beamlist1){
				if(beam.getCollide() && beam1.getCollide()){			
					g.drawImage(im,beam.x-100, beam.y-100, beam.w+150, beam.h+150,null);
					beam.ishit=beam1.ishit=true;
					o++;
					if(o==3){
					beam.collide=beam1.collide=false;
					o=0;
				}}
			
		}}
	}
	
	int isdraw=0;
	
	private void printBg(Graphics g){
		
		g.drawImage(background, 0, 0, GAME_WIDTH,GAME_HEIGHT,null);
	}
	
	private void drawHealthbar(Graphics g){
		g.setColor(Color.RED);
		g.drawLine(55, 12, 463,12);
		g.drawLine(55, 12, 55, 40);
		g.drawLine(55, 40, 463,40);
		g.drawLine(463, 40, 463, 12);
		g.setColor(Color.GREEN);
		g.drawLine(GAME_WIDTH-464, 12, GAME_WIDTH-58, 12);
		g.drawLine(GAME_WIDTH-464, 12, GAME_WIDTH-464, 40);
		g.drawLine(GAME_WIDTH-464, 40, GAME_WIDTH-58, 40);
		g.drawLine(GAME_WIDTH-58, 40, GAME_WIDTH-58, 12);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.setColor(Color.GREEN);
		g.drawString(player1.name, 55, 85);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.setColor(Color.RED);
		g.drawString(player2.name, GAME_WIDTH-464, 85);
	}
	private void drawHealth(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(60, 15, 4*player1.health, 23);
		g.setColor(Color.GREEN);
		g.fillRect(GAME_WIDTH-460, 15,4*player2.health, 23);
	}

	public void checkCollision(){
		
		if(player1.currentMove==5 || player1.currentMove==4){
			if(player1.index==1){
				
			
			
			if((player1.x + player1.w)>player2.x && (player1.y<(player2.y+player2.h/2-25)) && (player1.y>(player2.y-player2.h/2+35) ) ){
				if(player2.currentMove!=7){
				player2.health-=2;
				player2.currentMove=100;
				player2.ishit=false;
				if(player2.health>=0){
				PlaySong.songplaypunch();
				}}}
			}
			}
		
		else if(player2.currentMove==5 || player2.currentMove==4){
			if(player2.index==2){
			if(((player2.x-player2.w)<player1.x) && (player2.y<(player1.y+player1.h/2+10)) && (player2.y>(player1.y-player1.h/2+35) )){
				if(player1.currentMove!=7){
				player1.health-=2;
				player1.currentMove=100;
				player1.ishit=false;
				if(player1.health>=0){
					PlaySong.songplaypunch();
					}}
			}
			}
		}
	}
	int q=0;
	ArrayList<Beam> beamlist = player1.getBeamlist();
	private void checkBeamCollision(){
		//ArrayList<Beam> beamlist = player1.getBeamlist();
		if(beamlist.size()>0){
			for(Beam beam:beamlist){
			if(beam.isVisible()){
				
				if(((beam.x + beam.w -70)>player2.x && (beam.y + beam.h)>player2.y ) && (beam.y - beam.h)<player2.y){
					PlaySong.songplaypunch();
					q=1;
					if(player2.currentMove!=7){
					player2.health-=10;}
					player2.health-=10;
					beam.isVisible = false;
					beam.ishit=false;
					player2.currentMove=100;
					player2.ishit=false;
				}
	}}}
	}
	
	int t=0;	
	ArrayList<Beam> beamlist1 = player2.getBeamlist();
	private void checkBeamCollision1(){
		
		if(beamlist1.size()>0){
			for(Beam beam:beamlist1){
			if(beam.isVisible()){
				
				if((beam.x <(player1.x+player1.w-35) && (beam.y + beam.h)>player1.y ) && beam.y<(player1.y+player1.h)){
					PlaySong.songplaypunch();
					t=1;
					if(player1.currentMove!=7){
						player1.health-=10;
					}
					player1.health-=10;
					beam.isVisible = false;
					beam.ishit=false;
					player1.currentMove=100;
					player1.ishit=false;
				}
	}}}
	}
	
	private void BeamCollision(){
		for(Beam beam1:beamlist1){
			for(Beam beam:beamlist){
				if(beam.isVisible() && beam1.isVisible()){
					if((beam.x>(beam1.x-beam1.w+30)) && (beam1.y<(beam.y+beam.h)) && (beam.y>(beam1.y-beam1.h))){
						beam.isVisible = beam1.isVisible = false;
						
							beam.collide=beam1.collide=true;		
							PlaySong.songplayblast();
						
					}
				}
			}
		}
	}
	
//private void setBackDraw(){
//	Graphics g = null;
//	player1.setBack(g);
//}
}
