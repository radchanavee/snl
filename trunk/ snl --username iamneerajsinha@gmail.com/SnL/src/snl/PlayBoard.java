package snl;

import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PlayBoard extends JFrame{
	private JPanel panel;
	public PlayBoard(){
		panel = new JPanel();
		this.setTitle("Snakes & Ladders");
		this.setBounds(0, 0, 640, 640);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		getContentPane().add(panel);
		this.setContentPane(getContentPane());
	}
	
	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public static void main(String[] a){
		PlayBoard board = new PlayBoard();
		board.createNewBoard();
		board.setVisible(true);
		
	}

	private void createNewBoard() {
		for(int i = 0; i < 10; i++){
			for (int j = 1; j <= 10; j++) {
				BoardCell cell = new BoardCell();
				cell.setNumber(String.valueOf((i*10 + j)));
				cell.setStartLocation(new Point(i*10+64, j));
				cell.setBox(new Rectangle(64, 64));
			}
		}
	}
}
