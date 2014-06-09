package br.com.senac.controller;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.com.senac.view.FrameUrna;

/** Classe Controller principal inicializadora da aplicação */
public class UrnaEletronicaGerente {

	private FrameUrna fu;

	public UrnaEletronicaGerente() {
		this.fu = new FrameUrna();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			JOptionPane
					.showMessageDialog(
							null,
							"Não foi possível retornar o Look and Feel padrão do sistema. \nEste erro não afetará a execução da aplicação.",
							"Erro de Look and Feel",
							JOptionPane.WARNING_MESSAGE);
		}

		JFrame janela = new JFrame();
		janela.setTitle("Urna Eletr\u00F4nica");
		janela.setSize(662, 523);
		janela.setResizable(false);
		janela.setAlwaysOnTop(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setContentPane(this.fu);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 656, 21);
		JMenu menuAjuda = new JMenu("Ajuda");
		JMenuItem sobre = new JMenuItem("Sobre...");
		sobre.addActionListener(new SobreSelecionado(janela));
		menuAjuda.add(sobre);
		menuBar.add(menuAjuda);

		janela.setJMenuBar(menuBar);

		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new UrnaEletronicaGerente();
	}
}
