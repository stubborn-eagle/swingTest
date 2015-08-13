package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrameWithInnerComponents extends JFrame {

	private static final String titolo = "Contenitori Multipli";
	//Pannello Nord:
	private static final JLabel infoLbl = new JLabel("Selezionare");
	private static final JPanel nordPnl = new JPanel();
	//Pannello Centrale:
	private static final JCheckBox opz1Chk = new JCheckBox("Opz1");
	private static final JCheckBox opz2Chk = new JCheckBox("Opz2");
	private static final JPanel centroPnl = new JPanel(new GridLayout(2,1));
	//Pannello Sud:
	private static final JButton okBtn=new JButton("OK");
	private static final JButton cancBtn=new JButton("Annulla");
	private static final JPanel sudPnl = new JPanel();

	
	public MyFrameWithInnerComponents() {

		super(titolo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Pannello Nord
		nordPnl.add(infoLbl);
		//Pannello Centro
		centroPnl.add(opz1Chk);
		centroPnl.add(opz2Chk);
		//Pannello Sud
		sudPnl.add(okBtn);
		sudPnl.add(cancBtn);
		//Container Principale
		Container frmContentPane = this.getContentPane();
		frmContentPane.add(nordPnl, BorderLayout.NORTH);
		frmContentPane.add(centroPnl, BorderLayout.CENTER);
		frmContentPane.add(sudPnl, BorderLayout.SOUTH);
		//Impostiamo le proprieta’ di visualizzazione
		this.pack(); // Imposta la dimensione minima per visualizzare tutti i componenti
		// Posizioniamo la finestra al centro dello schermo
		this.setLocationRelativeTo(null);
		// Rendiamo visibile la finestra
		this.setVisible(true);
	
		
	}

}
