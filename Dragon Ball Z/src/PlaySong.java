import jaco.mp3.player.MP3Player;

public class PlaySong {
	
	public static void  songPlay(){
		MP3Player mp3 = new MP3Player(PlaySong.class.getResource("pop.mp3"));
		mp3.play();
	}
	public static void songplay1(){
		MP3Player mp4 = new MP3Player(PlaySong.class.getResource("Gohan yells.mp3"));
		mp4.play();
	}
	public static void songplayhit(){
		MP3Player mp5 = new MP3Player(PlaySong.class.getResource("kame.mp3"));
		mp5.play();
	}
	public static void songplaypunch(){
		MP3Player mp5 = new MP3Player(PlaySong.class.getResource("punch.mp3"));
		mp5.play();
	}
	public static void songplayki2(){
		MP3Player mp5 = new MP3Player(PlaySong.class.getResource("kiblast2.mp3"));
		mp5.play();
	}
	public static void songplayblast(){
		MP3Player mp5 = new MP3Player(PlaySong.class.getResource("explosion.mp3"));
		mp5.play();
	}

}