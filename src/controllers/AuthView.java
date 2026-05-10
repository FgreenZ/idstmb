package controllers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import models.AuthModel;

public class AuthView extends JFrame{
	
	/*CONSTRUCTOR*/
	public  AuthView() {
		this.setSize(600, 636);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);
		//this.setMinimumSize(new Dimension(1200,600));
		//this.setMaximumSize(new Dimension(1200,600));
		setTitle("Calculadora");
		setLocation(100,100);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
	    ImageIcon icono = new ImageIcon("icono.png");
	    setIconImage(icono.getImage());
	}
	
	/*VISTAS*/
	public void altaUsuario() {
		borrar();
		JFrame ventana=new JFrame();
		ventana.setSize(600, 710);
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
		
	    // ── 1. PANEL PRINCIPAL ────────────────────────────────────────
	    JPanel panelPrincipal = new JPanel();
	    panelPrincipal.setLayout(null);
	    panelPrincipal.setBackground(Color.DARK_GRAY);
	    panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 636));
	    panelPrincipal.setLocation(0, 23);
	    ventana.add(panelPrincipal);

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
	    btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre =lblNombre.getText()+" "+lblApellido.getText();
				String contraseña =lblContrasena.getText();
				String correo =lblCorreo.getText();
				AuthModel x=new AuthModel();
				x.registro(nombre, correo, contraseña);

				
			}
		});
	    panelPrincipal.add(btnRegistrar);

	    ventana.setVisible(true);
	    panelPrincipal.setVisible(true);
	    panelPrincipal.repaint();
	    panelPrincipal.revalidate();
	   
	}
	
	public void login() {

		borrar();

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
		acceder.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String contraseña_ingresada = new String(contraseña.getPassword());
		        
		        AuthModel modelo = new AuthModel();
		        
		        boolean accesoConcedido = modelo.acces(username.getText(), contraseña_ingresada);

		        if(accesoConcedido) {
		            contraseña.setBorder(new LineBorder(Color.GREEN, 4));
		            username.setBorder(new LineBorder(Color.GREEN, 4));
		            JOptionPane.showMessageDialog(
		                    null, 
		                    "Ingresando al sistema...", 
		                    "Inicio de sesion", 
		                    JOptionPane.INFORMATION_MESSAGE
		            );
		             users(); 
		            
		        } else {
		            contraseña.setBorder(new LineBorder(Color.RED, 4));
		            username.setBorder(new LineBorder(Color.RED, 4));
		            JOptionPane.showMessageDialog(
		                    null, 
		                    "Contraseña o usuario incorrectos", 
		                    "Error", 
		                    JOptionPane.ERROR_MESSAGE 
		            );
		        }
		        
		    }
		});
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
			this.dispose();
			altaUsuario();
		});
		contenedor.add(no_cuenta);
		

		
		
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
		
		this.setVisible(true);
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void users() {
		borrar();
		setSize(1000, 636);

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
		ArrayList<String[]> table_users =new ArrayList<>();
		UserController dbUsers =new UserController();
		table_users=dbUsers.usersData();
		Object[][] table_content = new Object[table_users.size()][];
		Object [] table_head= {"id","username","password","nombre completo","correo"};
        for (int i = 0; i < table_users.size(); i++) {
        	table_content[i] = table_users.get(i);
        }

		
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
	
	/*AUXILIARES*/
	public void borrar() {
		this.getContentPane().removeAll();
		this.repaint();
		this.revalidate();
	}
	
}

