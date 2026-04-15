package idstmb;

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

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Tictactoe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe frame = new Tictactoe();
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
	public Tictactoe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
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
		
		JLabel lblNewLabel = new JLabel("x=0");
		lblNewLabel.setBounds(134, 10, 50, 36);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JLabel lblO = new JLabel("O=0");
		lblO.setForeground(Color.WHITE);
		lblO.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 22));
		lblO.setBounds(294, 10, 50, 36);
		panel.add(lblO);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#2D4449"));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("REINICIAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBackground(Color.decode("#14BDAC"));
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8.setBackground(Color.decode("#14BDAC"));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("");
		btnNewButton_8_1.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_1.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("");
		btnNewButton_8_2.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_2.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("");
		btnNewButton_8_3.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_3.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("");
		btnNewButton_8_4.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_4.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("");
		btnNewButton_8_5.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_5.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_5);
		
		JButton btnNewButton_8_7 = new JButton("");
		btnNewButton_8_7.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_7.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_7);
		
		JButton btnNewButton_8_8 = new JButton("");
		btnNewButton_8_8.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_8.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_8);
		
		JButton btnNewButton_8_9 = new JButton("");
		btnNewButton_8_9.setBorder(new LineBorder(Color.decode("#38565C"), 9));
		btnNewButton_8_9.setBackground(new Color(20, 189, 172));
		panel_2.add(btnNewButton_8_9);
		

	}
}
