package com.br.reservas.controller;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;

import com.br.reservas.util.ConstantesEnum;


@ManagedBean
@ApplicationScoped
public class ControlBean {
	
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
	
}
