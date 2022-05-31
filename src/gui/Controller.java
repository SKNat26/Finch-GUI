package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JButton;

public class Controller implements KeyListener {

	private char direction;

	public Controller() {
		JFrame frame = new JFrame();
		
		frame.addKeyListener(this);
		frame.setSize(500, 500);
		//frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==16){
			this.direction = 'k';
		}
		else
			this.direction = e.getKeyChar();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==16) {
			this.direction = 'l';
		}
		else
			this.direction = ' ';
	}


	public char getDirection() {
		return this.direction;
	}
	
}