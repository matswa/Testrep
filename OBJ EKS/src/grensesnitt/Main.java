package grensesnitt;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Grensesnitt grensesnitt = new Grensesnitt();
		grensesnitt.regSkip();
		JOptionPane.showMessageDialog(null, "Registrerer kunde");
		grensesnitt.regKunde();
		JOptionPane.showMessageDialog(null, "Registrerer land");
		grensesnitt.regLand();
		JOptionPane.showMessageDialog(null, "Lager oppdrag");
		grensesnitt.lagOppdrag();
		JOptionPane.showMessageDialog(null, "Skriver ut oppdrag");
		grensesnitt.skrivUtOppdrag();
	}

}
