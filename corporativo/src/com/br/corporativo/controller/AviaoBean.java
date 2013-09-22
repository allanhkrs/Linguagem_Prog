package com.br.corporativo.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import com.br.corporativo.model.Assento;
import com.br.corporativo.model.Aviao;
import com.br.corporativo.util.Constantes;

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
			assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_AMARELO);
		} else {
			if (contadorDeFila == 0 || contadorDeFila == 5) {			
				switch (contadordeColuna) { 
					case 1:
					case 2:
					case 3:
					case 4:
						assento.setImgStatusAssento(Constantes.IMAGEM_BRANCA);
						break;
					case 5:
					case 13:
						assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_VERDE);
						break;
					case 11:
					case 12:
					case 28:
						assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_VERMELHO);
						break;
					default:
						assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_AZUL);
				}
				
			} else {
				switch (contadordeColuna) {
					case 1:
					case 5:
					case 13:
						assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_VERDE);
						break;
					case 11:
					case 12:
					case 28:
						assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_VERMELHO);
						break;
					default:
						assento.setImgStatusAssento(Constantes.IMAGEM_ASSENTO_AZUL);
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
