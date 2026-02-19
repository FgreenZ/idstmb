package idstmb;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	public Ventana() {
		JFrame ventana = new JFrame();
		ventana.setVisible(true);
		ventana.setSize(600,600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.BLACK);
		ventana.setMinimumSize(new Dimension(500,500));
		ventana.setMaximumSize(new Dimension(600,600));
		ventana.setTitle("Hola");
		ventana.setLocation(100,100);
	}

}
