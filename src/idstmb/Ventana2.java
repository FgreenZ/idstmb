package idstmb;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import java.awt.Point;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.ScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.DefaultComboBoxModel;

public class Ventana2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBackground(Color.decode("#FFFFFF"));
		frame.setBounds(100, 100, 550, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de usuarios");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setPreferredSize(new Dimension(70, 29));
		lblNewLabel.setFont(new Font("Javanese Text", Font.BOLD, 22));
		lblNewLabel.setBackground(Color.decode("#A39384"));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.decode("#1D283C"), 9));
		panel_2.setBackground(Color.decode("#72462D"));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		
		JPanel panel_7 = new JPanel();
		JLabel iconoPerfil =new JLabel(new ImageIcon("perfilicon.PNG"));
		//iconoPerfil.setText("");
		iconoPerfil.setOpaque(true);
		iconoPerfil.setVisible(true); 
		iconoPerfil.setBounds(0, 0, 80, 80);
		panel_7.setBounds(80, 67, 80, 80);
		panel_7.setLayout(null);
		panel_7.add(iconoPerfil);
		panel_7.setOpaque(true);
		panel_2.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(null);
		panel_8.setBounds(39, 165, 201, 51);
		panel_2.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		panel_8.add(chckbxNewCheckBox, BorderLayout.NORTH);
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBackground(null);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar Fecha de Nacimiento");
		panel_8.add(chckbxMostrarFechaDe, BorderLayout.SOUTH);
		chckbxMostrarFechaDe.setForeground(new Color(255, 255, 255));
		chckbxMostrarFechaDe.setBackground((Color) null);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.decode("#FFFFFF"));
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#1D283C"));

		//panel_3.setBackground(Color.decode("#68778A"));
		panel_3.setBorder(new LineBorder(Color.decode("#1D283C"), 8));
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
        ImageIcon S = new ImageIcon("S.PNG");
		JButton btnNewButton = new JButton("Guardar",new ImageIcon("C:\\Users\\gamer\\eclipse-workspace\\idstmb\\S2.png"));

		btnNewButton.setBackground(Color.decode("#A39384"));
		btnNewButton.setBorder(new LineBorder(Color.decode("#1D283C"), 6));
		panel_3.add(btnNewButton, BorderLayout.CENTER);
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(Color.decode("#A39384"));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\gamer\\eclipse-workspace\\idstmb\\salir.png"));
		btnNewButton_1.setBorder(new LineBorder(Color.decode("#1D283C"), 7));
		panel_3.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("Nuevo",new ImageIcon("C:\\Users\\gamer\\eclipse-workspace\\idstmb\\N1.png"));
		btnNewButton_2.setBackground(Color.decode("#A39384"));
		btnNewButton_2.setBorder(new LineBorder(Color.decode("#1D283C"), 7));
		panel_3.add(btnNewButton_2, BorderLayout.NORTH);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setPreferredSize(new Dimension(280,0));
		panel_3_1.setBorder(new LineBorder(Color.decode("#1D283C"), 9));
		panel_3_1.setBackground(Color.decode("#A39384"));
		panel.add(panel_3_1, BorderLayout.WEST);
		panel_3_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(null);
		panel_3_1.add(panel_9, BorderLayout.NORTH);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_5 = new JLabel("Descripcion");
		lblNewLabel_5.setFont(new Font("Javanese Text", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(Color.black.decode("#A39384"));
		panel_9.add(lblNewLabel_5, BorderLayout.WEST);

		JLabel lblNewLabel_6 = new JLabel("Gustos                                        ");
		lblNewLabel_6.setFont(new Font("Javanese Text", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.decode("#A39384"));
		panel_9.add(lblNewLabel_6, BorderLayout.EAST);

		
		JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(130, 100)); 
		JScrollPane scrollPane1 = new JScrollPane(textArea);
		scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane1.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane1.setPreferredSize(new Dimension(130, 150)); 
		panel_3_1.add(scrollPane1, BorderLayout.WEST);

		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setPreferredSize(new Dimension(130, 150)); 
		JScrollPane scrollPane2 = new JScrollPane(textArea_1);
		scrollPane2.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane2.setPreferredSize(new Dimension(130, 150)); 
		panel_3_1.add(scrollPane2, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		//panel_1.setSize(null);
		panel_1.setForeground(new Color(192, 192, 192));
		panel_1.setBackground(new Color(64, 128, 128));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.decode("#1D283C"), 9));
		panel_4.setBackground(new Color(64, 128, 128));
		panel_4.setPreferredSize(new Dimension(280, 40));
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\"Datos generales\"");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Javanese Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setLocation(new Point(5, 5));
		lblNewLabel_1.setBounds(10, 10, 172, 23);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre(s):");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(25, 62, 79, 23);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellido(s):");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(25, 95, 79, 23);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setBounds(84, 128, 98, 23);
		panel_4.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("      DD / MM / AA");
		lblNewLabel_3.setOpaque(true); 
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(80, 150, 112, 23);
		lblNewLabel_3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		panel_5.setBounds(10, 183, 260, 33);
		panel_4.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		panel_5.add(lblNewLabel_4, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Macho");
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fémina");
		panel_6.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Nacionalidad:");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setBounds(25, 252, 98, 23);
		panel_4.add(lblNewLabel_2_1_1_1);
		
		JComboBox lista=new JComboBox();
		lista.setLocation(147, 255);
		lista.setSize(123,17);
		lista.setModel(new DefaultComboBoxModel(new String[] {"Mexico", "Ciudad del Vaticano", "Peru", "Wakanda", "Narnia", "Atlantis"}));		
		lista.setOpaque(true);
		lista.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_4.add(lista);
	}
	
	private void examn() {
		frame = new JFrame();
		frame.setBackground(Color.decode("#FFFFFF"));
		frame.setBounds(100, 100, 550, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
	}
}
