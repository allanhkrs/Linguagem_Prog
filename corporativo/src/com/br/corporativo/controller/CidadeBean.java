package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.model.Cidade;


@ManagedBean
@SessionScoped
public class CidadeBean {

	private Cidade cidade = new Cidade();
	private String selecionado;

	public String getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(String selecionado) {
		this.selecionado = selecionado;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public String adicionarCidade(){
		return "cidadeadicionada";
	}
	
	public String removerCidade(){
		return "cidaderemovida";
	}
	
}