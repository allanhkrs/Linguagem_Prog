package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.model.Usuario;

@ManagedBean(name="loginBean")
@SessionScoped
public class UsuarioLoginBean {
	
	private Usuario usuario = new Usuario();
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setLogin(String login) {
		if (login == null) {
			login = "erro";
		}
		this.usuario.setLogin(login);
	}
	
	public String getLogin() {
		return this.usuario.getLogin();
	}

	public void setSenha(String senha) {
		if (senha == null) {
			senha = "erro";
		}
		this.usuario.setSenha(senha);
	}
	
	public String getSenha() {
		return this.usuario.getSenha();
	}

	public String validaLogin() {
		String login = this.usuario.getLogin().toLowerCase();
		
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
