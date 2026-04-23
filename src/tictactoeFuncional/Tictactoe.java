package tictactoeFuncional;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Tictactoe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int contadorx=0,contadory=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe frame = new Tictactoe();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private boolean equis=true;
	

	
	public Tictactoe() {
		int xa=0, ya=0;
		ImageIcon imgEquis =new ImageIcon("equis.PNG");
		ImageIcon imgCirculo =new ImageIcon("circulo.PNG");
		ListaTrigonal lista =new ListaTrigonal(3,3);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(Color.decode("#2D4449"));
		panel.setPreferredSize(new Dimension(0, 40));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JLabel contador = new JLabel("X=0       |      O=0 ");
		contador.setBounds(138, 10, 300, 36);
		contador.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 22));
		contador.setForeground(new Color(255, 255, 255));
		panel.add(contador);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#2D4449"));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		

		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));

		
		JButton[][] botonesArray=new JButton[3][3];
		for(int i=0; i<3;i++) {
			for(int z=0; z<3;z++) {
				
				int filas=i, columnas=z;

				JButton botones = new JButton("");
				botones.setBorder(new LineBorder(Color.decode("#38565C"), 9));
				botones.setBackground(Color.decode("#14BDAC"));
				botones.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	if(botones.getIcon()==null) {
				    		if(equis) {
				    			botones.setIcon(imgEquis);
				    			equis=false;
				    			lista.setNodo(filas, columnas, equis);
				    			if(lista.jugadaHorizontal(filas)!=0 || lista.jugadaVertical(columnas)!=0 || lista.jugadaDiagonal(columnas)!=0){
				    				if(lista.getNodo(filas, columnas)==2) {
				    					contadorx++;
				    					JOptionPane.showMessageDialog(
				    				            null,                          
				    				            "¡El jugador 'X' Gano!",
				    				            "Winner winner Chicken Dinner",                        
				    				            JOptionPane.INFORMATION_MESSAGE 
				    				        );
				    					contador.setText("X="+contadorx+"       |      O="+contadory);
				    				}else {
				    					contadory++;
				    					JOptionPane.showMessageDialog(
				    							null,                        
				    				            "¡El jugador 'O' Gano!", 
				    				            "Winner winner Chicken Dinner",      
				    				            JOptionPane.INFORMATION_MESSAGE  
				    				        );
				    					contador.setText("X="+contadorx+"       |      O="+contadory);
				    				}
				    				lista.vaciarArray();
				    		    	for(int i=0; i<3;i++) {
				    					for(int z=0; z<3;z++) {
				    						botonesArray[i][z].setIcon(null);
				    					}
				    		    	}
				    			}
				    			System.out.println(lista.toString());
				    			
				    		}else {
				    			botones.setIcon(imgCirculo);
				    			equis=true;
				    			lista.setNodo(filas, columnas, equis);
				    			if(lista.jugadaHorizontal(filas)!=0 || lista.jugadaVertical(columnas)!=0 || lista.jugadaDiagonal(columnas)!=0) {
				    				if(lista.getNodo(filas, columnas)==2) {
				    					contadorx++;
				    					JOptionPane.showMessageDialog(
				    							null,                        
				    				            "¡El jugador 'X' Gano!", 
				    				            "Winner winner Chicken Dinner",                   
				    				            JOptionPane.INFORMATION_MESSAGE  
				    				        );
				    					contador.setText("X="+contadorx+"       |      O="+contadory);
				    				}else {
				    					contadory++;
				    					JOptionPane.showMessageDialog(
				    							null,                        
				    				            "¡El jugador 'O' Gano!", 
				    				            "Winner winner Chicken Dinner",                       
				    				            JOptionPane.INFORMATION_MESSAGE  
				    				        );
				    					contador.setText("X="+contadorx+"       |      O="+contadory);
				    				}
				    				lista.vaciarArray();
				    		    	for(int i=0; i<3;i++) {
				    					for(int z=0; z<3;z++) {
				    						botonesArray[i][z].setIcon(null);
				    					}
				    		    	}
				    				
				    			}
				    			System.out.println(lista.toString());
				    		}
				    	}
				    }
				});
				botonesArray[filas][columnas]=botones;
				panel_2.add(botones);
				
			}
		}
		
		JButton reiniciar = new JButton("REINICIAR");
		reiniciar.setForeground(new Color(255, 255, 255));
		reiniciar.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		reiniciar.setBackground(Color.decode("#14BDAC"));
		reiniciar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	lista.vaciarArray();
		    	for(int i=0; i<3;i++) {
					for(int z=0; z<3;z++) {
						botonesArray[i][z].setIcon(null);
					}
		    	}
		    }
		});
		panel_1.add(reiniciar);
		
		
		
		
		
		
		
		
		
		
		
	}
}
