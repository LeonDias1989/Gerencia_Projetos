package br.com.senac.view;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FrameUrna extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button;
	private JButton buttonBranco;
	private JButton btnCorrige;
	private JButton btnConfirma;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNome;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNmero;
	private JTextField textField_2;
	private JLabel lblNewLabel_1;

	public FrameUrna() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Urna Eletr\u00F4nica");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 523);
		getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 656, 21);
		getContentPane().add(menuBar);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(353, 142, 279, 323);
		getContentPane().add(panel);
		panel.setLayout(null);

		button1 = new JButton("1");
		button1.setBounds(10, 28, 80, 43);
		panel.add(button1);

		button2 = new JButton("2");
		button2.setBounds(100, 28, 80, 43);
		panel.add(button2);

		button3 = new JButton("3");
		button3.setBounds(187, 28, 80, 43);
		panel.add(button3);

		button4 = new JButton("4");
		button4.setBounds(10, 82, 80, 43);
		panel.add(button4);

		button5 = new JButton("5");
		button5.setBounds(100, 82, 80, 43);
		panel.add(button5);

		button6 = new JButton("6");
		button6.setBounds(187, 82, 80, 43);
		panel.add(button6);

		button7 = new JButton("7");
		button7.setBounds(10, 136, 80, 43);
		panel.add(button7);

		button8 = new JButton("8");
		button8.setBounds(100, 136, 80, 43);
		panel.add(button8);

		button9 = new JButton("9");
		button9.setBounds(187, 136, 80, 43);
		panel.add(button9);

		button = new JButton("0");
		button.setBounds(100, 190, 80, 43);
		panel.add(button);
		
		buttonBranco = new JButton("BRANCO");
		buttonBranco.setFont(new Font("Tahoma", Font.PLAIN, 9));
		buttonBranco.setBackground(Color.WHITE);
		buttonBranco.setIcon(null);
		buttonBranco.setBounds(10, 244, 80, 43);
		panel.add(buttonBranco);
		
		btnCorrige = new JButton("CORRIGE");
		btnCorrige.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCorrige.setBackground(Color.RED);
		btnCorrige.setBounds(100, 244, 80, 43);
		panel.add(btnCorrige);
		
		btnConfirma = new JButton("CONFIRMA");
		btnConfirma.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnConfirma.setBackground(new Color(0, 255, 0));
		btnConfirma.setBounds(187, 244, 80, 43);
		panel.add(btnConfirma);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameUrna.class.getResource("/Images/logo_novo_Jus_eleitoral2.jpg")));
		lblNewLabel.setBounds(447, 32, 150, 99);
		getContentPane().add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(20, 142, 307, 323);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNome.setBounds(86, 50, 75, 16);
		panel_1.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(86, 70, 197, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPartido = new JLabel("Partido");
		lblPartido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPartido.setBounds(86, 94, 75, 16);
		panel_1.add(lblPartido);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(86, 111, 197, 20);
		panel_1.add(textField_1);
		
		lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNmero.setBounds(86, 139, 75, 16);
		panel_1.add(lblNmero);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 155, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Projeto Urna Eletr\u00F4nica");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 32, 232, 21);
		getContentPane().add(lblNewLabel_1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new FrameUrna();
	}
}
