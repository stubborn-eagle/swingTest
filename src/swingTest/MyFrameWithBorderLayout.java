package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameWithBorderLayout extends JFrame {

	private static final String titolo = "BorderLayout e JButton";
	private static final int larghezza=300, altezza=200;
	private static final JButton north = new JButton("North");
	private static final JButton south = new JButton("South");
	private static final JButton east = new JButton("East");
	private static final JButton west = new JButton("West");


	public MyFrameWithBorderLayout(){
		
		super(titolo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(larghezza,altezza);
		Container frmContentPane = this.getContentPane(); //ha borderlayout di default
		frmContentPane.add(north, BorderLayout.PAGE_START);
		frmContentPane.add(south, BorderLayout.PAGE_END);
		frmContentPane.add(east, BorderLayout.LINE_END);
		frmContentPane.add(west, BorderLayout.LINE_START);

		this.setVisible(true);

		
	}
	
	
}
