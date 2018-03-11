import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player1 extends Sprite{
	
	public Boolean ishit;
	public Player1(){
		x=100;
		y=500;
		w=120;
		h=150;
		ishit=true;
				
	}
	public ArrayList<Beam> getBeamlist() {
		return beamlist;
	}
	public void setBeamlist(ArrayList<Beam> beamlist) {
		this.beamlist = beamlist;
	}
	
	
	public void up(){
		y-=10;
		if(y<=100){y=100;}
	}
	public void down(){
		y+=10;
		if(y>=GAME_HEIGHT-175){y=GAME_HEIGHT-175;}
	}
	int currentMove=0;
	int index=0;
	int count =0;
	int count1=0;
	SpriteLoader sl =new SpriteLoader();
	BufferedImage arrofstill[] = sl.Stillsprite1();
	BufferedImage arrofright[] = sl.Rightsprite1();
	BufferedImage arrofleft[] = sl.Leftsprite1();
	BufferedImage arrofpowerup[] = sl.Powerupsprite1();
	BufferedImage arrofpunch[] = sl.Punchsprite1();
	BufferedImage arrofkick[] = sl.Kicksprite1();
	BufferedImage arrofwin[] = sl.winsprite1();
	BufferedImage arroflose[] = sl.losesprite1();
	BufferedImage arrofki[] = sl.kisprite1();
	BufferedImage arrofsetback[] = sl.setbacksprite1();
	BufferedImage arrofblock[] = sl.blocksprite1();
	BufferedImage arrofinair[] = sl.inairsprite1();

	int l=0;
	int p=0;
	public void setback(Graphics g){
		if(l<2){
			g.drawImage(arrofsetback[l], x, y,w,h, null);
			x=x-3;
			if(x<=2){x=10;}
			p++;
			if(p==4){
				p=0;
				l++;
			
		}
		if(l==2){
			l=0;
			index=0;
			currentMove=0;
	ishit=true;		
		}}
	}
	
	
	public Boolean getIshit() {
		return ishit;
	}
	public void setIshit(Boolean ishit) {
		this.ishit = ishit;
	}
	private ArrayList<Beam> beamlist = new ArrayList<>();
	
	
	
	public void makeBeam(Graphics g){
		if(e==1){
		if(beamlist.size()>0){
		for(Beam beam:beamlist){
		if(beam.isVisible()){
		beam.drawBeam(g);
		beam.moveBeam();
		beam.outOfScreen();
		}}}
	}}
	int e=0;
	public void fire(){
		Beam beam = new Beam(this.x,this.y,arrofki[4]);
		beamlist.add(beam);
		
	}

	
	
	public void doki(){
		currentMove=6;
				index=0;
				//fire();
		
	}
	int abc=0;
	public void ki(Graphics g){
	if(currentMove==6){
		
		g.drawImage(arrofki[index], x, y, w, h, null);
		abc++;
	if(abc>10){
	index++;
	abc=0;
	}
	if(index==4){
		e=1;
	fire();
	}
	if(index>3){
		index=0;
		currentMove=0;
	}
	}}
	
	int a=0;
	int i=0;
	public void lose(Graphics g){
		currentMove=10;
			g.drawImage(arroflose[i], x, y-15, w-15, h-25, null);
				a++;
				if(a==3 && i<=4)
				{
					a=0;
				i++;
				}
		if(i>4){
i=4;
return;
			
		}
		if(y<550){
			y+=20;
		}
					
	}
	int j=0;
	int m=0;
	public void win(Graphics g){
		currentMove=10;
			g.drawImage(arrofwin[j], x, y, w, h, null);
			m++;
			if(m==5){
				m=0;
				j++;
			}
			if(j>arrofwin.length-1){
				j=0;
			}
			if(y<550){
				y+=20;
			}
	}
	
	public void gopower(){
		currentMove=3;
		index=0;
		
	}
	int c=0;
	public void powerup(Graphics g){
		if(currentMove==3){
		g.drawImage(arrofpowerup[index], x, y, w, h, null);
		count1++;
		if(count1==4){
			index++;
			count1=0;
		}
	
	if(index>2){
		currentMove=0;
		index=0;
	}}
	}
	int z=0;
	int n=0;
	public void still(Graphics g){
		if(currentMove==0){
			if(y>GAME_HEIGHT/2+120){
			g.drawImage(arrofstill[index], x, y, w, h, null);
			count++;
		
		if(count==7){
			index++;
			count=0;
		}
		if(index>1){index = 0;}
			}
			else{
				g.drawImage(arrofinair[z], x, y, w, h, null);
				if(n<5){
					y+=2;
					n++;
				}
				else{y-=2;
				n++;
				}
				if(n==10){
					n=0;
				}
			}
		}}
	
	private void goright(){
	x=x+7;
	
	}
	public void doright(){
		currentMove=1;
		index=0;
		
	}
	public void right(Graphics g){
		if(currentMove==1){
			g.drawImage(arrofright[index], x, y,w,h ,null);
		index++;
		goright();
		if(index>4){currentMove=0;
		index=0;
		
		}}
	}
	
	private void goleft(){
		x=x-7;
		if(x<=2){x=10;}
	}
	public void doleft(){
		currentMove=2;
		index=0;
		
	}
	public void left(Graphics g){
		if(currentMove==2){
			g.drawImage(arrofleft[index], x, y,w,h ,null);
		goleft();
		index++;
		if(index>4){currentMove=0;
		index=0;
		
		}}
	}


	public void dopunch(){
		currentMove=4;
		index=0;
		c=0;
	}
	public void punch(Graphics g){
		if(currentMove==4){
			g.drawImage(arrofpunch[index], x, y,w,h ,null);
			c++;
			if(c==2){
				c=0;
				index++;
			}
		
		if(index>3){currentMove=0;
		index=0;
		}}
	}
	
	public void dokick(){
		currentMove=5;
		index=0;
		c=0;
	}
	public void kick(Graphics g){
		if(currentMove==5){
			g.drawImage(arrofkick[index], x, y,w,h ,null);
			c++;
			if(c==2){
				c=0;
				index++;
			}
		if(index>2){currentMove=0;
		index=0;
		}
		
		}
	}
	
	public void doBlock(){
		index=0;
		currentMove=7;
		}

		public void Block(Graphics g){
			if(currentMove==7){
				g.drawImage(arrofblock[index], x,y, w, h,null);
					index++;
				if(index>1){
					index=0;
					currentMove=0;
				}
				
			}
			
		}

	
}


