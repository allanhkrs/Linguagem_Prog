package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.util.Constantes;

@ManagedBean
@SessionScoped
public class ControlBean {
	
	public String getImgBotaoVoos() {
		return Constantes.BOTAO_CONSULTAR_VOOS;
	}
	
	public String getImgBotaoCheckinPassageiro() {
		return Constantes.BOTAO_CHECKIN_PASSAGEIRO;
	}
	
	public String getImgBotaoSubmit() {
		return Constantes.BOTAO_SUBMIT;
	}	
	
	public String getImgBotaoPoliticas(){
		return Constantes.BOTAO_POLITICAS_ORGANIZACAO;
	}
	
}
