package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class VooCrudBean {

	private String id;
	private String piloto;
	private String dataSaida;
	private String dataChegada;
	private String aeroportoSaida;
	private String aeroportoChegada;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getAeroportoSaida() {
		return aeroportoSaida;
	}
	public void setAeroportoSaida(String aeroportoSaida) {
		this.aeroportoSaida = aeroportoSaida;
	}
	public String getAeroportoChegada() {
		return aeroportoChegada;
	}
	public void setAeroportoChegada(String aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	
	public String adicionarVoo(){
		return "vooadicionado";
	}
	
	public String removerVoo() {
		return "vooremovido";
	}
	
}
