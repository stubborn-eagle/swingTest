package swingTest;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameGrid extends JFrame{

	private static final String titolo = "Prima Finestra";
	private static final int larghezza=200, altezza=200;
	
	private static final int righe=4, colonne=4;

	public MyFrameGrid(){
		
		super(titolo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(larghezza,altezza);
		Container frmContentPane = this.getContentPane();
		frmContentPane.setLayout(new GridLayout(righe, colonne));
		for (int i = 0; i<15; i++) {
		frmContentPane.add(new JButton(String.valueOf(i)));
		}
		this.setVisible(true);	
		
	}
	
}
