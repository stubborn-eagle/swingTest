package swingTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	private static final String titolo = "Prima Finestra";
	private static final JLabel testo = new JLabel("Buona Lezione");
	private static final int larghezza=200, altezza=200;
	
	private static final JButton bottone1 = new JButton("uno");
	
	public MyFrame() {
		super(titolo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(larghezza,altezza);
		this.setLayout(new FlowLayout());
		
		this.getContentPane().add(testo); // Abbreviato: evitiamo il Container
		this.getContentPane().add(bottone1);
		
		this.setVisible(true);
		
	}
	
}
