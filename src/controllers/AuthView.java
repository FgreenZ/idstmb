package controllers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import models.AuthModel;

public class AuthView {
	

	
	public void login() {
		JFrame ventana=new JFrame();
		ventana.setSize(600, 636);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.WHITE);
		//this.setMinimumSize(new Dimension(1200,600));
		//this.setMaximumSize(new Dimension(1200,600));
		ventana.setTitle("Calculadora");
		ventana.setLocation(100,100);
		ventana.getContentPane().setBackground(Color.LIGHT_GRAY);
		ventana.setLayout(new BorderLayout());
	    ImageIcon icono = new ImageIcon("icono.png");
	    ventana.setIconImage(icono.getImage());
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.DARK_GRAY);
		contenedor.setSize(600,636);
		contenedor.setLocation(0,23);
		contenedor.setLayout(null);
		ventana.add(contenedor);
		
		JPanel contenedor2 = new JPanel();
		contenedor2.setOpaque(true);
		contenedor2.setBackground(Color.BLACK);
		contenedor2.setSize(600,554);
		contenedor2.setLocation(600,23);
		contenedor2.setLayout(null);
		ventana.add(contenedor2);
		
		JLabel icono1 =new JLabel(new ImageIcon("icon.PNG"));
		icono1.setBounds(100, 102, 350, 180);
		contenedor2.add(icono1);
		
		JLabel CODEX = new JLabel();
		CODEX.setText("< CodeX >");
		CODEX.setSize(200, 40);
		CODEX.setOpaque(true);
		CODEX.setBackground(null);
		CODEX.setForeground(Color.WHITE);
		CODEX.setLocation(180, 260);
		CODEX.setFont(new  Font("Arial",Font.ITALIC,40));
		contenedor2.add(CODEX);
		
		contenedor2.repaint();
		contenedor2.revalidate();
		
		/*TITULO*/
		JLabel title_login = new JLabel();
		title_login.setText("< ACCEDER >");
		title_login.setSize(200, 25);
		title_login.setOpaque(true);
		title_login.setBackground(null);
		title_login.setForeground(Color.WHITE);
		title_login.setLocation(200, 62);
		title_login.setFont(new  Font("Arial",Font.ITALIC,30));
		contenedor.add(title_login);
		
		/*USERNAME*/
		//Cuadro de texto
		JTextField username=new JTextField();
		username.setSize(550, 30);
		username.setLocation(20, 170);
		username.setBackground(Color.WHITE);
		username.setFont(new  Font("Arial",Font.BOLD,16));
		String username_correcto ="admin";
		contenedor.add(username);
		//Texto
		JLabel usernameT = new JLabel();
		usernameT.setText("Nombre de usuario");
		usernameT.setSize(350, 15);
		usernameT.setOpaque(true);
		usernameT.setBackground(null);
		usernameT.setForeground(Color.WHITE);
		usernameT.setLocation(20, 154);
		usernameT.setFont(new  Font("Arial",Font.ITALIC,15));
		contenedor.add(usernameT);
		
		/*PASSWORD*/
		//Cuadro de texto
		JPasswordField  contraseña=new JPasswordField();
		contraseña.setSize(550, 30);
		contraseña.setLocation(20, 250);
		contraseña.setBackground(Color.WHITE);
		contraseña.setFont(new  Font("Arial",Font.BOLD,16));
		contenedor.add(contraseña);
		String contraseña_correcta ="123";
		//Texto
		JLabel contraseñaT = new JLabel();
		contraseñaT.setText("Contraseña");
		contraseñaT.setSize(350, 15);
		contraseñaT.setOpaque(true);
		contraseñaT.setBackground(null);
		contraseñaT.setForeground(Color.WHITE);
		contraseñaT.setLocation(20, 234);
		contraseñaT.setFont(new  Font("Arial",Font.ITALIC,15));
		contenedor.add(contraseñaT);
		
		
		
		contraseña.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String contraseña_val =username.getText();
				
				if(contraseña_val.equals("")) {
					contraseña.setBorder(new LineBorder(Color.RED, 4));
				}else {
					contraseña.setBorder(new LineBorder(Color.GREEN, 4));
				}
				
			}
		});
		
		/*REMEMEBER ME*/
		//Boton
		JCheckBox recuerdame=new JCheckBox();
		recuerdame.setSize(18, 18);
		recuerdame.setLocation(20,300);
		contenedor.add(recuerdame);
		//texto
		JLabel recuerdameT = new JLabel();
		recuerdameT.setText("Recuerdame");
		recuerdameT.setSize(100, 15);
		recuerdameT.setOpaque(true);
		recuerdameT.setBackground(null);
		recuerdameT.setForeground(Color.WHITE);
		recuerdameT.setLocation(44, 301);
		recuerdameT.setFont(new  Font("Arial",Font.ITALIC,13));
		contenedor.add(recuerdameT);
		
		/*Boton de acceder*/
		JButton acceder= new JButton();
		JTextField borde= new JTextField();
		acceder.setText("Aceptar");
		acceder.setSize(120, 90);
		acceder.setLocation(240,370);
		acceder.setFont(new  Font("Arial",Font.ROMAN_BASELINE,16));
		acceder.setBorder(new LineBorder(Color.WHITE, 6, false));
		contenedor.add(acceder);
		
		//aun no tienes cuenta?
		JButton no_cuenta= new JButton();
		no_cuenta.setText("¿Aun no tienes cuentasss?");
		no_cuenta.setSize(250, 90);
		no_cuenta.setBackground(null);
		no_cuenta.setLocation(180,475);
		no_cuenta.setEnabled(true);
		no_cuenta.setForeground(Color.WHITE);
		no_cuenta.setFont(new  Font("Arial",Font.ROMAN_BASELINE,16));
		no_cuenta.addActionListener(e->{
			ventana.dispose();
			registro();
		});
		contenedor.add(no_cuenta);
		
		
		acceder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String contraseña_ingresada =new String(contraseña.getPassword());
				int mensaje_error =JOptionPane.ERROR_MESSAGE;

				
				if((contraseña_ingresada.equals(contraseña_correcta))&&(username.getText().equals(username_correcto))) {
					contraseña.setBorder(new LineBorder(Color.GREEN, 4));
					username.setBorder(new LineBorder(Color.GREEN, 4));
					JOptionPane.showMessageDialog(
						    null, 
						    "Ingresando al sistema...", 
						    "inicio de sesion", 
						    JOptionPane.INFORMATION_MESSAGE
					);
					 ventana.dispose();
					 registro();
					
				}else {
					contraseña.setBorder(new LineBorder(Color.RED, 4));
					username.setBorder(new LineBorder(Color.RED, 4));
					JOptionPane.showMessageDialog(
						    null, 
						    "Contraseña o usuario incorrectos", 
						    "Error", 
						    JOptionPane.INFORMATION_MESSAGE
					);

				}
			}
		});
		
		
		/*CONTRASEÑA OLVIDADA*/
		JLabel contraseñaOlvidada = new JLabel();
		contraseñaOlvidada.setText("<html><u>Olvide mi contraseña</u></html>");
		contraseñaOlvidada.setSize(140, 50);
		contraseñaOlvidada.setOpaque(true);
		contraseñaOlvidada.setBackground(null);
		contraseñaOlvidada.setForeground(Color.WHITE);
		contraseñaOlvidada.setLocation(450, 283);
		contraseñaOlvidada.setFont(new  Font("Arial",Font.ITALIC,13));
		contenedor.add(contraseñaOlvidada);
		
		ventana.setVisible(true);
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void registro() {

		JFrame ventana=new JFrame();
		ventana.setSize(600, 636);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.WHITE);
		//this.setMinimumSize(new Dimension(1200,600));
		//this.setMaximumSize(new Dimension(1200,600));
		ventana.setTitle("Calculadorass");
		ventana.setLocation(100,100);
		ventana.getContentPane().setBackground(Color.LIGHT_GRAY);
		ventana.setLayout(new BorderLayout());
	    ImageIcon icono = new ImageIcon("icono.png");
	    ventana.setIconImage(icono.getImage());
		
		//contenedor de registro
		JPanel register_conteneiner = new JPanel();
		register_conteneiner.setSize(600,600);
		register_conteneiner.setLocation(0,0);
		register_conteneiner.setOpaque(true);
		register_conteneiner.setBackground(Color.lightGray);
		register_conteneiner.setLayout(null);
		ventana.add(register_conteneiner);
		
		//biografia
		JLabel titulo=new JLabel("Biografia");
		titulo.setSize(250,80);
		titulo.setBackground(Color.white);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setBackground(null);
		titulo.setLocation(170,20);
		titulo.setOpaque(true);
		titulo.setFont(new  Font("Arial",Font.ITALIC,40));
		register_conteneiner.add(titulo);
		
		
		
		//desplegable colonias
		JComboBox colonias=new JComboBox();
		colonias.setSize(550,20);
		colonias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Camino Real", "Paraiso del Sol","El Pedregal", "Fidepaz", "Puerta Cortés", "Colinas del Sol"}));		
		colonias.setOpaque(true);
		colonias.setFont(new  Font("Arial",Font.PLAIN,16));
		colonias.setLocation(20,455);
		register_conteneiner.add(colonias);

		
		//usuario
		JTextField usuarioT=new JTextField();
		usuarioT.setSize(550, 30);
		usuarioT.setLocation(20, 155);
		usuarioT.setBackground(Color.WHITE);
		usuarioT.setFont(new  Font("Arial",Font.BOLD,16));
		usuarioT.setBorder(new LineBorder(Color.BLACK, 1, true));
		register_conteneiner.add(usuarioT);
		
		//nombre de usuario
		JButton usuarioB= new JButton();
		usuarioB.setText("Nombre de Usuario");
		usuarioB.setSize(550, 30);
		usuarioB.setLocation(20, 115);
		usuarioB.setBackground(Color.DARK_GRAY);
		usuarioB.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
		usuarioB.setBorder(new LineBorder(Color.DARK_GRAY, 0, false));
		usuarioB.setEnabled(false);
		register_conteneiner.add(usuarioB);
		

		
		//biografia
		JLabel Biografia=new JLabel("Introduzca su Biografia");
		Biografia.setSize(500,50);
		Biografia.setLocation(60,190);
		Biografia.setBackground(Color.white);
		Biografia.setHorizontalAlignment(JLabel.CENTER);
		Biografia.setBackground(null);
		Biografia.setOpaque(true);
		Biografia.setFont(new Font("Arial",Font.ITALIC,32));
		register_conteneiner.add(Biografia);

		
		//cuadro de texto
		JTextArea BiografiaT = new JTextArea();
		BiografiaT.setSize(475,85);
		BiografiaT.setLocation(60,240);
		BiografiaT.setFont(new Font("Arial", Font.PLAIN, 13));
		BiografiaT.setLineWrap(true);   
		BiografiaT.setBorder(new LineBorder(Color.BLACK, 3, true));
		BiografiaT.setWrapStyleWord(true);
		register_conteneiner.add(BiografiaT);
		
		/*PREFERENCIAS*/
		//biografia
		JLabel Preferencias=new JLabel("Preferencias");
		Preferencias.setSize(500,50);
		Preferencias.setLocation(228,320);
		Preferencias.setBackground(Color.BLACK);
		Preferencias.setBackground(null);
		Preferencias.setOpaque(true);
		Preferencias.setFont(new Font("Arial",Font.ITALIC,22));
		register_conteneiner.add(Preferencias);
		
		//preferencias
		JCheckBox checkBoxS=new JCheckBox();
		checkBoxS.setSize(18, 18);
		checkBoxS.setLocation(20,370);
		checkBoxS.setBackground(Color.LIGHT_GRAY);
		register_conteneiner.add(checkBoxS);
		//text
		JLabel checkBoxST = new JLabel();
		checkBoxST.setText("Salado");
		checkBoxST.setSize(60, 14);
		checkBoxST.setOpaque(true);
		checkBoxST.setBackground(null);
		checkBoxST.setForeground(Color.BLACK);
		checkBoxST.setLocation(50,370);
		checkBoxST.setFont(new  Font("Arial",Font.ITALIC,14));
		register_conteneiner.add(checkBoxST);
		
		// CHECKBOX DULCE
		JCheckBox checkBoxD=new JCheckBox();
		checkBoxD.setSize(18, 18);
		checkBoxD.setLocation(250,370);
		checkBoxD.setBackground(Color.LIGHT_GRAY);
		register_conteneiner.add(checkBoxD);
		//text
		JLabel checkBoxDT = new JLabel();
		checkBoxDT.setText("Salado");
		checkBoxDT.setSize(60, 14);
		checkBoxDT.setOpaque(true);
		checkBoxDT.setBackground(null);
		checkBoxDT.setForeground(Color.BLACK);
		checkBoxDT.setLocation(270,370);
		checkBoxDT.setFont(new  Font("Arial",Font.ITALIC,14));
		register_conteneiner.add(checkBoxDT);
		
		// CHECKBOX ACIDO
		JCheckBox checkBoxA=new JCheckBox();
		checkBoxA.setSize(18, 18);
		checkBoxA.setLocation(480,370);
		checkBoxA.setBackground(Color.LIGHT_GRAY);
		register_conteneiner.add(checkBoxA);
		//text
		JLabel checkBoxAT = new JLabel();
		checkBoxAT.setText("Acido");
		checkBoxAT.setSize(60, 14);
		checkBoxAT.setOpaque(true);
		checkBoxAT.setBackground(null);
		checkBoxAT.setForeground(Color.BLACK);
		checkBoxAT.setLocation(500,370);
		checkBoxAT.setFont(new  Font("Arial",Font.ITALIC,14));
		register_conteneiner.add(checkBoxAT);
		
		
		
		ButtonGroup opciones = new ButtonGroup();
		JRadioButton acepto =new JRadioButton();
		acepto.setSize(90,16);
		acepto.setFont(new Font("Arial",Font.ROMAN_BASELINE,16));
		acepto.setText("Acepto");
		acepto.setBackground(Color.LIGHT_GRAY);
		acepto.setLocation(140,430);
		JRadioButton deniego =new JRadioButton();
		deniego.setSize(130,16);
		deniego.setFont(new Font("Arial",Font.ROMAN_BASELINE,16));
		deniego.setText("No acepto");
		deniego.setBackground(Color.LIGHT_GRAY);
		deniego.setLocation(360,430);
		opciones.add(acepto);
		opciones.add(deniego);
        register_conteneiner.add(acepto);
        register_conteneiner.add(deniego);

        //boton aceptar
        JButton terminos= new JButton();
        terminos.setText("Acepto los terminos");
        terminos.setSize(500, 20);
        terminos.setBackground(Color.WHITE);
        terminos.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        terminos.setBorder(new LineBorder(Color.BLACK, 2, true));
        terminos.setLocation(50,400);
        register_conteneiner.add(terminos);
        
        terminos.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		
        		acepto.setSelected(true);
        		
        	}
        });
        
      //boton aceptar
  		JButton accederB= new JButton();
  		accederB.setText("Aceptar");
  		accederB.setSize(500, 70);
  		accederB.setBackground(Color.WHITE);
  		accederB.setFont(new  Font("Arial",Font.ROMAN_BASELINE,22));
  		accederB.setBorder(new LineBorder(Color.BLACK, 6, true));
  		accederB.setLocation(50,492);
  		register_conteneiner.add(accederB);
  		
  		accederB.addActionListener(new ActionListener() {
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				String biografia_val =BiografiaT.getText();
  				int biografia_caracteres =biografia_val.length();
  				
  				if(usuarioT.getText().equals("")) {
  					usuarioT.setBorder(new LineBorder(Color.red, 1, true));
  				}else {
  					usuarioT.setBorder(new LineBorder(Color.green, 1, true));
  				}
  				
  				if(biografia_val.equals("")||biografia_caracteres<5) {
  					BiografiaT.setBorder(new LineBorder(Color.RED, 4));
  				}else {
  					BiografiaT.setBorder(new LineBorder(Color.GREEN, 4));
  					AuthModel x=new AuthModel();
  					x.registro(usuarioT.getText(), BiografiaT.getText());
  				}
  				
  				if(checkBoxD.isSelected()||checkBoxS.isSelected()||checkBoxA.isSelected()) {
  				    checkBoxD.setBackground(Color.GREEN);
  				    checkBoxS.setBackground(Color.GREEN);
  				    checkBoxA.setBackground(Color.GREEN);
  				}else{
  					checkBoxD.setBackground(Color.red);
  				    checkBoxS.setBackground(Color.red);
  				    checkBoxA.setBackground(Color.red);
  				}
  				
  				if(acepto.isSelected()) {
  					terminos.setBorder(new LineBorder(Color.GREEN, 2, true));
  				}else {
  					terminos.setBorder(new LineBorder(Color.red, 2, true));
  				}
  				
  			}
  		});
      		

        register_conteneiner.repaint();	
        ventana.setVisible(true);
	}

}
