package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.model.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	
	public String getLogin() {
		return this.usuario.getLogin();
	}

	public void setLogin(String login) {
		if (login == null) {
			login = "erro";
		}
		this.usuario.setLogin(login);
	}

	public String getSenha() {
		return this.usuario.getSenha();
	}

	public void setSenha(String senha) {
		if (senha == null) {
			senha = "erro";
		}
		this.usuario.setSenha(senha);
	}

	public String validaLogin() {
		String login = getLogin().toLowerCase();
		
		switch (login) {
		case "gerente":
			return "gerente";
		case "funcionario":
			return "funcionario";
		default:
			return "erro";
		}
	}

	public String recuperaSenha() {
		return "senha";
	}

}
