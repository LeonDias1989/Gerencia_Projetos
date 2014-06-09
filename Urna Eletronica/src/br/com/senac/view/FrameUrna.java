package br.com.senac.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import br.com.senac.controller.OpcaoSelecionada;

/** Tela principal do aplicação. */
public class FrameUrna extends JPanel {
	private static final long serialVersionUID = 4043384524397718389L;
	/** Altura, largura, posição X e Y utilizadas nos botões da urna. */
	private static final Rectangle[] retangulos = {
			new Rectangle(100, 190, 80, 43), new Rectangle(10, 28, 80, 43),
			new Rectangle(100, 28, 80, 43), new Rectangle(187, 28, 80, 43),
			new Rectangle(10, 82, 80, 43), new Rectangle(100, 82, 80, 43),
			new Rectangle(187, 82, 80, 43), new Rectangle(10, 136, 80, 43),
			new Rectangle(100, 136, 80, 43), new Rectangle(187, 136, 80, 43),
			new Rectangle(10, 244, 80, 43), new Rectangle(100, 244, 80, 43),
			new Rectangle(187, 244, 80, 43) };
	private JButton[] botoes = new JButton[retangulos.length];
	/**  */
	private static final Font fontBtnSelecao = new Font(Font.DIALOG, Font.BOLD,
			30), fontBtnTexto = new Font("Tahoma", Font.PLAIN, 8);
	/**  */
	private static final Color[] coresSelecao = { Color.WHITE, Color.RED,
			new Color(0, 255, 0) };

	private JLabel lblLogoJE;
	private JPanel painelPolitico;
	private JLabel lblNome;
	private JLabel lblNmero;
	private JLabel lblNewLabel_1;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private String[] textoBotoesSelecao = { "BRANCO", "CORRIGE", "CONFIRMA" };

	public FrameUrna() {
		setBackground(Color.WHITE);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		panel.setBounds(353, 142, 279, 323);
		add(panel);
		panel.setLayout(null);

		for (int c = 0; c < botoes.length; c++) {
			botoes[c] = new JButton();
			botoes[c].setFocusable(false);
			botoes[c].setBounds(retangulos[c]);
			botoes[c].setFont(fontBtnSelecao);
			if (c > 9) {
				botoes[c].setText(textoBotoesSelecao[c - 10]);
				botoes[c].setFont(fontBtnTexto);
				botoes[c].setBackground(coresSelecao[c - 10]);
				botoes[c].setCursor(Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR));
				botoes[c].addActionListener(new OpcaoSelecionada());
			} else {
				botoes[c].setText("" + c);
			}
			botoes[c].setToolTipText(botoes[c].getText());
			panel.add(botoes[c]);
		}

		lblLogoJE = new JLabel("");
		ImageIcon imgJF = new ImageIcon(
				FrameUrna.class
						.getResource("/Images/logo_novo_Jus_eleitoral2.jpg"));
		lblLogoJE.setIcon(imgJF);
		// 100, 99
		lblLogoJE.setBounds(447, 32, imgJF.getIconWidth(),
				imgJF.getIconHeight());
		add(lblLogoJE);

		painelPolitico = new JPanel();
		painelPolitico.setBorder(new BevelBorder(BevelBorder.LOWERED));
		painelPolitico.setBackground(Color.WHITE);
		painelPolitico.setBounds(20, 142, 307, 323);
		add(painelPolitico);
		painelPolitico.setLayout(null);

		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNome.setBounds(86, 50, 75, 16);
		painelPolitico.add(lblNome);

		textField = new JTextField();
		textField.setBounds(86, 70, 197, 20);
		painelPolitico.add(textField);
		textField.setColumns(10);

		JLabel lblPartido = new JLabel("Partido");
		lblPartido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPartido.setBounds(86, 94, 75, 16);
		painelPolitico.add(lblPartido);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(86, 111, 197, 20);
		painelPolitico.add(textField_1);

		lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNmero.setBounds(86, 139, 75, 16);
		painelPolitico.add(lblNmero);

		textField_2 = new JTextField();
		textField_2.setBounds(86, 155, 86, 20);
		painelPolitico.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_1 = new JLabel("Projeto Urna Eletr\u00F4nica");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 32, 232, 21);
		add(lblNewLabel_1);
	}
}
