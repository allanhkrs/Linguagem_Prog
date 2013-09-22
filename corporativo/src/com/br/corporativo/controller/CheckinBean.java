package com.br.corporativo.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="checkinBean")
@SessionScoped
public class CheckinBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{loginBean}")
	private UsuarioLoginBean loginBean;
	
	public void setLoginBean (UsuarioLoginBean pLoginBean) {
		this.loginBean = pLoginBean;
	}
	
	public void setUsuarioFindPass(String pFindPass) {
		this.loginBean.getUsuario().setFindpass(pFindPass);
	}
	
	public String getUsuarioFindPass() {
		return this.loginBean.getUsuario().getFindpass();
	}
	
	public String validaFindPass() {
		return "ok";
	}
	
}
