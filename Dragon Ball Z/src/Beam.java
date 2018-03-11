import java.awt.Graphics;
import java.awt.Image;

public class Beam implements GameConstants{
int x;
int y;
int w;
int h;
int speed;
Image img;
Boolean isVisible;
Boolean ishit;
Boolean collide;

public Boolean getCollide() {
	return collide;
}
public void setCollide(Boolean collide) {
	this.collide = collide;
}
public Boolean getIshit() {
	return ishit;
}
public void setIshit(Boolean ishit) {
	this.ishit = ishit;
}
public boolean isVisible() {
	return isVisible;
}
public void setVisible(boolean isVisible) {
	this.isVisible = isVisible;
}

public Beam(int x,int y,Image img){
	
	this.x=x+100;
	this.y=y-15;
	w=h=150;
	speed=30;
	this.img = img;
	isVisible=true;
	ishit=true;
	collide=false;
}
public void drawBeam(Graphics g){
	g.drawImage(img,x,y,w,h,null);
}
public void moveBeam(){
x=x+speed;	
speed+=5;
}
public void moveBeam1(){
	x=x-speed;
	speed+=5;
}
public void outOfScreen(){
	if(x>=GAME_WIDTH){
		isVisible=false;
	}
	if(x<=0){
		isVisible=false;
	}
}
}
