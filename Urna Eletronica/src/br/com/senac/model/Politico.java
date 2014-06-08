package br.com.senac.model;

import javax.swing.ImageIcon;

public class Politico {

	protected String nome;
	protected String partido;
	protected int numero;
	protected ImageIcon fotoPolitico;

	public Politico() {

	}

	public Politico(String nome, String partido, int numero) {
		super();
		this.nome = nome;
		this.partido = partido;
		this.numero = numero;
	}

	public Politico(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ImageIcon getFotoPolitico() {
		return fotoPolitico;
	}

	public void setFotoPolitico(ImageIcon fotoPolitico) {
		this.fotoPolitico = fotoPolitico;
	}

}
