import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setTitle(TITLE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
		String p1= JOptionPane.showInputDialog(this, "Enter the name of player 1");
		String p2= JOptionPane.showInputDialog(this, "Enter the name of player 2");
		Board board = new Board(p1,p2);
		add(board);
		board.bindEvents();
		PlaySong.songPlay();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GameFrame();

	}

}
