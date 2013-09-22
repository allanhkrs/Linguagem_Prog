package com.br.corporativo.controller;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.br.corporativo.util.Constantes;

@ManagedBean
@ViewScoped
public class ControlBean {
	
	private Date dataCalendarioInicio;
	private Date dataCalendarioFinal;
	private String cidadeOrigem;
	private String cidadeDestino;
	
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public Date getDataCalendarioInicio() {
		return dataCalendarioInicio;
	}

	public void setDataCalendarioInicio(Date dataCalendarioInicio) {
		this.dataCalendarioInicio = dataCalendarioInicio;
	}

	public Date getDataCalendarioFinal() {
		return dataCalendarioFinal;
	}

	public void setDataCalendarioFinal(Date dataCalendarioFinal) {
		this.dataCalendarioFinal = dataCalendarioFinal;
	}

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
	
	public String getImgBotaoCancelar(){
		return Constantes.BOTAO_CANCELAR;
	}
	
	public String getImgBotaoGerir(){
		return Constantes.BOTAO_GERIR;
	}
	
	public String aplicaFiltro() {
		return "filtrado";
	}
}
