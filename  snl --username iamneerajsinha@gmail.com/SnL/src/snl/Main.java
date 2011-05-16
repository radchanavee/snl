package snl;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends Frame implements ActionListener, WindowListener {

	static int var_player1 = 0;
	static int var_player2 = 0;

	Dimension dim = new Dimension();
	Boolean setPlayerFlag = false;
	static int dieVal = 0;
	
	Graphics g = null;
	
	Image snakeBoard = null;
	Image backGround = null;
	Image die = null;
	Image redDisk = null;
	Image blueDisk = null;
	
	static int check_die = 0;
	static int P1_x = 785;
	static int P1_y = 500;
	
	static int P2_x = 675;
	static int P2_y = 500;
	
	static int const_val = 30;
	static int column_size = 55;
	static int height = 100;
	
	int [][]board = {{100,99,98,97,96,95,94,93,92,91},
					 {81,82,83,84,85,86,87,88,89,90},
					 {88,79,78,77,76,75,74,73,72,71},};
	


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}
