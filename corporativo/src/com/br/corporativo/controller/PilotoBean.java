package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.model.Piloto;

@ManagedBean
@SessionScoped
public class PilotoBean {
	
	private Piloto piloto = new Piloto();
	private String selecionado;
	
	public String getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(String selecionado) {
		this.selecionado = selecionado;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public String adicionarPiloto(){
		return "pilotoadicionado";
	}
	
	public String removerPiloto() {
		return "pilotoremovido";
	}
}
