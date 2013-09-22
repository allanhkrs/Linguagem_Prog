package com.br.reservas.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import com.br.reservas.model.Assento;
import com.br.reservas.model.Aviao;
import com.br.reservas.util.ConstantesEnum;

@ManagedBean
@SessionScoped
public class AviaoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int contadordeColuna = 1;
	private int contadorDeFila = 0;
	private Aviao aviao = new Aviao();
	FacesContext fc = FacesContext.getCurrentInstance();
	HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);

	public String getImagem() {		
		String strNumeroAssento = Integer.toString(contadorDeFila) + Integer.toString(contadordeColuna);
		
		Assento assento = null;
		
		if(this.aviao.getMapaAssentos().get(strNumeroAssento)==null){
			assento = new Assento(strNumeroAssento);
			assento.setFileira(contadorDeFila);
			assento.setColuna(contadordeColuna);
			
		}else{
			assento = this.aviao.getMapaAssentos().get(strNumeroAssento);
		}
				
		this.aviao.setAssentoAoMapa(strNumeroAssento, assento);
		
		if (assento.isReservado()) {
			assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_AMARELO.getConstante());
		} else {
			if (contadorDeFila == 0 || contadorDeFila == 5) {			
				switch (contadordeColuna) { 
					case 1:
					case 2:
					case 3:
					case 4:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_BRANCA.getConstante());
						break;
					case 5:
					case 13:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_VERDE.getConstante());
						break;
					case 11:
					case 12:
					case 28:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
						break;
					default:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());
				}
				
			} else {
				switch (contadordeColuna) {
					case 1:
					case 5:
					case 13:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_VERDE.getConstante());
						break;
					case 11:
					case 12:
					case 28:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
						break;
					default:
						assento.setImgStatusAssento(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());
				}
			}
		}
		
		if (contadordeColuna == 28) {
			contadordeColuna = 0;
			contadorDeFila++;
		}
		
		if(contadorDeFila > 5) { 
			contadorDeFila = 0;
		}
		
		contadordeColuna++;
		
		return assento.getImgStatusAssento();
	}
	
	public void attrListener(ActionEvent evento) {
		
		String tNumeroAssento = (String)evento.getComponent().getAttributes().get("strnumeroassento");
		
		if (this.aviao.getMapaAssentos().get(tNumeroAssento).isReservado()){
			System.out.println("está reservado");
			this.aviao.getMapaAssentos().get(tNumeroAssento).setReservado(false);
		} else {
			System.out.println("não está reservado");
			this.aviao.getMapaAssentos().get(tNumeroAssento).setReservado(true);
		}
		
	}

}
