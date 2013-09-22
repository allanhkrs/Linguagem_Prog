package com.br.corporativo.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.model.Funcionario;


@ManagedBean
@SessionScoped
public class FuncionarioBean {
	private Funcionario funcionario = new Funcionario();
	private String selecionado;

	public String getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(String selecionado) {
		this.selecionado = selecionado;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String adicionarFuncionario() {
		return "funcionarioadicionado";
	}
	
	public String removerFuncionario(){
		return "funcionarioremovido";
	}
	
	public String atualizarFuncionario() {
		return "funcionarioatualizado";
	}
}
