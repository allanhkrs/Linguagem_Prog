package com.br.reservas.managedbeans;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.reservas.util.ConstantesEnum;


@ManagedBean
@SessionScoped
public class ControlBean {

	private String selecionado;
	private String pesquisar;
	
	public String getCaminhoJquery() {
		return ConstantesEnum.CAMINHO_JQUERY_JS.getConstante();
	}
	
	public String getCaminhoScript() {
		return ConstantesEnum.CAMINHO_SCRIPT_JS.getConstante();
	}
	
	public String getCaminhoCufonJs() {
		return ConstantesEnum.CAMINHO_CUFON_JS.getConstante();
	}
	
	public String getCaminhoCufonRun(){
		return ConstantesEnum.CAMINHO_CUFFON_RUN.getConstante();
	}
	
	public String getCaminhoArial(){
		return ConstantesEnum.CAMINHO_ARIAL_JS.getConstante();
	}
	
	public String getCaminhoCss(){
		return ConstantesEnum.CAMINHO_CSS.getConstante();
	}

	public String getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(String selecionado) {
		this.selecionado = selecionado;
	}
	
	public String getPesquisarPassagem(){
		return "pesquisar";
	}
	
}
