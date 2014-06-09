package br.com.senac.controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @deprecated
 * Esta classe serve apenas para fins de teste.
 * Ação que executa o som de 'beep' padrão do sistema operacional.
 */
public class OpcaoSelecionada implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		Toolkit.getDefaultToolkit().beep();
	}
}