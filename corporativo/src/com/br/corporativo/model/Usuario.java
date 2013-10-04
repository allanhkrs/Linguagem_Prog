package com.br.corporativo.model;

public class Usuario {

	private String nome;
	private String senha;
	private String login;
	private String findpass;
	private boolean gerente = false;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFindpass() {
		return findpass;
	}
	public void setFindpass(String findpass) {
		this.findpass = findpass;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isGerente() {
		return gerente;
	}
	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}
	
	
	
}
