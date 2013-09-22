package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.util.Constantes;

@ManagedBean
@SessionScoped
public class LoginBean {
	public String getBotaoSubmit() {
		return Constantes.BOTAO_SUBMIT;
	}

	public String validaLogin() {
		System.out.println("validaLogin");
		return "ok";
	}

	public String recuperaSenha() {
		System.out.println("recuperaSenha");
		return "senha";
	}

	public void getTeste() {

	}

}
