package br.com.senac.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SobreSelecionado implements ActionListener {

	private JFrame janela;

	public SobreSelecionado(JFrame janela) {
		this.janela = janela;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane
				.showMessageDialog(
						janela,
						"<html><body align=center><b>Urna Eletrônica</b><br/>"
								+ "Version: 0.1<br/>"
								+ "(c) Copyright 2014.  Todos os direitos reservados.</body></html>",
						"Sobre", 1, null);
	}
}
