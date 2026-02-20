package idstmb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {

		this.setVisible(true);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.BLACK);
		this.setMinimumSize(new Dimension(500,500));
		this.setMaximumSize(new Dimension(600,600));
		this.setTitle("Hola");
		this.setLocation(100,100);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.BLACK);
		contenedor.setSize(600,600);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("hola bola");
		title_login.setSize(100, 20);
		title_login.setOpaque(true);
		title_login.setBackground(Color.cyan);
		title_login.setLocation(250, 0);
		title_login.setFont(new  Font("Arial",Font.BOLD,22));
		contenedor.add(title_login);
		
		JTextField username=new JTextField();
		username.setSize(300, 30);
		username.setLocation(100, 250);
		username.setBackground(Color.WHITE);
		username.setFont(new  Font("Arial",Font.BOLD,16));
		contenedor.add(username);
		
		JButton acceder= new JButton();
		acceder.setText("boton");
		acceder.setSize(100, 100);
		acceder.setLocation(200,300);
		acceder.setFont(new  Font("Arial",Font.BOLD,16));
		contenedor.add(acceder);

		
		
		
		
		contenedor.repaint();
		contenedor.revalidate();
		
		
		
	}
	
	
	
	
	

}
