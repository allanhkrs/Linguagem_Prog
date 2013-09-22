package com.br.corporativo.model;

public class Usuario {

	private String nome;
	private String senha;
	private String login;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		System.out.println("caiu no setlogin");
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
