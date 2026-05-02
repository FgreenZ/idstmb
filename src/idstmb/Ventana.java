package idstmb;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {

	public Ventana() {
		
		this.setSize(600, 636);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.WHITE);
		//this.setMinimumSize(new Dimension(1200,600));
		//this.setMaximumSize(new Dimension(1200,600));
		this.setTitle("Calculadora");
		this.setLocation(100,100);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BorderLayout());
        ImageIcon icono = new ImageIcon("icono.png");
		this.setIconImage(icono.getImage());
		
		
		/*MENU*/
		this.menuBar();
		
		this.setVisible(true);
		this.repaint();
	}
	
	public void login() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.DARK_GRAY);
		contenedor.setSize(600,636);
		contenedor.setLocation(0,23);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JPanel contenedor2 = new JPanel();
		contenedor2.setOpaque(true);
		contenedor2.setBackground(Color.BLACK);
		contenedor2.setSize(600,554);
		contenedor2.setLocation(600,23);
		contenedor2.setLayout(null);
		this.add(contenedor2);
		
		JLabel icono =new JLabel(new ImageIcon("icon.PNG"));
		icono.setBounds(100, 102, 350, 180);
		contenedor2.add(icono);
		
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
		no_cuenta.setText("¿Aun no tienes cuenta?");
		no_cuenta.setSize(250, 90);
		no_cuenta.setBackground(null);
		no_cuenta.setLocation(180,475);
		no_cuenta.setEnabled(true);
		no_cuenta.setForeground(Color.WHITE);
		no_cuenta.setFont(new  Font("Arial",Font.ROMAN_BASELINE,16));
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
					 router("registro");
					
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
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void registro() {

		//contenedor de registro
		JPanel register_conteneiner = new JPanel();
		register_conteneiner.setSize(600,600);
		register_conteneiner.setLocation(0,0);
		register_conteneiner.setOpaque(true);
		register_conteneiner.setBackground(Color.lightGray);
		register_conteneiner.setLayout(null);
		this.add(register_conteneiner);
		
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
        setVisible(true);
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
	}	
	//añadir
	public void recuperacionDeCuenta() {

	    /* PANEL IZQUIERDO (formulario) */
	    JPanel contenedor = new JPanel();
	    contenedor.setOpaque(true);
	    contenedor.setBackground(Color.DARK_GRAY);
	    contenedor.setSize(600, 636);
	    contenedor.setLocation(0, 23);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    /* PANEL DERECHO (logo / branding) */
	    JPanel contenedor2 = new JPanel();
	    contenedor2.setOpaque(true);
	    contenedor2.setBackground(Color.BLACK);
	    contenedor2.setSize(600, 554);
	    contenedor2.setLocation(600, 23);
	    contenedor2.setLayout(null);
	    this.add(contenedor2);

	    /* ICONO */
	    JLabel icono = new JLabel(new ImageIcon("icon.PNG"));
	    icono.setBounds(100, 102, 350, 180);
	    contenedor2.add(icono);

	    /* MARCA CODEX */
	    JLabel CODEX = new JLabel();
	    CODEX.setText("< CodeX >");
	    CODEX.setSize(200, 40);
	    CODEX.setOpaque(true);
	    CODEX.setBackground(null);
	    CODEX.setForeground(Color.WHITE);
	    CODEX.setLocation(180, 260);
	    CODEX.setFont(new Font("Arial", Font.ITALIC, 40));
	    contenedor2.add(CODEX);

	    contenedor2.repaint();
	    contenedor2.revalidate();

	    /* TITULO */
	    JLabel title_recuperacion = new JLabel();
	    title_recuperacion.setText("< RECUPERAR CUENTA >");
	    title_recuperacion.setSize(360, 25);
	    title_recuperacion.setOpaque(true);
	    title_recuperacion.setBackground(null);
	    title_recuperacion.setForeground(Color.WHITE);
	    title_recuperacion.setLocation(130, 62);
	    title_recuperacion.setFont(new Font("Arial", Font.ITALIC, 28));
	    contenedor.add(title_recuperacion);

	    /* INSTRUCCIONES */
	    JLabel instrucciones = new JLabel();
	    instrucciones.setText("Ingresa tus datos para recuperar tu cuenta");
	    instrucciones.setSize(420, 20);
	    instrucciones.setOpaque(true);
	    instrucciones.setBackground(null);
	    instrucciones.setForeground(Color.WHITE);
	    instrucciones.setLocation(160, 105);
	    instrucciones.setFont(new Font("Arial", Font.ITALIC, 14));
	    contenedor.add(instrucciones);

	    /* CORREO ELECTRONICO */
	    // Etiqueta
	    JLabel correoT = new JLabel();
	    correoT.setText("Correo electrónico");
	    correoT.setSize(350, 15);
	    correoT.setOpaque(true);
	    correoT.setBackground(null);
	    correoT.setForeground(Color.WHITE);
	    correoT.setLocation(20, 154);
	    correoT.setFont(new Font("Arial", Font.ITALIC, 15));
	    contenedor.add(correoT);
	    // Campo de texto
	    JTextField correo = new JTextField();
	    correo.setSize(550, 30);
	    correo.setLocation(20, 170);
	    correo.setBackground(Color.WHITE);
	    correo.setFont(new Font("Arial", Font.BOLD, 16));
	    contenedor.add(correo);

	    /* NOMBRE DE USUARIO */
	    // Etiqueta
	    JLabel usernameT = new JLabel();
	    usernameT.setText("Nombre de usuario");
	    usernameT.setSize(350, 15);
	    usernameT.setOpaque(true);
	    usernameT.setBackground(null);
	    usernameT.setForeground(Color.WHITE);
	    usernameT.setLocation(20, 234);
	    usernameT.setFont(new Font("Arial", Font.ITALIC, 15));
	    contenedor.add(usernameT);
	    // Campo de texto
	    JTextField username = new JTextField();
	    username.setSize(550, 30);
	    username.setLocation(20, 250);
	    username.setBackground(Color.WHITE);
	    username.setFont(new Font("Arial", Font.BOLD, 16));
	    contenedor.add(username);

	    /* PREGUNTA DE SEGURIDAD */
	    // Etiqueta de sección
	    JLabel preguntaT = new JLabel();
	    preguntaT.setText("Pregunta de seguridad");
	    preguntaT.setSize(350, 15);
	    preguntaT.setOpaque(true);
	    preguntaT.setBackground(null);
	    preguntaT.setForeground(Color.WHITE);
	    preguntaT.setLocation(20, 310);
	    preguntaT.setFont(new Font("Arial", Font.ITALIC, 15));
	    contenedor.add(preguntaT);
	    // Texto con la pregunta de ejemplo
	    JLabel preguntaEjemplo = new JLabel();
	    preguntaEjemplo.setText("¿Cuál es el nombre de tu primera mascota?");
	    preguntaEjemplo.setSize(420, 20);
	    preguntaEjemplo.setOpaque(true);
	    preguntaEjemplo.setBackground(null);
	    preguntaEjemplo.setForeground(Color.LIGHT_GRAY);
	    preguntaEjemplo.setLocation(20, 328);
	    preguntaEjemplo.setFont(new Font("Arial", Font.ITALIC, 13));
	    contenedor.add(preguntaEjemplo);
	    // Campo de respuesta
	    JTextField respuesta = new JTextField();
	    respuesta.setSize(550, 30);
	    respuesta.setLocation(20, 350);
	    respuesta.setBackground(Color.WHITE);
	    respuesta.setFont(new Font("Arial", Font.BOLD, 16));
	    contenedor.add(respuesta);

	    /* BOTON ENVIAR SOLICITUD */
	    JButton enviar = new JButton();
	    enviar.setText("Enviar solicitud");
	    enviar.setSize(180, 50);
	    enviar.setLocation(210, 420);
	    enviar.setFont(new Font("Arial", Font.PLAIN, 16));
	    enviar.setBorder(new LineBorder(Color.WHITE, 6, false));
	    contenedor.add(enviar);

	    /* BOTON VOLVER AL INICIO */
	    JButton volver = new JButton();
	    volver.setText("Volver al inicio de sesión");
	    volver.setSize(260, 50);
	    volver.setBackground(null);
	    volver.setLocation(170, 490);
	    volver.setEnabled(true);
	    volver.setForeground(Color.WHITE);
	    volver.setFont(new Font("Arial", Font.PLAIN, 16));
	    contenedor.add(volver);

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void users() {
		JPanel users =new JPanel();
		users.setSize(1000,500);
		users.setLocation(100,50);
		users.setBackground(Color.WHITE);
		users.setLayout(null);
		users.setOpaque(true);
		this.add(users);
		
		//titulo
		JLabel users_title =new JLabel("USUARIOS");
		users_title.setBounds(400,10,300,20);
		users_title.setLayout(null);
		users_title.setOpaque(true);
		users_title.setBackground(null);
		users_title.setFont(new  Font("Arial",Font.ITALIC,24));
		users.add(users_title);
		
		/*BOTONES*/
		JButton export =new JButton("Exportar");
		export.setBounds(30,120,100,40);
		users.add(export);
		
		JButton add =new JButton("Añadir");
		add.setBounds(130,120,100,40);
		users.add(add);
		
		
		
		/*TABLA*/
		Object [] table_head= {"No.Control","Nombre(s)","Apellido(s)","Semestre","promedio","acciones"};
		
		Object [][] table_content = {
			    {"2023001","Ana María","López Hernández","4","92.5","Editar"},
			    {"2023002","Carlos","Ramírez Soto","6","88.3","Editar"},
			    {"2023003","Fernanda","García Torres","2","95.0","Editar"},
			    {"2023001","Ana María","López Hernández","4","92.5","Editar"},
			    {"2023002","Carlos","Ramírez Soto","6","88.3","Editar"},
			    {"2023003","Fernanda","García Torres","2","95.0","Editar"},
			    {"2023001","Ana María","López Hernández","4","92.5","Editar"},
			    {"2023002","Carlos","Ramírez Soto","6","88.3","Editar"},
			    {"2023003","Fernanda","García Torres","2","95.0","Editar"},
			    {"2023001","Ana María","López Hernández","4","92.5","Editar"},
			    {"2023002","Carlos","Ramírez Soto","6","88.3","Editar"},
			    {"2023003","Fernanda","García Torres","2","95.0","Editar"},
			    {"2023001","Ana María","López Hernández","4","92.5","Editar"},
			    {"2023002","Carlos","Ramírez Soto","6","88.3","Editar"},
			    {"2023003","Fernanda","García Torres","2","95.0","Editar"},
			    {"2023004","José Luis","Martínez Díaz","8","81.7","Editar"}
		};

		JTable users_table =new JTable(table_content,table_head);
		users_table.setSize(800,350);
		users_table.setLocation(30,175);
		users.add(users_table);
		
		JScrollPane scrollPane =new JScrollPane(users_table);
		scrollPane.setLocation(30,175);
		scrollPane.setSize(800,200);
		users.add(scrollPane);
		
		
		users.repaint();
	}
	
	public void calculadora() {
		JPanel contenedor = new JPanel();
		 contenedor.setSize(400,500);
		 contenedor.setLocation(0,0);
		 contenedor.setLayout(null);
		 contenedor.setBackground(Color.BLACK);
		 contenedor.setOpaque(true);
		 contenedor.setLayout(null);
		 contenedor.setVisible(true);
		 this.add(contenedor);
		 
		JButton boton7 = new JButton("7");
		boton7.setBounds(50,80,60,60);
		boton7.setBackground(Color.BLACK);
		boton7.setForeground(Color.white);
		boton7.setFocusPainted(false);
		boton7.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setBounds(120,80,60,60);
		boton8.setBackground(Color.BLACK);
		boton8.setForeground(Color.white);
		boton8.setFocusPainted(false);
		boton8.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setBounds(190,80,60,60);
		boton9.setBackground(Color.BLACK);
		boton9.setForeground(Color.white);
		boton9.setFocusPainted(false);
		boton9.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton9);
		
		JButton botonDiv = new JButton("/");
		botonDiv.setBounds(260,80,90,60);
		botonDiv.setBackground(Color.decode("#008A39"));
		botonDiv.setForeground(Color.white);
		botonDiv.setFocusPainted(false);
		botonDiv.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonDiv);
		
		JButton boton4 = new JButton("4");
		boton4.setBounds(50,150,60,60);
		boton4.setBackground(Color.BLACK);
		boton4.setForeground(Color.white);
		boton4.setFocusPainted(false);
		boton4.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setBounds(120,150,60,60);
		boton5.setBackground(Color.BLACK);
		boton5.setForeground(Color.white);
		boton5.setFocusPainted(false);
		boton5.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setBounds(190,150,60,60);
		boton6.setBackground(Color.BLACK);
		boton6.setForeground(Color.white);
		boton6.setFocusPainted(false);
		boton6.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton6);
		
		JButton botonMult = new JButton("x");
		botonMult.setBounds(260,150,90,60);
		botonMult.setBackground(Color.decode("#008A39"));
		botonMult.setForeground(Color.white);
		botonMult.setFocusPainted(false);
		botonMult.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonMult);
		
		JButton boton1 = new JButton("1");
		boton1.setBounds(50,220,60,60);
		boton1.setBackground(Color.BLACK);
		boton1.setForeground(Color.white);
		boton1.setFocusPainted(false);
		boton1.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setBounds(120,220,60,60);
		boton2.setBackground(Color.BLACK);
		boton2.setForeground(Color.white);
		boton2.setFocusPainted(false);
		boton2.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setBounds(190,220,60,60);
		boton3.setBackground(Color.BLACK);
		boton3.setForeground(Color.white);
		boton3.setFocusPainted(false);
		boton3.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton3);
		
		JButton botonRes = new JButton("-");
		botonRes.setBounds(260,220,90,60);
		botonRes.setBackground(Color.decode("#008A39"));
		botonRes.setForeground(Color.white);
		botonRes.setFocusPainted(false);
		botonRes.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonRes);
		
		JButton boton0 = new JButton("0");
		boton0.setBounds(50,290,60,60);
		boton0.setBackground(Color.BLACK);
		boton0.setForeground(Color.white);
		boton0.setFocusPainted(false);
		boton0.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(boton0);
		
		JButton botonPunto = new JButton(".");
		botonPunto.setBounds(120,290,60,60);
		botonPunto.setBackground(Color.BLACK);
		botonPunto.setForeground(Color.white);
		botonPunto.setFocusPainted(false);
		botonPunto.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonPunto);
		
		JButton botonParentesis = new JButton("( )");
		botonParentesis.setBounds(190,290,60,60);
		botonParentesis.setBackground(Color.BLACK);
		botonParentesis.setForeground(Color.white);
		botonParentesis.setFocusPainted(false);
		botonParentesis.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonParentesis);

		JButton botonSuma = new JButton("+");
		botonSuma.setBounds(260,290,90,60);
		botonSuma.setBackground(Color.decode("#008A39"));
		botonSuma.setForeground(Color.white);
		botonSuma.setFocusPainted(false);
		botonSuma.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonSuma);
		
		JButton botonANS2 = new JButton("ANS");
		botonANS2.setBounds(50,360,60,60);
		botonANS2.setBackground(Color.decode("#000CAB"));
		botonANS2.setForeground(Color.white);
		botonANS2.setFocusPainted(false);
		botonANS2.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonANS2);
		
		JButton botonDEL = new JButton("DEL");
		botonDEL.setBounds(120,360,60,60);
		botonDEL.setBackground(Color.decode("#000CAB"));
		botonDEL.setForeground(Color.white);
		botonDEL.setFocusPainted(false);
		botonDEL.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonDEL);
		
		JButton botonAC2 = new JButton("AC");
		botonAC2.setBounds(190,360,60,60);
		botonAC2.setBackground(Color.decode("#000CAB"));
		botonAC2.setForeground(Color.white);
		botonAC2.setFocusPainted(false);
		botonAC2.setFont(new Font("Arial",Font.BOLD,10));
		contenedor.add(botonAC2);
		
		JButton botonIgual = new JButton("=");
		botonIgual.setBounds(260,360,90,60);
		botonIgual.setBackground(Color.decode("#AB0000"));
		botonIgual.setForeground(Color.white);
		botonIgual.setFocusPainted(false);
		botonIgual.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(botonIgual);
		
		botonIgual.repaint();
	}
	
	public void calculadoraGridlayoutBorderlayout()
	{
		JPanel test_panel = new JPanel();
		test_panel.setSize(400, 500);
		//test_panel.setLocation(100, 50);
		test_panel.setBackground(Color.white);
		test_panel.setLayout(new BorderLayout());
		this.add(test_panel);
	
		
		JPanel botones = new JPanel(); 
		botones.setBackground(Color.decode("#2B024F"));
		botones.setLayout(new GridLayout(5,3));
		
		//line1
		JButton numero1 =new JButton("AC");
		numero1.setBackground(Color.DARK_GRAY);
		numero1.setForeground(Color.WHITE);
		numero1.setBorder(new LineBorder(Color.RED, 2, true) );
		botones.add(numero1);
		
		JButton numero2 =new JButton("()");
		numero2.setBackground(Color.DARK_GRAY);
		numero2.setForeground(Color.WHITE);
		numero2.setBorder(new LineBorder(Color.RED, 2, true) );
		botones.add(numero2);
		
		JButton numero3 =new JButton("%");
		numero3.setBackground(Color.DARK_GRAY);
		numero3.setForeground(Color.WHITE);
		numero3.setBorder(new LineBorder(Color.RED, 2, true) );
		botones.add(numero3);
		
		//line2
		Color negro= Color.BLACK;
		
		JButton numero5 =new JButton("7");
		numero5.setSize(9, 9);
		numero5.setBackground(negro);
		numero5.setForeground(Color.WHITE);
		numero5.setBorder(new LineBorder(Color.RED, 2, true) );
		numero5.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero5);
		
		JButton numero6 =new JButton("8");
		numero6.setBackground(negro);
		numero6.setForeground(Color.WHITE);
		numero6.setBorder(new LineBorder(Color.RED, 2, true) );
		numero6.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero6);
		
		JButton numero7 =new JButton("9");
		numero7.setBackground(negro);
		numero7.setForeground(Color.WHITE);
		numero7.setBorder(new LineBorder(Color.RED, 2, true) );
		numero7.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero7);
		
		//line3
		JButton numero8 =new JButton("4");
		numero8.setBackground(negro);
		numero8.setForeground(Color.WHITE);
		numero8.setBorder(new LineBorder(Color.RED, 2, true) );
		numero8.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero8);
		
		JButton numero9 =new JButton("5");
		numero9.setBackground(negro);
		numero9.setForeground(Color.WHITE);
		numero9.setBorder(new LineBorder(Color.RED, 2, true) );
		numero9.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero9);
		
		JButton numero10 =new JButton("6");
		numero10.setBackground(negro);
		numero10.setForeground(Color.WHITE);
		numero10.setBorder(new LineBorder(Color.RED, 2, true) );
		numero10.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero10);
		
		//
		JButton numero11 =new JButton("1");
		numero11.setBackground(negro);
		numero11.setForeground(Color.WHITE);
		numero11.setBorder(new LineBorder(Color.RED, 2, true) );
		numero11.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero11);
		
		JButton numero12 =new JButton("2");
		numero12.setBackground(negro);
		numero12.setForeground(Color.WHITE);
		numero12.setBorder(new LineBorder(Color.RED, 2, true) );
		numero12.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero12);
		
		JButton numero13 =new JButton("3");
		numero13.setBackground(negro);
		numero13.setForeground(Color.WHITE);
		numero13.setBorder(new LineBorder(Color.RED, 2, true) );
		numero13.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero13);
		
		//
		JButton numero14 =new JButton("0");
		numero14.setBackground(negro);
		numero14.setForeground(Color.WHITE);
		numero14.setBorder(new LineBorder(Color.RED, 2, true) );
		numero14.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero14);
		
		JButton numero15 =new JButton(".");
		numero15.setBackground(Color.gray);
		numero15.setForeground(Color.WHITE);
		numero15.setBorder(new LineBorder(Color.RED, 2, true) );
		numero15.setFont(new Font("Arial",Font.ITALIC,30));
		botones.add(numero15);
		
		JButton numero16 =new JButton("<-");
		numero16.setBackground(Color.gray);
		numero16.setForeground(Color.WHITE);
		numero16.setBorder(new LineBorder(Color.RED, 2, true) );
		botones.add(numero16);
		
		
		test_panel.add(botones,BorderLayout.CENTER);
		
		JPanel operandos = new JPanel(); 
		operandos.setBackground(Color.DARK_GRAY);
		operandos.setLayout(new GridLayout(5,1));
		
		JButton a =new JButton("/");
		a.setBackground(null);
		a.setForeground(Color.WHITE);
		a.setBorder(new LineBorder(Color.RED, 2, true) );
		operandos.add(a);
		
		JButton b =new JButton("x");
		b.setBackground(Color.gray);
		b.setForeground(Color.WHITE);
		b.setBorder(new LineBorder(Color.RED, 2, true) );
		operandos.add(b);
		
		JButton c =new JButton("-");
		c.setBackground(Color.gray);
		c.setForeground(Color.WHITE);
		c.setBorder(new LineBorder(Color.RED, 2, true) );
		operandos.add(c);
		
		JButton d =new JButton("+");
		d.setBackground(Color.gray);
		d.setForeground(Color.WHITE);
		d.setBorder(new LineBorder(Color.RED, 2, true) );
		operandos.add(d);
		
		JButton e =new JButton("=");
		e.setBackground(Color.gray);
		e.setForeground(Color.WHITE);
		e.setBorder(new LineBorder(Color.RED, 2, true) );
		operandos.add(e);

		operandos.setPreferredSize(new Dimension(100, 0));
		test_panel.add(operandos,BorderLayout.LINE_END);

		
		
		JTextField operaciones=new JTextField();
		operaciones.setFont(new Font("Arial",Font.ITALIC,30));
		operaciones.setBackground(Color.decode("#BDD494"));
		operaciones.setBorder(new LineBorder(Color.BLACK, 8, false));
		operaciones.setPreferredSize(new Dimension(0, 80));
		test_panel.add(operaciones,BorderLayout.NORTH);
		/*
		JPanel south_panel = new JPanel();  
		south_panel.setBackground(Color.green);
		south_panel.setLayout(new FlowLayout(5,10,10));
		
		south_panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		south_panel.add(new JButton("1"));
		south_panel.add(new JButton("2"));
		south_panel.add(new JButton("3"));
		south_panel.add(new JButton("4"));
		south_panel.add(new JButton("5"));
		
		//test_panel.add(south_panel,BorderLayout.SOUTH);
		*/
		this.repaint();
		test_panel.repaint();
		botones.repaint();
		operandos.repaint();
		test_panel.revalidate();
		//south_panel.repaint();
	}
	
	public void interes() 
	{
		JPanel calculadora = new JPanel();
		calculadora.setSize(320,420);
		calculadora.setLocation(330,80);
		calculadora.setBackground(new Color(230,230,230));
		calculadora.setLayout(new BorderLayout());
		this.add(calculadora);
		
		JLabel title = new JLabel("INTERES");
		title.setFont(new Font("Arial",Font.BOLD,28));
		title.setBackground(new Color(230,230,230));
		calculadora.add(title,BorderLayout.NORTH);
		
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,2));

		
		botones.add(new JLabel("capital"));
		botones.add(new JTextField());
		botones.add(new JLabel("tiempo"));
		botones.add(new JTextField());
		botones.add(new JLabel("tasa interes"));
		botones.add(new JTextField());
		botones.add(new JButton("calcular"));
		botones.add(new JButton("cancelar"));

		calculadora.add(botones,BorderLayout.CENTER);
		
		JPanel inferior = new JPanel();
		inferior.setLayout(new GridLayout(2,2));

		
		inferior.add(new JLabel("Interes:"));
		inferior.add(new JTextField());
		inferior.add(new JLabel("Monto:"));
		inferior.add(new JTextField());
		
		calculadora.add(inferior,BorderLayout.SOUTH);
		
		calculadora.repaint();
		calculadora.revalidate();
	}
	
	public void interesIntento2() {
		
		JPanel calculadora = new JPanel();
		calculadora.setBackground(Color.decode("#1E1F22"));
		calculadora.setLayout(new BorderLayout());
		this.add(calculadora);
		
		
		
		JLabel titulo =new JLabel("Calculadora de intereses");
		titulo.setFont(new Font("Arial",Font.ITALIC,34));
		titulo.setBackground(null);
		titulo.setForeground(Color.WHITE);
		calculadora.add(titulo,BorderLayout.NORTH);
		
		/* panel centrico */
		JPanel elementos =new JPanel();
		elementos.setBackground(Color.decode("#2F2F2F"));
		elementos.setLayout(new GridLayout(3,2));
		
		
		//elementos
		JLabel Capital =new JLabel("Capital");
		Capital.setFont(new Font("Arial",Font.BOLD,12));
		Capital.setBackground(null);
		Capital.setForeground(Color.decode("#1F872D"));
		elementos.add(Capital);
		JTextField CapitalT =new JTextField();
		elementos.add(CapitalT);
		
		JLabel tiempo =new JLabel("tiempo");
		tiempo.setFont(new Font("Arial",Font.BOLD,12));
		tiempo.setBackground(null);
		tiempo.setForeground(Color.decode("#1F872D"));
		elementos.add(tiempo);
		JTextField tiempoT =new JTextField();
		elementos.add(tiempoT);
		
		JLabel tasa_de_interes =new JLabel("tasa de interes");
		tasa_de_interes.setFont(new Font("Arial",Font.BOLD,12));
		tasa_de_interes.setBackground(null);
		tasa_de_interes.setForeground(Color.decode("#1F872D"));
		elementos.add(tasa_de_interes);
		JTextField tasa_de_interesT =new JTextField();
		elementos.add(tasa_de_interesT);
		
		calculadora.add(elementos,BorderLayout.CENTER);
		/* panel centrico */

		
		/*botones*/
		JPanel panelsur = new JPanel();
		panelsur.setBackground(Color.decode("#48484C"));
		//panelsur.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		panelsur.setLayout(new BorderLayout());
		
		JPanel botones = new JPanel();
		botones.setBackground(Color.decode("#1E1F22"));
		botones.setLayout(new FlowLayout());
		
		JButton calcular =new JButton("calcular");
		calcular.setSize(10,10);
		botones.add(calcular,BorderLayout.NORTH);
		JButton cancelar =new JButton("cancelar");
		calcular.setSize(10,10);
		botones.add(cancelar,BorderLayout.NORTH);
		
		panelsur.add(botones,BorderLayout.NORTH);
		/*botones*/

		
		
		/*12panel sur12*/
		JPanel panel2 =new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setLayout(new GridLayout(2,2));
		
		JLabel interes =new JLabel("interes");
		interes.setFont(new Font("Arial",Font.BOLD,12));
		interes.setBackground(null);
		interes.setForeground(Color.decode("#1F872D"));
		panel2.add(interes);
		JTextField interesT =new JTextField();
		panel2.add(interesT);
		
		JLabel Monto =new JLabel("Monto");
		Monto.setFont(new Font("Arial",Font.BOLD,12));
		Monto.setBackground(null);
		Monto.setForeground(Color.decode("#1F872D"));
		panel2.add(Monto);
		JTextField MontoT =new JTextField();
		panel2.add(MontoT);
		
		JLabel yfuy  = new JLabel("          ");
		yfuy.setFont(new Font("Arial",Font.BOLD,12));
		
		panelsur.add(panel2,BorderLayout.CENTER);
		calculadora.add(panelsur,BorderLayout.SOUTH);
		/*12panel sur12*/
		
		
		
		
		
		
		
		
		
		
		
		
		calculadora.repaint();
		calculadora.revalidate();
	}
	
	public void pintar() {
		 JPanel pane = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D G2D = (Graphics2D) g;
	                G2D.setColor(Color.DARK_GRAY);
	                G2D.setStroke(new BasicStroke(5));
	                G2D.drawLine(0, 0, 100, 100);
	                G2D.drawLine(200, 200, 500, 200);
	                G2D.drawRect(250, 250, 100, 100);
	                
	                G2D.setColor(Color.DARK_GRAY);
	                G2D.drawOval(100, 300, 100, 100);
	                
	                G2D.setColor(Color.DARK_GRAY);
	                G2D.setStroke(new BasicStroke(5));
	                G2D.drawArc(100, 350, 100, 100, 180, 200);
	                
	                G2D.setColor(Color.DARK_GRAY);
	                G2D.setStroke(new BasicStroke(5));
	                G2D.drawPolygon(new int[] {200,100,300}, new int[] {100,300,500},3);
	                G2D.setColor(Color.ORANGE);
	                G2D.fillRect(500, 450, 100, 200);
	                G2D.setColor(Color.BLUE);
	                G2D.fillOval(50, 250, 100, 100);
	                G2D.setColor(Color.PINK);
	                G2D.fillArc(300, 300, 100, 100, 180, 200);
	                G2D.fillPolygon(new int[] {200,100,300}, new int[] {100,300,500},3);
	                
	                BufferedImage image;
					try {
						image = ImageIO.read(new File("src/icono.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						image = ImageIO.read(new File("src/icono.png"));
						G2D.drawImage(image, 200, 450, null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                
	            }
	        };
	        pane.setSize(600,400);
	        pane.setLocation(0,0);
	        this.add(pane);
	}
	
	public void casa() {
		 JPanel pane = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D G2D = (Graphics2D) g;
	                
	                G2D.setColor(Color.decode("#D69639"));
	                G2D.fillRect(0, 250, 587, 10);	
	                G2D.fillRect(0, 270, 587, 10);	
	                G2D.fillRect(0, 290, 587, 10);	
	                G2D.fillRect(0, 310, 587, 10);	
	                G2D.fillRect(0, 330, 587, 10);	
	                G2D.fillRect(0, 350, 587, 10);	
	                G2D.setColor(Color.decode("#FFB951"));
	                G2D.fillRect(0, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {0,8,4}, new int[] {240,240,232},3);
	                G2D.fillRect(28, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {28,36,32}, new int[] {240,240,232},3);
	                G2D.fillRect(58, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {58,66,62}, new int[] {240,240,232},3);
	                G2D.fillRect(500, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {500,508,504}, new int[] {240,240,232},3);
	                G2D.fillRect(528, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {528,536,532}, new int[] {240,240,232},3);
	                G2D.fillRect(556, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {556,564,560}, new int[] {240,240,232},3);
	                G2D.fillRect(584, 240, 8, 125);	
	                G2D.fillPolygon(new int[] {584,592,588}, new int[] {240,240,232},3);
	                ///
	                G2D.setColor(Color.decode("#EBC70E"));
	                G2D.fillArc(500, -100, 200, 200, 180, 90);
	                ///
	                G2D.setColor(Color.decode("#783220"));
	                G2D.setStroke(new BasicStroke(5));
	                G2D.drawRect(90, 142, 300, 220);
	                G2D.setColor(Color.decode("#59968A"));
	                G2D.fillRect(90, 142, 300, 220);
	                G2D.setColor(Color.decode("#783220"));
	                G2D.drawRect(390, 142, 100, 220);
	                G2D.setColor(Color.decode("#4F776F"));
	                G2D.fillRect(390, 142, 100, 220);
	                ///
	                G2D.setColor(Color.decode("#783220"));
	                G2D.drawPolygon(new int[] {95,250,386}, new int[] {140,50,140},3);
	                G2D.setColor(Color.decode("#874337"));
	                G2D.fillPolygon(new int[] {95,250,386}, new int[] {140,50,140},3);;
	                G2D.setColor(Color.decode("#783220"));
	                G2D.drawLine(250, 50, 490, 140);
	                G2D.setColor(Color.decode("#5E2920"));
	                G2D.fillPolygon(new int[] {250,490,390}, new int[] {50,140,140},3);;
	                G2D.setStroke(new BasicStroke(3));
	                G2D.setColor(Color.decode("#783220"));
	                G2D.drawLine(250, 50, 388, 140);
	                ///
	                G2D.setColor(Color.decode("#874337"));
	                G2D.fillRect(200, 240, 80, 220);	
	                G2D.setColor(Color.decode("#783220"));
	                G2D.drawRect(200, 240, 80, 220);
	                G2D.setColor(Color.YELLOW);
	                G2D.drawLine(265, 300, 265, 300);
	                ///
	                G2D.setColor(Color.decode("#72952D"));
	                G2D.fillRect(0, 362, 587, 10);	
	                G2D.setColor(Color.decode("#634C16"));
	                G2D.fillRect(0, 372, 587, 20);	
	                ///
	                
	                
	            }
		 };
		 pane.setBackground(Color.decode("#81B7FF"));
		 pane.setSize(650,400);
         pane.setLocation(0,0);
         this.add(pane);
	}
	
	public void marioFrame() {
		
		 JPanel pane = new JPanel() {
			 
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                
	                
	                
	                //cuadroazzul
	                g2d.setColor(Color.BLACK);
	                g2d.fillRect(190, 166, 110, 160);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(168, 146, 111, 180);
	                ///
	                g2d.setColor(Color.decode("#84C0FF"));
	                g2d.fillRect(170, 146, 110, 180);
	                ///tornillos
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(175, 149, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(175, 149, 15, 15);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(260, 149, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(260, 149, 15, 15);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(260, 305, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(260, 305, 15, 15);
	                
	                //cuadrorosa
	                g2d.setColor(Color.BLACK);
	                g2d.fillRect(120, 236, 110, 90);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(98, 216, 110, 110);
	                ///
	                g2d.setColor(Color.decode("#FFC3B8"));
	                g2d.fillRect(100, 216, 110, 110);
	                ///tornillos
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(110, 305, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(110, 305, 15, 15);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(190, 305, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(190, 305, 15, 15);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(190, 222, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(190, 222, 15, 15);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(110, 222, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(110, 222, 15, 15);
	                
	                //tuberia
	                g2d.setColor(Color.decode("#188814"));
	                g2d.fillRect(406, 246, 79, 80);
	                g2d.fillRect(400, 216, 90, 30);
	                ///
	                g2d.setColor(Color.decode("#00DC5C"));
	                g2d.fillRect(410, 216, 10, 110); 
	                g2d.setColor(Color.decode("#34FF8E"));
	                g2d.fillRect(410, 216, 2, 110); 
	                g2d.fillRect(426, 216, 1, 110); 
	                g2d.setColor(Color.decode("#00DC5C"));
	                g2d.fillRect(427, 216, 3, 110); 
	                //#354D34
	                g2d.setColor(Color.BLACK);
	                g2d.fillRect(470, 216, 9, 110); 
	                g2d.setColor(Color.decode("#354D34"));
	                g2d.fillRect(466, 216, 4, 110); 
	                g2d.setColor(Color.BLACK);
	                g2d.fillRect(480, 216, 5, 110); 
	                g2d.fillRect(485, 216, 5, 30); 
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(2));
	                g2d.drawRect(400, 215, 91, 30);
	                g2d.drawRect(406, 246, 79, 80);
	                
	                
	                //dinero
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(9, 180, 30, 30);
	                g2d.setColor(Color.decode("#FF9063"));
	                g2d.fillRect(10, 180, 30, 30);
	                //tornillo
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(12, 182, 1, 1);
	                g2d.drawRect(35, 182, 1, 1);
	                g2d.drawRect(12, 205, 1, 1);
	                g2d.drawRect(35, 205, 1, 1);

	                
	                //dinero2
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(90, 100, 30, 30);
	                g2d.setColor(Color.decode("#FF9063"));
	                g2d.fillRect(91, 100, 30, 30);
	                //tornillo
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(93, 102, 1, 1);
	                g2d.drawRect(116, 102, 1, 1);
	                g2d.drawRect(93, 125, 1, 1);
	                g2d.drawRect(116, 125, 1, 1);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.drawRect(124, 100, 30, 30);
	                g2d.setColor(Color.decode("#FF9063"));
	                g2d.fillRect(125, 100, 30, 30);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(128, 102, 1, 1);
	                g2d.drawRect(150, 102, 1, 1);
	                g2d.drawRect(128, 125, 1, 1);
	                g2d.drawRect(150, 125, 1, 1);
	                
	                
	                //cuadroverde
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.fillRect(562, 214, 110, 112);
	                ///
	                g2d.setColor(Color.decode("#51D96B"));
	                g2d.fillRect(565, 216, 110, 110);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(575, 305, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(575, 305, 15, 15);
	                ///
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(3));
	                g2d.drawOval(575, 222, 15, 15);
	                g2d.setColor(Color.decode("#B3BFC0"));
	                g2d.fillOval(575, 222, 15, 15);
	                
	                //dinero3
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(579, 100, 30, 30);
	                g2d.setColor(Color.decode("#FF9063"));
	                g2d.fillRect(580, 100, 30, 30);
	                //tornillos
	                g2d.setColor(Color.BLACK);
	                g2d.setStroke(new BasicStroke(4));
	                g2d.drawRect(583, 102, 1, 1);
	                g2d.drawRect(605, 102, 1, 1);
	                g2d.drawRect(583, 125, 1, 1);
	                g2d.drawRect(605, 125, 1, 1);
	                
	                //nubes
	                g2d.setColor(Color.decode("#F3F3F3"));
	                g2d.fillOval(0, -30, 200, 60);
	                g2d.fillOval(100, -15, 100, 30);
	                g2d.fillOval(190, -25, 300, 50);
	                g2d.fillOval(490, -25, 300, 50);


	                
	                //arbustos
	                g2d.setColor(Color.decode("#52D371"));
	                g2d.fillOval(0, 300, 50, 50);
	                g2d.fillOval(30, 300, 50, 50);
	                
	                //suelo
	                g2d.setColor(Color.BLACK);
	                g2d.setColor(Color.decode("#FBC5B6"));
	                g2d.fillRect(0, 328, 650, 35);
	                g2d.setColor(Color.decode("#3F3C3C"));
	                g2d.fillRect (0, 326, 650, 2);
	            }
		 };
		 pane.setBackground(Color.decode("#B3EEFE"));
		 pane.setSize(650,400);
         pane.setLocation(0,0);
         this.add(pane);
		
	}
	
	public void menuBar() {
		/*MENU*/
		JMenuBar menu =new JMenuBar();
		JMenu archivo =new JMenu("Cuenta");
		JMenuItem item =new JMenuItem("login");
		JMenuItem item1 =new JMenuItem("registro");
		JMenuItem item8 =new JMenuItem("recuperacion de cuenta");
		JMenu usuario =new JMenu("Usuarios");
		JMenuItem item2 =new JMenuItem("Alta");
		JMenuItem item4 =new JMenuItem("Consultar");
		JMenu Ayuda =new JMenu("Ayuda");
		JMenuItem item5 =new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem item6 =new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem item7 =new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		
		archivo.addSeparator();

		item1.addActionListener(e->{
			router("registro");
		});
		item.addActionListener(e->{
			router("login");
		});
		item8.addActionListener(e->{
			router("recuperacion de cuenta");
		});
		item5.addActionListener(e->{
			router("createAccount");
		});
		item6.addActionListener(e->{
			router("sistemAcces");
		});
		item7.addActionListener(e->{
			router("forgetPassword");
		});
		
		item2.addActionListener(e->{
			router("alta");
		});
		item4.addActionListener(e->{
			router("consultar");
		});
		
		archivo.add(item);
		archivo.add(item1);
		archivo.add(item8);
		usuario.add(item2);
		usuario.add(item4);
		Ayuda.add(item5);
		Ayuda.add(item6);
		Ayuda.add(item7);
		
		menu.add(Ayuda);
		menu.add(archivo);
		menu.add(usuario);
		this.setVisible(true);
		this.setJMenuBar(menu);
		this.add(menu);
		this.repaint();
	}
	
	public void ayudaAcceso() {

	    // ── Panel principal ───────────────────────────────────────────────────────
	    JPanel panelAyuda = new JPanel();
	    panelAyuda.setLayout(null);
	    panelAyuda.setBounds(0, 23, 600, 636);
	    panelAyuda.setBackground(Color.DARK_GRAY);

	    // ── Título de la ventana ──────────────────────────────────────────────────
	    JLabel lblTitulo = new JLabel(
	        "<html><div style='text-align:center;'>Ayuda – Acceso al Sistema</div></html>"
	    );
	    lblTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 22));
	    lblTitulo.setForeground(Color.WHITE);
	    lblTitulo.setBounds(0, 18, 600, 28);

	    // ── Descripción introductoria ─────────────────────────────────────────────
	    JLabel lblIntro = new JLabel(
	        "<html><div style='text-align:center;'>En esta ventana podrás iniciar sesión en el sistema.<br>"
	        + "A continuación se explica cómo utilizar cada campo del formulario.</div></html>"
	    );
	    lblIntro.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblIntro.setForeground(new Color(211, 211, 211));
	    lblIntro.setBounds(30, 52, 540, 40);

	    // ── Separador 1 ───────────────────────────────────────────────────────────
	    JLabel sep1 = new JLabel();
	    sep1.setOpaque(true);
	    sep1.setBackground(Color.GRAY);
	    sep1.setBounds(30, 100, 540, 2);

	    // ── Sección 1: Nombre de usuario ──────────────────────────────────────────
	    JLabel lblUsuarioTitulo = new JLabel(
	        "<html><div style='text-align:center;'>1. Nombre de Usuario</div></html>"
	    );
	    lblUsuarioTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblUsuarioTitulo.setForeground(Color.WHITE);
	    lblUsuarioTitulo.setBounds(0, 110, 600, 22);

	    JLabel lblUsuarioDesc = new JLabel(
	        "<html><div style='text-align:center;'>Introduce tu nombre de usuario registrado en el sistema.<br>"
	        + "El campo distingue entre mayúsculas y minúsculas, así que escríbelo<br>"
	        + "exactamente como fue creado durante el registro.</div></html>"
	    );
	    lblUsuarioDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblUsuarioDesc.setForeground(new Color(211, 211, 211));
	    lblUsuarioDesc.setBounds(30, 138, 540, 50);

	    // ── Separador 2 ───────────────────────────────────────────────────────────
	    JLabel sep2 = new JLabel();
	    sep2.setOpaque(true);
	    sep2.setBackground(Color.GRAY);
	    sep2.setBounds(30, 196, 540, 2);

	    // ── Sección 2: Contraseña ─────────────────────────────────────────────────
	    JLabel lblContraseniaTitulo = new JLabel(
	        "<html><div style='text-align:center;'>2. Contraseña</div></html>"
	    );
	    lblContraseniaTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblContraseniaTitulo.setForeground(Color.WHITE);
	    lblContraseniaTitulo.setBounds(0, 206, 600, 22);

	    JLabel lblContraseniaDesc = new JLabel(
	        "<html><div style='text-align:center;'>Escribe tu contraseña personal en este campo.<br>"
	        + "Los caracteres se ocultarán por seguridad. Asegúrate de no tener<br>"
	        + "activado el bloqueo de mayúsculas antes de introducirla.</div></html>"
	    );
	    lblContraseniaDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblContraseniaDesc.setForeground(new Color(211, 211, 211));
	    lblContraseniaDesc.setBounds(30, 234, 540, 50);

	    // ── Separador 3 ───────────────────────────────────────────────────────────
	    JLabel sep3 = new JLabel();
	    sep3.setOpaque(true);
	    sep3.setBackground(Color.GRAY);
	    sep3.setBounds(30, 292, 540, 2);

	    // ── Sección 3: Recordarme ─────────────────────────────────────────────────
	    JLabel lblRecordarTitulo = new JLabel(
	        "<html><div style='text-align:center;'>3. Recordarme</div></html>"
	    );
	    lblRecordarTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblRecordarTitulo.setForeground(Color.WHITE);
	    lblRecordarTitulo.setBounds(0, 302, 600, 22);

	    JLabel lblRecordarDesc = new JLabel(
	        "<html><div style='text-align:center;'>Activa esta casilla si deseas que el sistema recuerde<br>"
	        + "tus credenciales en este equipo. No se recomienda en ordenadores<br>"
	        + "compartidos o de uso público por razones de seguridad.</div></html>"
	    );
	    lblRecordarDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblRecordarDesc.setForeground(new Color(211, 211, 211));
	    lblRecordarDesc.setBounds(30, 330, 540, 50);

	    // ── Separador 4 ───────────────────────────────────────────────────────────
	    JLabel sep4 = new JLabel();
	    sep4.setOpaque(true);
	    sep4.setBackground(Color.GRAY);
	    sep4.setBounds(30, 388, 540, 2);

	    // ── Sección 4: ¿Olvidaste tu contraseña? ─────────────────────────────────
	    JLabel lblOlvideTitulo = new JLabel(
	        "<html><div style='text-align:center;'>4. ¿Olvidaste tu Contraseña?</div></html>"
	    );
	    lblOlvideTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblOlvideTitulo.setForeground(Color.WHITE);
	    lblOlvideTitulo.setBounds(0, 398, 600, 22);

	    JLabel lblOlvideDesc = new JLabel(
	        "<html><div style='text-align:center;'>Si no recuerdas tu contraseña, haz clic en el enlace<br>"
	        + "\"¿Olvidaste tu contraseña?\" para iniciar el proceso de recuperación.<br>"
	        + "Se te enviará un correo con instrucciones para restablecerla.</div></html>"
	    );
	    lblOlvideDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblOlvideDesc.setForeground(new Color(211, 211, 211));
	    lblOlvideDesc.setBounds(30, 426, 540, 50);

	    // ── Separador 5 ───────────────────────────────────────────────────────────
	    JLabel sep5 = new JLabel();
	    sep5.setOpaque(true);
	    sep5.setBackground(Color.GRAY);
	    sep5.setBounds(30, 484, 540, 2);

	    // ── Sección 5: Botón Aceptar ──────────────────────────────────────────────
	    JLabel lblAceptarTitulo = new JLabel(
	        "<html><div style='text-align:center;'>5. Botón Aceptar</div></html>"
	    );
	    lblAceptarTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblAceptarTitulo.setForeground(Color.WHITE);
	    lblAceptarTitulo.setBounds(0, 494, 600, 22);

	    JLabel lblAceptarDesc = new JLabel(
	        "<html><div style='text-align:center;'>Pulsa «Aceptar» una vez completados los campos para<br>"
	        + "verificar tus credenciales e iniciar sesión en el sistema.</div></html>"
	    );
	    lblAceptarDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblAceptarDesc.setForeground(new Color(211, 211, 211));
	    lblAceptarDesc.setBounds(30, 522, 540, 40);

	    // ── Separador visual blanco (antes del consejo de seguridad) ──────────────
	    JLabel sepTip = new JLabel();
	    sepTip.setOpaque(true);
	    sepTip.setBackground(Color.WHITE);
	    sepTip.setBounds(30, 570, 540, 2);

	    // ── Consejo de seguridad ──────────────────────────────────────────────────
	    JLabel lblConsejo = new JLabel(
	        "<html><div style='text-align:center;'>"
	        + "<b>Consejo de seguridad:</b> No compartas tu contraseña con nadie.<br>"
	        + "Cierra sesión siempre al terminar, especialmente en equipos compartidos.<br>"
	        + "Si sospechas que tu cuenta ha sido comprometida, cámbiala de inmediato."
	        + "</div></html>"
	    );
	    lblConsejo.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblConsejo.setForeground(new Color(211, 211, 211));
	    lblConsejo.setBounds(30, 578, 540, 50);

	    // ── Añadir todos los componentes al panel ─────────────────────────────────
	    panelAyuda.add(lblTitulo);
	    panelAyuda.add(lblIntro);
	    panelAyuda.add(sep1);
	    panelAyuda.add(lblUsuarioTitulo);
	    panelAyuda.add(lblUsuarioDesc);
	    panelAyuda.add(sep2);
	    panelAyuda.add(lblContraseniaTitulo);
	    panelAyuda.add(lblContraseniaDesc);
	    panelAyuda.add(sep3);
	    panelAyuda.add(lblRecordarTitulo);
	    panelAyuda.add(lblRecordarDesc);
	    panelAyuda.add(sep4);
	    panelAyuda.add(lblOlvideTitulo);
	    panelAyuda.add(lblOlvideDesc);
	    panelAyuda.add(sep5);
	    panelAyuda.add(lblAceptarTitulo);
	    panelAyuda.add(lblAceptarDesc);
	    panelAyuda.add(sepTip);
	    panelAyuda.add(lblConsejo);

	    // ── Adjuntar panel al contenedor padre y refrescar ────────────────────────
	    this.add(panelAyuda);
	    this.revalidate();
	    this.repaint();
	}
	
	public void router(String referencia) {
		
		this.getContentPane().removeAll();;
		menuBar();

		if(referencia.equals("registro")) {
			this.registro();
		}
		if(referencia.equals("users")) {
			this.users();
		}
		if(referencia.equals("login")) {
			this.login();
		}
		if(referencia.equals("recuperacion de cuenta")) {
			this.recuperacionDeCuenta();
		}
		
		if(referencia.equals("createAccount")) {
			this.ayudaCreacionUsuario();
		}
		if(referencia.equals("sistemAcces")) {
			this.ayudaAcceso();
		}
		if(referencia.equals("forgetPassword")) {
			this.recuperacionDeContrasena();
		}

		if(referencia.equals("alta")) {
			this.altaUsuario();
		}
		if(referencia.equals("consultar")) {
			this.consultaUsuario();
		}
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
		
	}
	
	public void recuperacionDeContrasena() {

	    // ── Configuración general de la ventana ──────────────────
	    this.getContentPane().removeAll();
	    this.setLayout(null);
	    this.setSize(600, 636);
	    this.setLocationRelativeTo(null);
	    //this.setResizable(false);

	    // ════════════════════════════════════════════════════════
	    //  PANEL IZQUIERDO  –  Formulario (DARK_GRAY, 600 x 636)
	    // ════════════════════════════════════════════════════════
	    JPanel panelForm = new JPanel();
	    panelForm.setLayout(null);
	    panelForm.setBackground(Color.DARK_GRAY);
	    panelForm.setBounds(0, 23, 600, 636);
	    this.add(panelForm);

	    // ── Título ───────────────────────────────────────────────
	    JLabel lblTitulo = new JLabel("< RECUPERAR CONTRASEÑA >");
	    lblTitulo.setFont(new Font("Arial", Font.ITALIC, 30));
	    lblTitulo.setForeground(Color.WHITE);
	    lblTitulo.setBounds(40, 30, 520, 45);
	    panelForm.add(lblTitulo);

	    // ── Instrucción ──────────────────────────────────────────
	    JLabel lblInstruccion = new JLabel("Ingresa tu correo para recibir un código de recuperación.");
	    lblInstruccion.setFont(new Font("Arial", Font.PLAIN, 13));
	    lblInstruccion.setForeground(Color.LIGHT_GRAY);
	    lblInstruccion.setBounds(40, 82, 520, 20);
	    panelForm.add(lblInstruccion);

	    // ── SECCIÓN 1: Correo / Usuario ─────────────────────────
	    JLabel lblCorreo = new JLabel("Correo o usuario:");
	    lblCorreo.setFont(new Font("Arial", Font.BOLD, 14));
	    lblCorreo.setForeground(Color.WHITE);
	    lblCorreo.setBounds(40, 120, 200, 20);
	    panelForm.add(lblCorreo);

	    JTextField txtCorreo = new JTextField();
	    txtCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
	    txtCorreo.setBackground(Color.DARK_GRAY);
	    txtCorreo.setForeground(Color.WHITE);
	    txtCorreo.setCaretColor(Color.WHITE);
	    txtCorreo.setBorder(new LineBorder(Color.WHITE, 2));
	    txtCorreo.setBounds(40, 145, 520, 35);
	    panelForm.add(txtCorreo);

	    // ── Botón "Enviar código" ───────────────────────────────
	    JButton btnEnviar = new JButton("Enviar código");
	    btnEnviar.setFont(new Font("Arial", Font.BOLD, 15));
	    btnEnviar.setForeground(Color.WHITE);
	    btnEnviar.setBackground(Color.DARK_GRAY);
	    btnEnviar.setBorder(new LineBorder(Color.WHITE, 6));
	    btnEnviar.setBounds(40, 198, 520, 40);
	    panelForm.add(btnEnviar);


	    // ── SECCIÓN 2: Código de recuperación ───────────────────
	    JLabel lblSeccion2 = new JLabel("Código de recuperación:");
	    lblSeccion2.setFont(new Font("Arial", Font.BOLD, 14));
	    lblSeccion2.setForeground(Color.WHITE);
	    lblSeccion2.setBounds(40, 270, 250, 20);
	    panelForm.add(lblSeccion2);

	    JTextField txtCodigo = new JTextField();
	    txtCodigo.setFont(new Font("Arial", Font.PLAIN, 14));
	    txtCodigo.setBackground(Color.DARK_GRAY);
	    txtCodigo.setForeground(Color.WHITE);
	    txtCodigo.setCaretColor(Color.WHITE);
	    txtCodigo.setBorder(new LineBorder(Color.WHITE, 2));
	    txtCodigo.setBounds(40, 295, 520, 35);
	    panelForm.add(txtCodigo);

	    // ── SECCIÓN 3: Nueva contraseña ─────────────────────────
	    JLabel lblNuevaPass = new JLabel("Nueva contraseña:");
	    lblNuevaPass.setFont(new Font("Arial", Font.BOLD, 14));
	    lblNuevaPass.setForeground(Color.WHITE);
	    lblNuevaPass.setBounds(40, 348, 200, 20);
	    panelForm.add(lblNuevaPass);

	    JPasswordField txtNuevaPass = new JPasswordField();
	    txtNuevaPass.setFont(new Font("Arial", Font.PLAIN, 14));
	    txtNuevaPass.setBackground(Color.DARK_GRAY);
	    txtNuevaPass.setForeground(Color.WHITE);
	    txtNuevaPass.setCaretColor(Color.WHITE);
	    txtNuevaPass.setBorder(new LineBorder(Color.WHITE, 2));
	    txtNuevaPass.setBounds(40, 373, 520, 35);
	    panelForm.add(txtNuevaPass);

	    // ── SECCIÓN 4: Confirmar nueva contraseña ───────────────
	    JLabel lblConfirmarPass = new JLabel("Confirmar nueva contraseña:");
	    lblConfirmarPass.setFont(new Font("Arial", Font.BOLD, 14));
	    lblConfirmarPass.setForeground(Color.WHITE);
	    lblConfirmarPass.setBounds(40, 426, 280, 20);
	    panelForm.add(lblConfirmarPass);

	    JPasswordField txtConfirmarPass = new JPasswordField();
	    txtConfirmarPass.setFont(new Font("Arial", Font.PLAIN, 14));
	    txtConfirmarPass.setBackground(Color.DARK_GRAY);
	    txtConfirmarPass.setForeground(Color.WHITE);
	    txtConfirmarPass.setCaretColor(Color.WHITE);
	    txtConfirmarPass.setBorder(new LineBorder(Color.WHITE, 2));
	    txtConfirmarPass.setBounds(40, 451, 520, 35);
	    panelForm.add(txtConfirmarPass);

	    // ── Botón "Actualizar contraseña" ───────────────────────
	    JButton btnActualizar = new JButton("Actualizar contraseña");
	    btnActualizar.setFont(new Font("Arial", Font.BOLD, 15));
	    btnActualizar.setForeground(Color.WHITE);
	    btnActualizar.setBackground(Color.DARK_GRAY);
	    btnActualizar.setBorder(new LineBorder(Color.WHITE, 6));
	    btnActualizar.setBounds(40, 505, 520, 40);
	    panelForm.add(btnActualizar);



	    // ════════════════════════════════════════════════════════
	    //  ACTION LISTENERS
	    // ════════════════════════════════════════════════════════

	    // ── Listener: Enviar código ─────────────────────────────
	    btnEnviar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String correo = txtCorreo.getText().trim();

	            if (correo.isEmpty()) {
	                // ✗ Campo vacío → borde ROJO
	                txtCorreo.setBorder(new LineBorder(Color.RED, 2));
	                JOptionPane.showMessageDialog(
	                        null,
	                        "Por favor ingresa tu correo o usuario.",
	                        "Campo requerido",
	                        JOptionPane.WARNING_MESSAGE);
	            } else {
	                // ✓ Campo correcto → borde VERDE
	                txtCorreo.setBorder(new LineBorder(Color.GREEN, 2));
	                JOptionPane.showMessageDialog(
	                        null,
	                        "Código de recuperación enviado a: " + correo,
	                        "Código enviado",
	                        JOptionPane.INFORMATION_MESSAGE);
	            }
	        }
	    });

	    // ── Listener: Actualizar contraseña ─────────────────────
	    btnActualizar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String codigo       = txtCodigo.getText().trim();
	            String nuevaPass    = new String(txtNuevaPass.getPassword()).trim();
	            String confirmaPass = new String(txtConfirmarPass.getPassword()).trim();

	            boolean valido = true;

	            // Validar código
	            if (codigo.isEmpty()) {
	                txtCodigo.setBorder(new LineBorder(Color.RED, 2));
	                valido = false;
	            } else {
	                txtCodigo.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            // Validar nueva contraseña
	            if (nuevaPass.isEmpty()) {
	                txtNuevaPass.setBorder(new LineBorder(Color.RED, 2));
	                valido = false;
	            } else {
	                txtNuevaPass.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            // Validar confirmación de contraseña
	            if (confirmaPass.isEmpty()) {
	                txtConfirmarPass.setBorder(new LineBorder(Color.RED, 2));
	                valido = false;
	            } else if (!nuevaPass.equals(confirmaPass)) {
	                // ✗ Las contraseñas no coinciden → ambas en ROJO
	                txtNuevaPass.setBorder(new LineBorder(Color.RED, 2));
	                txtConfirmarPass.setBorder(new LineBorder(Color.RED, 2));
	                JOptionPane.showMessageDialog(
	                        null,
	                        "Las contraseñas no coinciden. Inténtalo de nuevo.",
	                        "Error de validación",
	                        JOptionPane.ERROR_MESSAGE);
	                return;
	            } else {
	                txtConfirmarPass.setBorder(new LineBorder(Color.GREEN, 2));
	            }

	            if (!valido) {
	                JOptionPane.showMessageDialog(
	                        null,
	                        "Por favor completa todos los campos.",
	                        "Campos requeridos",
	                        JOptionPane.WARNING_MESSAGE);
	                return;
	            }

	            // ✓ Todo correcto
	            JOptionPane.showMessageDialog(
	                    null,
	                    "¡Contraseña actualizada con éxito! Ya puedes iniciar sesión.",
	                    "Éxito",
	                    JOptionPane.INFORMATION_MESSAGE);
	            login(); // Regresar al login
	        }
	    });

	    this.menuBar();
	    this.revalidate();
	    this.repaint();
	}
	
	public void altaUsuario() {

	    // ── 1. PANEL PRINCIPAL ────────────────────────────────────────
	    JPanel panelPrincipal = new JPanel();
	    panelPrincipal.setLayout(null);
	    panelPrincipal.setBackground(Color.DARK_GRAY);
	    panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 636));
	    panelPrincipal.setLocation(0, 23);

	    // ── 2. TÍTULO ─────────────────────────────────────────────────
	    JLabel lblTitulo = new JLabel("< ALTA DE USUARIO >");
	    lblTitulo.setFont(new Font("Arial", Font.ITALIC, 30));
	    lblTitulo.setForeground(Color.WHITE);
	    lblTitulo.setBounds(0, 55, 600, 45);
	    panelPrincipal.add(lblTitulo);

	    // ── 3. NOMBRE ─────────────────────────────────────────────────
	    JLabel lblNombre = new JLabel("Nombre");
	    lblNombre.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblNombre.setForeground(Color.WHITE);
	    lblNombre.setBounds(20, 120, 200, 20);
	    panelPrincipal.add(lblNombre);

	    JTextField txtNombre = new JTextField();
	    txtNombre.setFont(new Font("Arial", Font.BOLD, 16));
	    txtNombre.setBackground(Color.WHITE);
	    txtNombre.setBounds(20, 140, 550, 30);
	    panelPrincipal.add(txtNombre);

	    // ── 4. APELLIDO ───────────────────────────────────────────────
	    JLabel lblApellido = new JLabel("Apellido");
	    lblApellido.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblApellido.setForeground(Color.WHITE);
	    lblApellido.setBounds(20, 200, 200, 20);
	    panelPrincipal.add(lblApellido);

	    JTextField txtApellido = new JTextField();
	    txtApellido.setFont(new Font("Arial", Font.BOLD, 16));
	    txtApellido.setBackground(Color.WHITE);
	    txtApellido.setBounds(20, 220, 550, 30);
	    panelPrincipal.add(txtApellido);

	    // ── 5. NOMBRE DE USUARIO ──────────────────────────────────────
	    JLabel lblUsuario = new JLabel("Nombre de usuario");
	    lblUsuario.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblUsuario.setForeground(Color.WHITE);
	    lblUsuario.setBounds(20, 280, 250, 20);
	    panelPrincipal.add(lblUsuario);

	    JTextField txtUsuario = new JTextField();
	    txtUsuario.setFont(new Font("Arial", Font.BOLD, 16));
	    txtUsuario.setBackground(Color.WHITE);
	    txtUsuario.setBounds(20, 300, 550, 30);
	    panelPrincipal.add(txtUsuario);

	    // ── 6. CORREO ELECTRÓNICO ─────────────────────────────────────
	    JLabel lblCorreo = new JLabel("Correo electrónico");
	    lblCorreo.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblCorreo.setForeground(Color.WHITE);
	    lblCorreo.setBounds(20, 360, 250, 20);
	    panelPrincipal.add(lblCorreo);

	    JTextField txtCorreo = new JTextField();
	    txtCorreo.setFont(new Font("Arial", Font.BOLD, 16));
	    txtCorreo.setBackground(Color.WHITE);
	    txtCorreo.setBounds(20, 380, 550, 30);
	    panelPrincipal.add(txtCorreo);

	    // ── 7. CONTRASEÑA ─────────────────────────────────────────────
	    JLabel lblContrasena = new JLabel("Contraseña");
	    lblContrasena.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblContrasena.setForeground(Color.WHITE);
	    lblContrasena.setBounds(20, 440, 200, 20);
	    panelPrincipal.add(lblContrasena);

	    JPasswordField txtContrasena = new JPasswordField();
	    txtContrasena.setFont(new Font("Arial", Font.BOLD, 16));
	    txtContrasena.setBackground(Color.WHITE);
	    txtContrasena.setBounds(20, 460, 550, 30);
	    panelPrincipal.add(txtContrasena);

	    // ── 8. CONFIRMAR CONTRASEÑA ───────────────────────────────────
	    JLabel lblConfirmar = new JLabel("Confirmar contraseña");
	    lblConfirmar.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblConfirmar.setForeground(Color.WHITE);
	    lblConfirmar.setBounds(20, 510, 250, 20);
	    panelPrincipal.add(lblConfirmar);

	    JPasswordField txtConfirmar = new JPasswordField();
	    txtConfirmar.setFont(new Font("Arial", Font.BOLD, 16));
	    txtConfirmar.setBackground(Color.WHITE);
	    txtConfirmar.setBounds(20, 530, 550, 30);
	    panelPrincipal.add(txtConfirmar);

	    // ── 9. BOTÓN REGISTRAR ────────────────────────────────────────
	    JButton btnRegistrar = new JButton("Registrar");
	    btnRegistrar.setFont(new Font("Arial", Font.PLAIN, 16));
	    btnRegistrar.setForeground(Color.WHITE);
	    btnRegistrar.setBackground(Color.DARK_GRAY);
	    btnRegistrar.setBorder(new LineBorder(Color.WHITE, 6, false));
	    btnRegistrar.setFocusPainted(false);
	    btnRegistrar.setBounds(210, 590, 180, 50);
	    panelPrincipal.add(btnRegistrar);

	    //* ── 10. VENTANA PRINCIPAL ─────────────────────────────────────
	    /*
	    JFrame frame = new JFrame("Alta de Usuario");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(false);
	    frame.getContentPane().add(panelPrincipal);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    */
	    panelPrincipal.repaint();
	    panelPrincipal.revalidate();
	    this.add(panelPrincipal);
	}
	
	public void ayudaCreacionUsuario() {

	    // ── Panel principal ──────────────────────────────────────────────────────
	    JPanel panelAyuda = new JPanel();
	    panelAyuda.setLayout(null);
	    panelAyuda.setBackground(Color.DARK_GRAY);
	    panelAyuda.setBounds(0, 23, 600, 636);

	    // ── Título ───────────────────────────────────────────────────────────────
	    JLabel lblTitulo = new JLabel(
	        "<html><div style='text-align:center;'>&lt; AYUDA: CREAR USUARIO &gt;</div></html>"
	    );
	    lblTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
	    lblTitulo.setForeground(Color.WHITE);
	    lblTitulo.setBounds(160, 18, 500, 30);


	    // ── Texto introductorio ──────────────────────────────────────────────────
	    JLabel lblIntro = new JLabel(
	        "<html><div style='text-align:center; color:#D3D3D3;'>"
	        + "A continuación se describe cada campo requerido para dar de alta un nuevo usuario."
	        + "</div></html>"
	    );
	    lblIntro.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblIntro.setForeground(new Color(211, 211, 211));
	    lblIntro.setBounds(50, 35, 500, 35);

	    // ── Separador bajo el título ─────────────────────────────────────────────
	    JLabel sepTitulo = new JLabel();
	    sepTitulo.setOpaque(true);
	    sepTitulo.setBackground(Color.WHITE);
	    sepTitulo.setBounds(50, 60, 500, 2);
	    
	    // ════════════════════════════════════════════════════════════════════════
	    //  SECCIÓN 1 – Nombre
	    // ════════════════════════════════════════════════════════════════════════
	    JLabel lblNombreTitulo = new JLabel("Nombre");
	    lblNombreTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblNombreTitulo.setForeground(Color.WHITE);
	    lblNombreTitulo.setBounds(50, 75, 500, 20);

	    JLabel lblNombreDesc = new JLabel(
	        "<html><div style='color:#D3D3D3;'>"
	        + "Ingresa tu nombre de pila tal como aparece en tu identificación oficial. "
	        + "Solo se permiten letras (sin números ni caracteres especiales). "
	        + "Mínimo 2 caracteres, máximo 50."
	        + "</div></html>"
	    );
	    lblNombreDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblNombreDesc.setForeground(new Color(211, 211, 211));
	    lblNombreDesc.setBounds(50, 88, 500, 45);

	    JLabel sepNombre = new JLabel();
	    sepNombre.setOpaque(true);
	    sepNombre.setBackground(Color.GRAY);
	    sepNombre.setBounds(50, 128, 500, 2);

	    // ════════════════════════════════════════════════════════════════════════
	    //  SECCIÓN 2 – Apellido
	    // ════════════════════════════════════════════════════════════════════════
	    JLabel lblApellidoTitulo = new JLabel("Apellido");
	    lblApellidoTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblApellidoTitulo.setForeground(Color.WHITE);
	    lblApellidoTitulo.setBounds(50, 137, 500, 20);

	    JLabel lblApellidoDesc = new JLabel(
	        "<html><div style='color:#D3D3D3;'>"
	        + "Ingresa tu apellido paterno (y materno si lo deseas). "
	        + "Solo se permiten letras y espacios. "
	        + "Mínimo 2 caracteres, máximo 50."
	        + "</div></html>"
	    );
	    lblApellidoDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblApellidoDesc.setForeground(new Color(211, 211, 211));
	    lblApellidoDesc.setBounds(50, 150, 500, 45);

	    JLabel sepApellido = new JLabel();
	    sepApellido.setOpaque(true);
	    sepApellido.setBackground(Color.GRAY);
	    sepApellido.setBounds(50, 200, 500, 2);

	    // ════════════════════════════════════════════════════════════════════════
	    //  SECCIÓN 3 – Nombre de usuario
	    // ════════════════════════════════════════════════════════════════════════
	    JLabel lblUsernameTitulo = new JLabel("Nombre de usuario");
	    lblUsernameTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblUsernameTitulo.setForeground(Color.WHITE);
	    lblUsernameTitulo.setBounds(50, 215, 500, 20);

	    JLabel lblUsernameDesc = new JLabel(
	        "<html><div style='color:#D3D3D3;'>"
	        + "Elige un nombre de usuario único que te identifique en el sistema. "
	        + "Puede contener letras, números y guiones bajos ( _ ). "
	        + "Mínimo 4 caracteres, máximo 20. No debe estar en uso."
	        + "</div></html>"
	    );
	    lblUsernameDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblUsernameDesc.setForeground(new Color(211, 211, 211));
	    lblUsernameDesc.setBounds(50, 232, 500, 50);

	    JLabel sepUsername = new JLabel();
	    sepUsername.setOpaque(true);
	    sepUsername.setBackground(Color.GRAY);
	    sepUsername.setBounds(50, 280, 500, 2);

	    // ════════════════════════════════════════════════════════════════════════
	    //  SECCIÓN 4 – Correo electrónico
	    // ════════════════════════════════════════════════════════════════════════
	    JLabel lblCorreoTitulo = new JLabel("Correo electrónico");
	    lblCorreoTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblCorreoTitulo.setForeground(Color.WHITE);
	    lblCorreoTitulo.setBounds(50, 295, 500, 20);

	    JLabel lblCorreoDesc = new JLabel(
	        "<html><div style='color:#D3D3D3;'>"
	        + "Proporciona una dirección de correo válida (ejemplo: usuario@dominio.com). "
	        + "Se utilizará para notificaciones y recuperación de contraseña. "
	        + "Debe ser única en el sistema."
	        + "</div></html>"
	    );
	    lblCorreoDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblCorreoDesc.setForeground(new Color(211, 211, 211));
	    lblCorreoDesc.setBounds(50, 310, 500, 50);

	    JLabel sepCorreo = new JLabel();
	    sepCorreo.setOpaque(true);
	    sepCorreo.setBackground(Color.GRAY);
	    sepCorreo.setBounds(50, 360, 500, 2);

	    // ════════════════════════════════════════════════════════════════════════
	    //  SECCIÓN 5 – Contraseña
	    // ════════════════════════════════════════════════════════════════════════
	    JLabel lblPasswordTitulo = new JLabel("Contraseña");
	    lblPasswordTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblPasswordTitulo.setForeground(Color.WHITE);
	    lblPasswordTitulo.setBounds(50, 375, 500, 20);

	    JLabel lblPasswordDesc = new JLabel(
	        "<html><div style='color:#D3D3D3;'>"
	        + "Crea una contraseña segura. Debe contener al menos 8 caracteres, "
	        + "una letra mayúscula, una letra minúscula, un número y un carácter especial "
	        + "(por ejemplo: ! @ # $ %). Máximo 30 caracteres."
	        + "</div></html>"
	    );
	    lblPasswordDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblPasswordDesc.setForeground(new Color(211, 211, 211));
	    lblPasswordDesc.setBounds(50, 390, 500, 50);

	    JLabel sepPassword = new JLabel();
	    sepPassword.setOpaque(true);
	    sepPassword.setBackground(Color.GRAY);
	    sepPassword.setBounds(50, 445, 500, 2);

	    // ════════════════════════════════════════════════════════════════════════
	    //  SECCIÓN 6 – Confirmar contraseña
	    // ════════════════════════════════════════════════════════════════════════
	    JLabel lblConfirmTitulo = new JLabel("Confirmar contraseña");
	    lblConfirmTitulo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	    lblConfirmTitulo.setForeground(Color.WHITE);
	    lblConfirmTitulo.setBounds(50, 455, 500, 20);

	    JLabel lblConfirmDesc = new JLabel(
	        "<html><div style='color:#D3D3D3;'>"
	        + "Vuelve a ingresar la misma contraseña del campo anterior. "
	        + "Ambas contraseñas deben coincidir exactamente para que el registro sea exitoso."
	        + "</div></html>"
	    );
	    lblConfirmDesc.setFont(new Font("Arial", Font.ITALIC, 12));
	    lblConfirmDesc.setForeground(new Color(211, 211, 211));
	    lblConfirmDesc.setBounds(50, 470, 500, 45);

	    JLabel sepConfirm = new JLabel();
	    sepConfirm.setOpaque(true);
	    sepConfirm.setBackground(Color.GRAY);
	    sepConfirm.setBounds(50, 515, 500, 2);

	    // ── Consejo final ────────────────────────────────────────────────────────
	    JLabel lblConsejo = new JLabel(
	        "<html><div style='text-align:center; color:#D3D3D3;'>"
	        + "&#128274; Tip: Nunca compartas tu contraseña con nadie."
	        + "</div></html>"
	    );
	    lblConsejo.setFont(new Font("Arial", Font.ITALIC, 11));
	    lblConsejo.setForeground(new Color(211, 211, 211));
	    lblConsejo.setBounds(160, 535, 500, 20);

	    // ── Agregar componentes al panel ─────────────────────────────────────────
	    panelAyuda.add(lblTitulo);
	    panelAyuda.add(sepTitulo);
	    panelAyuda.add(lblIntro);

	    panelAyuda.add(lblNombreTitulo);
	    panelAyuda.add(lblNombreDesc);
	    panelAyuda.add(sepNombre);

	    panelAyuda.add(lblApellidoTitulo);
	    panelAyuda.add(lblApellidoDesc);
	    panelAyuda.add(sepApellido);

	    panelAyuda.add(lblUsernameTitulo);
	    panelAyuda.add(lblUsernameDesc);
	    panelAyuda.add(sepUsername);

	    panelAyuda.add(lblCorreoTitulo);
	    panelAyuda.add(lblCorreoDesc);
	    panelAyuda.add(sepCorreo);

	    panelAyuda.add(lblPasswordTitulo);
	    panelAyuda.add(lblPasswordDesc);
	    panelAyuda.add(sepPassword);

	    panelAyuda.add(lblConfirmTitulo);
	    panelAyuda.add(lblConfirmDesc);
	    panelAyuda.add(sepConfirm);

	    panelAyuda.add(lblConsejo);

	    // ── Agregar panel al contenedor padre (this = ventana/frame actual) ──────
	    this.add(panelAyuda);
	    this.revalidate();
	    this.repaint();
	}
	
	public void consultaUsuario() {

	    // ── Panel principal ──────────────────────
	    JPanel contenedor = new JPanel();
	    contenedor.setLayout(null);
	    contenedor.setBackground(Color.DARK_GRAY);
	    contenedor.setBounds(0, 23, 600, 636);
	    this.add(contenedor);

	    // ── Título ───────────────────────────────
	    JLabel lblTitulo = new JLabel("< CONSULTA DE USUARIO >");
	    lblTitulo.setFont(new Font("Arial", Font.ITALIC, 30));
	    lblTitulo.setForeground(Color.WHITE);
	    lblTitulo.setBounds(0, 30, 600, 50);
	    contenedor.add(lblTitulo);

	    // ── Sección de búsqueda ──────────────────
	    JLabel lblBuscar = new JLabel("Buscar usuario");
	    lblBuscar.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblBuscar.setForeground(Color.WHITE);
	    lblBuscar.setBounds(25, 110, 200, 25);
	    contenedor.add(lblBuscar);

	    JTextField txtBuscar = new JTextField();
	    txtBuscar.setFont(new Font("Arial", Font.BOLD, 16));
	    txtBuscar.setBackground(Color.WHITE);
	    txtBuscar.setBounds(25, 138, 550, 35);
	    contenedor.add(txtBuscar);

	    // ── Botón Buscar ─────────────────────────
	    JButton btnBuscar = new JButton("Buscar");
	    btnBuscar.setFont(new Font("Arial", Font.PLAIN, 16));
	    btnBuscar.setForeground(Color.WHITE);
	    btnBuscar.setBackground(Color.DARK_GRAY);
	    btnBuscar.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 6, false));
	    btnBuscar.setFocusPainted(false);
	    btnBuscar.setBounds(225, 190, 150, 40);
	    contenedor.add(btnBuscar);

	    // ── Sección de resultados ────────────────
	    JLabel lblNombreText = new JLabel("Nombre");
	    lblNombreText.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblNombreText.setForeground(Color.WHITE);
	    lblNombreText.setBounds(25, 260, 200, 25);
	    contenedor.add(lblNombreText);

	    JTextField txtNombre = new JTextField();
	    txtNombre.setFont(new Font("Arial", Font.BOLD, 16));
	    txtNombre.setBackground(Color.WHITE);
	    txtNombre.setEditable(false);
	    txtNombre.setBounds(25, 288, 550, 35);
	    contenedor.add(txtNombre);

	    JLabel lblApellidoText = new JLabel("Apellido");
	    lblApellidoText.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblApellidoText.setForeground(Color.WHITE);
	    lblApellidoText.setBounds(25, 340, 200, 25);
	    contenedor.add(lblApellidoText);

	    JTextField txtApellido = new JTextField();
	    txtApellido.setFont(new Font("Arial", Font.BOLD, 16));
	    txtApellido.setBackground(Color.WHITE);
	    txtApellido.setEditable(false);
	    txtApellido.setBounds(25, 368, 550, 35);
	    contenedor.add(txtApellido);

	    JLabel lblUsuarioText = new JLabel("Nombre de usuario");
	    lblUsuarioText.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblUsuarioText.setForeground(Color.WHITE);
	    lblUsuarioText.setBounds(25, 420, 200, 25);
	    contenedor.add(lblUsuarioText);

	    JTextField txtUsuario = new JTextField();
	    txtUsuario.setFont(new Font("Arial", Font.BOLD, 16));
	    txtUsuario.setBackground(Color.WHITE);
	    txtUsuario.setEditable(false);
	    txtUsuario.setBounds(25, 448, 550, 35);
	    contenedor.add(txtUsuario);

	    JLabel lblCorreoText = new JLabel("Correo electrónico");
	    lblCorreoText.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblCorreoText.setForeground(Color.WHITE);
	    lblCorreoText.setBounds(25, 500, 220, 25);
	    contenedor.add(lblCorreoText);

	    JTextField txtCorreo = new JTextField();
	    txtCorreo.setFont(new Font("Arial", Font.BOLD, 16));
	    txtCorreo.setBackground(Color.WHITE);
	    txtCorreo.setEditable(false);
	    txtCorreo.setBounds(25, 528, 550, 35);
	    contenedor.add(txtCorreo);

	    JLabel lblEstadoText = new JLabel("Estado de la cuenta");
	    lblEstadoText.setFont(new Font("Arial", Font.ITALIC, 15));
	    lblEstadoText.setForeground(Color.WHITE);
	    lblEstadoText.setBounds(25, 578, 220, 25);
	    contenedor.add(lblEstadoText);

	    JTextField txtEstado = new JTextField();
	    txtEstado.setFont(new Font("Arial", Font.BOLD, 16));
	    txtEstado.setBackground(Color.WHITE);
	    txtEstado.setEditable(false);
	    txtEstado.setBounds(25, 606, 550, 35);
	    contenedor.add(txtEstado);

	    // ── Actualizar contenedor ────────────────
	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void examen() {
		
		JPanel examen = new JPanel();
		examen.setSize(600, 650);
		examen.setLocation(0, 0);
		examen.setBackground(Color.white);
		examen.setLayout(new BorderLayout());
		this.add(examen);
		
		///////////////////
		JPanel titulo=new JPanel(new BorderLayout());
		titulo.setBackground(Color.decode("#006699"));
		examen.add(titulo,BorderLayout.NORTH);
		
		JLabel titulo1 =new JLabel("  Factura en java - NeatBeans - ArrayList y POO                       ");
		titulo1.setPreferredSize(new Dimension(200,50));
		titulo1.setFont(new Font("Arial",Font.PLAIN,20));
		titulo1.setForeground(Color.WHITE);
		titulo.add(titulo1,BorderLayout.NORTH);
		
		JLabel titulo2 =new JLabel("  [Sin Base de datos]                      ");
		titulo2.setPreferredSize(new Dimension(200,30));
		titulo2.setFont(new Font("Arial",Font.PLAIN,16));
		titulo2.setForeground(Color.WHITE);
		titulo.add(titulo2,BorderLayout.CENTER);
		
		//////////////	
		JPanel abajo=new JPanel(new BorderLayout());
		abajo.setPreferredSize(new Dimension(0,15));
		abajo.setBackground(Color.decode("#006699"));
		examen.add(abajo,BorderLayout.SOUTH);
		/////////////
		
		JPanel centro=new JPanel(new BorderLayout());
		examen.add(centro,BorderLayout.CENTER);
		/////////////
		
		JPanel centro_arriba = new JPanel();
		centro_arriba.setLayout(null);
		centro_arriba.setBackground(Color.WHITE);
		centro_arriba.setPreferredSize(new Dimension(600, 525)); 
		centro.add(centro_arriba, BorderLayout.NORTH);

		JLabel datosdelcliente = new JLabel("Datos del cliente");
		datosdelcliente.setBounds(20, 10, 145, 14);
		datosdelcliente.setFont(new Font("Arial", Font.BOLD, 14));
		datosdelcliente.setForeground(Color.BLACK);
		datosdelcliente.setBackground(Color.white);
		centro_arriba.add(datosdelcliente);
		
		////////////////////////
		JPanel panelDatosCliente = new JPanel();
		panelDatosCliente.setLayout(null); 
		panelDatosCliente.setBounds(25, 25, 550, 70); 
		panelDatosCliente.setBackground(null);
		panelDatosCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); 
		centro_arriba.add(panelDatosCliente);
		///
		JLabel documento = new JLabel("Documento:");
		documento.setBounds(20, 10, 145, 14);
		documento.setFont(new Font("Arial", Font.PLAIN, 14));
		documento.setForeground(Color.BLACK);
		documento.setBackground(Color.white);
		panelDatosCliente.add(documento);
		
		JTextField documento1 = new JTextField("123456");
		documento1.setBounds(100, 10, 145, 14);
		documento1.setPreferredSize(new Dimension(20, 14)); 
		documento1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
		documento1.setFont(new Font("Arial", Font.PLAIN, 14));
		documento1.setForeground(Color.BLACK);
		documento1.setBackground(Color.white);
		panelDatosCliente.add(documento1);
		
		JLabel nombres = new JLabel("Nombres:");
		nombres.setBounds(275, 10, 145, 14);
		nombres.setFont(new Font("Arial", Font.PLAIN, 14));
		nombres.setForeground(Color.BLACK);
		nombres.setBackground(Color.white);
		panelDatosCliente.add(nombres);
		
		JTextField nombres1 = new JTextField("Jhon Doe");
		nombres1.setBounds(350, 10, 145, 14);
		nombres1.setPreferredSize(new Dimension(20, 14)); 
		nombres1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
		nombres1.setFont(new Font("Arial", Font.PLAIN, 14));
		nombres1.setForeground(Color.BLACK);
		nombres1.setBackground(Color.white);
		panelDatosCliente.add(nombres1);
		//
		JLabel direccion = new JLabel("Direccion:");
		direccion.setBounds(20, 40, 145, 14);
		direccion.setFont(new Font("Arial", Font.PLAIN, 14));
		direccion.setForeground(Color.BLACK);
		direccion.setBackground(Color.white);
		panelDatosCliente.add(direccion);
		
		JTextField direccion1 = new JTextField("Calle #1 123");
		direccion1.setBounds(100, 40, 145, 14);
		direccion1.setPreferredSize(new Dimension(20, 14)); 
		direccion1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
		direccion1.setFont(new Font("Arial", Font.PLAIN, 14));
		direccion1.setForeground(Color.BLACK);
		direccion1.setBackground(Color.white);
		panelDatosCliente.add(direccion1);
		
		JLabel telefono = new JLabel("Teléfono:");
		telefono.setBounds(275, 40, 145, 14);
		telefono.setFont(new Font("Arial", Font.PLAIN, 14));
		telefono.setForeground(Color.BLACK);
		telefono.setBackground(Color.white);
		panelDatosCliente.add(telefono);
		
		JTextField telefono1 = new JTextField("5554433");
		telefono1.setBounds(350, 40, 145, 14);
		telefono1.setPreferredSize(new Dimension(20, 14)); 
		telefono1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
		telefono1.setFont(new Font("Arial", Font.PLAIN, 14));
		telefono1.setForeground(Color.BLACK);
		telefono1.setBackground(Color.white);
		panelDatosCliente.add(telefono1);
		/////////////////////////////////////
		
		JLabel datosdelfactura = new JLabel("Datos de factura");
		datosdelfactura.setBounds(20, 110, 145, 14);
		datosdelfactura.setFont(new Font("Arial", Font.BOLD, 14));
		datosdelfactura.setForeground(Color.gray);
		datosdelfactura.setBackground(Color.white);
		centro_arriba.add(datosdelfactura);
		
		////////////////////////
		JPanel paneldatosdelfactura = new JPanel();
		paneldatosdelfactura.setLayout(null); 
		paneldatosdelfactura.setBounds(25, 130, 550, 70); 
		paneldatosdelfactura.setBackground(null);
		paneldatosdelfactura.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); 
		centro_arriba.add(paneldatosdelfactura);
		///
		JLabel NFactura = new JLabel("N#Factura:");
		NFactura.setBounds(20, 25, 145, 14);
		NFactura.setFont(new Font("Arial", Font.PLAIN, 17));
		NFactura.setForeground(Color.gray);
		NFactura.setBackground(Color.white);
		paneldatosdelfactura.add(NFactura);
		JLabel numerodefactura = new JLabel("1");
		numerodefactura.setBounds(140, 25, 145, 14);
		numerodefactura.setFont(new Font("Arial", Font.BOLD, 17));
		numerodefactura.setForeground(Color.gray);
		numerodefactura.setBackground(Color.white);
		paneldatosdelfactura.add(numerodefactura);
		
		JLabel fecha = new JLabel("Fecha:");
		fecha.setBounds(300, 25, 145, 14);
		fecha.setFont(new Font("Arial", Font.PLAIN, 17));
		fecha.setForeground(Color.gray);
		fecha.setBackground(Color.white);
		paneldatosdelfactura.add(fecha);
		JLabel fechanumero = new JLabel("2026/03/22");
		fechanumero.setBounds(370, 25, 145, 14);
		fechanumero.setFont(new Font("Arial", Font.BOLD, 17));
		fechanumero.setForeground(Color.gray);
		fechanumero.setBackground(Color.white);
		paneldatosdelfactura.add(fechanumero);
		//////////////////////////////////////////
		JLabel verlistadodefacturas = new JLabel("Ver listado de facturas");
		verlistadodefacturas.setBounds(80, 232, 180, 14);
		verlistadodefacturas.setFont(new Font("Arial", Font.BOLD, 14));
		verlistadodefacturas.setForeground(Color.gray);
		verlistadodefacturas.setBackground(Color.white);
		centro_arriba.add(verlistadodefacturas);
		JPanel cuadroverlistadodefacturas = new JPanel();
		cuadroverlistadodefacturas.setLayout(null); 
		cuadroverlistadodefacturas.setBounds(25, 220, 550, 40); 
		cuadroverlistadodefacturas.setBackground(null);
		cuadroverlistadodefacturas.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); 
		centro_arriba.add(cuadroverlistadodefacturas);
		//////////////////////////////////////////////////////
		///
		Object [] table_head= {"Producto","Cantidad","Valor","Subtotal"};
		
		Object [][] table_content = {
			    {"Agua","2","500","1000.0","92.5"},
			    {"Cereal","5","100","5000.0","88.3"},
			    {"Leche","2","300","2","600.0"}
		};
		
		JTable users_table =new JTable(table_content,table_head);
		users_table.setSize(550,150);
		users_table.setLocation(30,275);
		centro_arriba.add(users_table);
		
		JScrollPane scrollPane =new JScrollPane(users_table);
		scrollPane.setLocation(25,275);
		scrollPane.setSize(550,100);
		centro_arriba.add(scrollPane);
		
		//////////////////////////////////////////////////////////
		
		JLabel subtotal = new JLabel("SubTotal: ");
		subtotal.setBounds(25, 385, 145, 14);
		subtotal.setFont(new Font("Arial", Font.PLAIN, 14));
		subtotal.setForeground(Color.darkGray);
		subtotal.setBackground(Color.white);
		centro_arriba.add(subtotal);
		JLabel Descuento = new JLabel("% Descuento: ");
		Descuento.setBounds(25, 410, 145, 14);
		Descuento.setFont(new Font("Arial", Font.PLAIN, 14));
		Descuento.setForeground(Color.darkGray);
		Descuento.setBackground(Color.white);
		centro_arriba.add(Descuento);
		JLabel iva = new JLabel("IVA 19%: ");
		iva.setBounds(25, 435, 145, 14);
		iva.setFont(new Font("Arial", Font.PLAIN, 14));
		iva.setForeground(Color.darkGray);
		iva.setBackground(Color.white);
		centro_arriba.add(iva);
		JLabel totalfactura = new JLabel("Total Factura");
		totalfactura.setBounds(25, 460, 145, 14);
		totalfactura.setFont(new Font("Arial", Font.PLAIN, 14));
		totalfactura.setForeground(Color.darkGray);
		totalfactura.setBackground(Color.white);
		centro_arriba.add(totalfactura);
		
		///////////////////////////////////////////////////////////////
		
		JLabel subtotalc = new JLabel("6600.0");
		subtotalc.setBounds(140, 385, 145, 14);
		subtotalc.setFont(new Font("Arial", Font.BOLD, 14));
		subtotalc.setForeground(Color.BLACK);
		subtotalc.setBackground(Color.white);
		centro_arriba.add(subtotalc);
		JTextField Descuentoc = new JTextField("5");
		Descuentoc.setBounds(140, 410, 20, 15);
		Descuentoc.setFont(new Font("Arial", Font.BOLD, 14));
		Descuentoc.setForeground(Color.darkGray);
		Descuentoc.setBackground(Color.white);
		centro_arriba.add(Descuentoc);
		JLabel ivac = new JLabel("1254.0");
		ivac.setBounds(140, 435, 145, 14);
		ivac.setFont(new Font("Arial", Font.BOLD, 14));
		ivac.setForeground(Color.darkGray);
		ivac.setBackground(Color.white);
		centro_arriba.add(ivac);
		JLabel totalfacturac = new JLabel("7524.0");
		totalfacturac.setBounds(140, 460, 145, 14);
		totalfacturac.setFont(new Font("Arial", Font.BOLD, 14));
		totalfacturac.setForeground(Color.darkGray);
		totalfacturac.setBackground(Color.white);
		centro_arriba.add(totalfacturac);
		////////
		JCheckBox checkBox = new JCheckBox();
		checkBox.setBounds(200, 388, 30, 55); 
		checkBox.setForeground(Color.BLACK);
		checkBox.setBackground(Color.WHITE);
		centro_arriba.add(checkBox);
		///////
		JLabel vdescontado = new JLabel("Valor descontado: ");
		vdescontado.setBounds(240, 410, 145, 14);
		vdescontado.setFont(new Font("Arial", Font.PLAIN, 14));
		vdescontado.setForeground(Color.darkGray);
		vdescontado.setBackground(Color.white);
		centro_arriba.add(vdescontado);
		JLabel vdescontadot = new JLabel("330.0");
		vdescontadot.setBounds(380, 410, 145, 14);
		vdescontadot.setFont(new Font("Arial", Font.BOLD, 14));
		vdescontadot.setForeground(Color.darkGray);
		vdescontadot.setBackground(Color.white);
		centro_arriba.add(vdescontadot);
		///////////////////////////////////////////////////////////////////////////
		
		ImageIcon icono1 = new ImageIcon("añadir.png");
		JButton boton = new JButton("Añadir", icono1);
		boton.setBounds(310, 2, 100, 35);
		boton.setBackground(null);
		boton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); 
		cuadroverlistadodefacturas.add(boton);
		
		ImageIcon icono2 = new ImageIcon("eliminar3.png");
		JButton boton2 = new JButton("Eliminar", icono2);
		boton2.setBounds(420, 2, 100, 35);
		boton2.setBackground(null);
		boton2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); 
		cuadroverlistadodefacturas.add(boton2);
	
		ImageIcon img = new ImageIcon("lista1.png");
		JButton listas = new JButton(img);
		listas.setBounds(7, 2, 50, 35);
		listas.setBackground(null);
		listas.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); 
		listas.setEnabled(false);
		cuadroverlistadodefacturas.add(listas);
		
		/////////////////////////////////////
		JButton finalizar = new JButton("Finalizar factura");
		finalizar.setBounds(310, 480, 150, 35);
		finalizar.setFont(new Font("Arial", Font.BOLD, 14));
		finalizar.setBackground(Color.decode("#E5F1FB"));
		finalizar.setBorder(BorderFactory.createLineBorder(Color.decode("#5FA7E1"), 1)); 
		centro_arriba.add(finalizar);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.setBounds(480, 480, 80, 35);
		limpiar.setFont(new Font("Arial", Font.BOLD, 14));
		limpiar.setBackground(Color.decode("#E1E1E1"));
		limpiar.setBorder(BorderFactory.createLineBorder(Color.decode("#C2C2C2"), 1)); 
		centro_arriba.add(limpiar);
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
		
		
	}


	
	
	
	
	
	
	
	
}
