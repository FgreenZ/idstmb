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
		
		this.setSize(650, 400);
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
		JMenuBar menu =new JMenuBar();
		JMenu archivo =new JMenu("Archivo");
		JMenuItem item =new JMenuItem("abrir");
		JMenuItem item1 =new JMenuItem("cerrar");
		JMenuItem item2 =new JMenuItem("Guardar");
		JMenuItem item3 =new JMenuItem("eliminar ");
		JMenuItem item4 =new JMenuItem("nuevo");
		
		archivo.addSeparator();
		
		JMenu submenu =new JMenu("Otro");
		JMenuItem item6 =new JMenuItem("quejas");
		JMenuItem item7 =new JMenuItem("contactanos");
		submenu.add(item6);
		submenu.add(item7);
		
		archivo.add(item);
		archivo.add(item1);
		archivo.add(item2);
		archivo.add(item3);
		archivo.add(item4);
		archivo.add(submenu);
		
		//menu.add(archivo);
		this.setVisible(true);
		//this.setJMenuBar(menu);
		//this.add(menu);
		this.repaint();
	}
	
	public void login() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.DARK_GRAY);
		contenedor.setSize(600,554);
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
		register_conteneiner.setLocation(600,0);
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
  		accederB.setSize(500, 90);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
