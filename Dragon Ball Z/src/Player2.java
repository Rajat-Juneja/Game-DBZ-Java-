import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player2 extends Sprite {
	public Boolean ishit;
public Player2(){
	x=GAME_WIDTH - 200;
	y=500;
	w=100;
	h=130;
	ishit=true;
	
}

private ArrayList<Beam> beamlist = new ArrayList<>();

public ArrayList<Beam> getBeamlist() {
	return beamlist;
}
public void setBeamlist(ArrayList<Beam> beamlist) {
	this.beamlist = beamlist;
}



public void up(){
	y-=15;
	if(y<=100){y=100;}
}
public void down(){
	y+=15;
	if(y>=GAME_HEIGHT-175){y=GAME_HEIGHT-175;}
}
int currentMove=0;
int index=0;
int count =0;
int count1=0;
SpriteLoader sl =new SpriteLoader();
BufferedImage arrofstill[] = sl.Stillsprite2();
BufferedImage arrofright[] = sl.Rightsprite2();
BufferedImage arrofleft[] = sl.Leftsprite2();
BufferedImage arrofpowerup[] = sl.Powerupsprite2();
BufferedImage arrofpunch[] = sl.Punchsprite2();
BufferedImage arrofkick[] = sl.Kicksprite2();
BufferedImage arrofwin[] = sl.winsprite2();
BufferedImage arroflose[] = sl.losesprite2();
BufferedImage arrofsetback[] = sl.setbacksprite2();
BufferedImage arrofki[] = sl.kisprite2();
BufferedImage arrofblock[] =sl.blocksprite2();
BufferedImage arrofinair[] = sl.inairsprite2();

public Boolean getIshit() {
	return ishit;
}

public void setIshit(Boolean ishit) {
	this.ishit = ishit;
}
int l=0;
int p=0;
public void setback(Graphics g){
	if(l<2){
		g.drawImage(arrofsetback[l], x, y,w,h, null);
		x=x+3;
		if(x>=GAME_WIDTH-100){x=GAME_WIDTH-100;}
		p++;
		if(p==7){
			p=0;
			l++;
		
	}
	if(l==2){
		l=0;
		currentMove=0;
ishit=true;		
	}}
}

public void makeBeam(Graphics g){
	if(e==1){
	if(beamlist.size()>0){
	for(Beam beam:beamlist){
	if(beam.isVisible()){
	beam.drawBeam(g);
	beam.moveBeam1();
	beam.outOfScreen();
	}}}
}}

int e=0;
public void fire(){
	Beam beam = new Beam(x-200,y,arrofki[2]);
	beamlist.add(beam);
	
}

public void doki(){
	currentMove=6;
			index=0;
			
	
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
if(index==2){
	e=1;
fire();
}
if(index>1){
	index=0;
	currentMove=0;
}
}}




int i=0;
int j=0;
int m=0;
int a=0;
public void lose1(Graphics g){
	currentMove=10;
		g.drawImage(arroflose[i], x, y, w, h, null);
		a++;
		if(a==3 && i<=2){a=0;
		i++;
		}
		if(i>2){
			i=2;
			//return;
		}
		if(y<550){
			y+=20;
		}
}


public void win1(Graphics g){
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

public void gopower1(){
	currentMove=3;
	index=0;
	
}
public void powerup1(Graphics g){
	
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
int n=0;
int z=0;
public void still1(Graphics g){
	if(currentMove==0){
		if(y>GAME_HEIGHT/2+120){
		g.drawImage(arrofstill[index], x, y, w, h, null);
		count++;
	
	if(count==4){
		index++;
		count=0;
	}
	if(index>1){index = 0;}}
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
}}}

private void goright1(){
x=x+7;
	if(x>=GAME_WIDTH-100){x=GAME_WIDTH-100;}
	
}
public void doright1(){
	currentMove=1;
	index=0;
}
int c=0;
public void right1(Graphics g){
	if(currentMove==1){
		g.drawImage(arrofright[index], x, y,w,h ,null);
	c++;
	goright1();
	if(c==1){
		c=0;
		index++;
	}
	if(index>4){currentMove=0;
	index=0;
	}}
}

private void goleft1(){
	x=x-7;
}
public void doleft1(){
	currentMove=2;
	index=0;
	c=0;
}

public void left1(Graphics g){
	if(currentMove==2){
		g.drawImage(arrofleft[index], x, y,w,h ,null);
	c++;
		goleft1();
	if(c==1){
		c=0;
		index++;
	}

	if(index>4){currentMove=0;
	index=0;
	}}
}


public void dopunch1(){
	currentMove=4;
	index=0;
	c=0;
}
public void punch1(Graphics g){
	if(currentMove==4){
		g.drawImage(arrofpunch[index], x, y,w,h ,null);
	c++;
	if(c==2){
		c=0;
		index++;
	}
		
	
	if(index>4){currentMove=0;
	index=0;
	}}
}

public void dokick1(){
	currentMove=5;
	index=0;
	c=0;
}
public void kick1(Graphics g){
	if(currentMove==5){
		g.drawImage(arrofkick[index], x, y,w,h ,null);
		c++;
		if(c==2){
			c=0;
			index++;
		}
	if(index>4){currentMove=0;
	index=0;
	}}

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



