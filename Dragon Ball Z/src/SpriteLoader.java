import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class SpriteLoader {
BufferedImage image1;
BufferedImage image2;
public SpriteLoader(){
	try{
		image1=ImageIO.read(SpriteLoader.class.getResource("sprite1.gif"));
		image2=ImageIO.read(SpriteLoader.class.getResource("sprite2.gif"));
	}
	catch(Exception e){
		System.out.println("Can't Load the Player Sprite Image");
	}
}

   // FOR THE FIRST PLAYER

public BufferedImage[] Stillsprite1(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image1.getSubimage(47, 6, 48, 85);
	a[1]=image1.getSubimage(720, 479, 45, 91);
	
	return a;
}
public BufferedImage[] inairsprite1(){
	BufferedImage a[] = new BufferedImage[1];
	a[0]=image1.getSubimage(622, 484, 40, 91);
	//a[1]=image1.getSubimage(720, 479, 45, 91);
	
	return a;
}
public BufferedImage[] Rightsprite1(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image1.getSubimage(302, 102, 40, 79);
	a[1]=image1.getSubimage(510, 480, 54, 83);
	a[2]=image1.getSubimage(510, 480, 54, 83);
	a[3]=image1.getSubimage(302, 102, 40, 79);
	a[4]=image1.getSubimage(47, 6, 48, 85);
return a;	
}
public BufferedImage[] Leftsprite1(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image1.getSubimage(302, 102, 40, 79);
	a[1]=image1.getSubimage(569, 480, 48, 83);
	a[2]=image1.getSubimage(569, 480, 48, 83);
	a[3]=image1.getSubimage(302, 102, 40, 79);
	a[4]=image1.getSubimage(47, 6, 48, 85);
return a;	
}
public BufferedImage[] Powerupsprite1(){
	BufferedImage a[] = new BufferedImage[3];
	a[0]=image1.getSubimage(110, 377, 42, 90);
	a[1]=image1.getSubimage(166, 374, 60, 96);
	a[2]=image1.getSubimage(110, 377, 42, 90);
			return a;
}
public BufferedImage[] Punchsprite1(){
	BufferedImage a[] = new BufferedImage[4];
	a[0]=image1.getSubimage(436, 8, 48, 85);
	a[1]=image1.getSubimage(568, 13, 59, 78);
	a[2]=image1.getSubimage(636, 13, 87, 77);
	a[3]=image1.getSubimage(568, 13, 59, 78);
			return a;
}
public BufferedImage[] Kicksprite1(){
	BufferedImage a[] = new BufferedImage[3];
	a[0]=image1.getSubimage(163, 5, 51, 88);
	a[1]=image1.getSubimage(224, 3, 80, 89);
	a[2]=image1.getSubimage(163, 5, 51, 88);
			return a;
}
public BufferedImage[] winsprite1(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image1.getSubimage(288, 388, 41, 78);
	a[1]=image1.getSubimage(241, 386, 41, 80);
			return a;
}
public BufferedImage[] losesprite1(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image1.getSubimage(8, 196, 49, 87);
	a[1]=image1.getSubimage(60, 203, 71, 71);
	a[2]=image1.getSubimage(134, 191, 75, 67);
	a[3]=image1.getSubimage(214, 193, 85, 51);
	a[4]=image1.getSubimage(304, 201, 90, 34);
			return a;
}
public BufferedImage[] kisprite1(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image1.getSubimage(483, 392, 50, 77);
	a[1]=image1.getSubimage(539, 390, 50, 77);
	a[2]=image1.getSubimage(260, 478, 51, 77);
	a[3]=image1.getSubimage(652, 389, 54, 77);
	a[4]=image1.getSubimage(9, 553, 48, 32);
			return a;
}
public BufferedImage[] setbacksprite1(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image1.getSubimage(490, 99, 55, 91);
	a[1]=image1.getSubimage(436, 105, 51, 84);
			return a;
}
public BufferedImage[] blocksprite1(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image1.getSubimage(717, 192, 37, 87);
	a[1]=image1.getSubimage(717, 192, 37, 87);
			return a;
}


// FOR THE SECOND PLAYER

public BufferedImage[] Stillsprite2(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image2.getSubimage(747, 265, 34, 63);
	a[1]=image2.getSubimage(722, 3, 36, 74);
	
	return a;
}
public BufferedImage[] Rightsprite2(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image2.getSubimage(355, 251, 32, 74);
	a[1]=image2.getSubimage(256, 249, 39, 78);
	a[2]=image2.getSubimage(256, 249, 39, 78);
	a[3]=image2.getSubimage(256, 249, 39, 78);
	a[4]=image2.getSubimage(355, 251, 32, 74);
return a;	
}
public BufferedImage[] Leftsprite2(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image2.getSubimage(355, 251, 32, 74);
	a[1]=image2.getSubimage(210, 250, 35, 76);
	a[2]=image2.getSubimage(210, 250, 35, 76);
	a[3]=image2.getSubimage(210, 250, 35, 76);
	a[4]=image2.getSubimage(355, 251, 32, 74);
return a;	
}
public BufferedImage[] Powerupsprite2(){
	BufferedImage a[] = new BufferedImage[3];
	a[0]=image2.getSubimage(281, 342, 29, 76);
	a[1]=image2.getSubimage(202, 338, 60, 102);
	a[2]=image2.getSubimage(281, 342, 29, 76);
			return a;
}
public BufferedImage[] Punchsprite2(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image2.getSubimage(663, 11, 45, 65);
	a[1]=image2.getSubimage(592, 6, 65, 66);
	a[2]=image2.getSubimage(539, 11, 45, 64);
	a[3]=image2.getSubimage(458, 3, 64, 69);
	a[4]=image2.getSubimage(722, 3, 36, 74);
			return a;
}
public BufferedImage[] Kicksprite2(){
	BufferedImage a[] = new BufferedImage[5];
	a[0]=image2.getSubimage(762, 82, 34, 84);
	a[1]=image2.getSubimage(689, 80, 66, 84);
	a[2]=image2.getSubimage(651, 80, 33, 81);
	a[3]=image2.getSubimage(576, 82, 69, 81);
	a[4]=image2.getSubimage(722, 3, 36, 74);
	
			return a;
}
public BufferedImage[] winsprite2(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image2.getSubimage(324, 347, 42, 68);
	a[1]=image2.getSubimage(281, 342, 29, 76);
			return a;
}
public BufferedImage[] losesprite2(){
	BufferedImage a[] = new BufferedImage[3];
	a[0]=image2.getSubimage(577, 171, 45, 73);
	a[1]=image2.getSubimage(768, 174, 24, 79);
	a[2]=image2.getSubimage(244, 193, 81, 25);
			return a;
}
public BufferedImage[] setbacksprite2(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image2.getSubimage(577, 171, 45, 73);
	a[1]=image2.getSubimage(506, 177, 67, 52);
			return a;
}
public BufferedImage[] kisprite2(){
	BufferedImage a[] = new BufferedImage[3];
	a[0]=image2.getSubimage(753, 342, 34, 75);
	a[1]=image2.getSubimage(685, 346, 56, 69);
	a[2]=image2.getSubimage(23, 354, 70, 48);
			return a;
}
public BufferedImage[] blocksprite2(){
	BufferedImage a[] = new BufferedImage[2];
	a[0]=image2.getSubimage(768, 174, 24, 79);
	a[1]=image2.getSubimage(768, 174, 24, 79);
			return a;
}
public BufferedImage[] inairsprite2(){
	BufferedImage a[] = new BufferedImage[1];
	a[0]=image2.getSubimage(394, 247, 32, 82);
	//a[1]=image1.getSubimage(720, 479, 45, 91);
	
	return a;
}
}