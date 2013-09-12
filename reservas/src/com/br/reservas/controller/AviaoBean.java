package com.br.reservas.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import com.br.reservas.model.Assento;
import com.br.reservas.model.Aviao;
import com.br.reservas.model.AviaoPojoBean;
import com.br.reservas.util.ConstantesEnum;

@ManagedBean
@SessionScoped
public class AviaoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private AviaoPojoBean aviaopojo = new AviaoPojoBean();
	private int contadordeColuna = 0;
	private int contadorDeFila = 0;
	private Aviao aviao = new Aviao();
	FacesContext fc = FacesContext.getCurrentInstance();
	HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
	
	public AviaoBean() {
		this.session.setAttribute("aviao", this.aviao);
	}

	public String getImagem() {		
		contadordeColuna++;
		
		String strNumeroAssento = Integer.toString(contadorDeFila) + Integer.toString(contadordeColuna);
		
		Assento assento = new Assento(strNumeroAssento);
		assento.setFileira(contadorDeFila);
		assento.setColuna(contadordeColuna);
		this.aviao.setAssentoAoMapa(strNumeroAssento, assento);
		
		if (assento.isReservado()) {
			aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
			return aviaopojo.getImagem();
		}
		
		if (contadorDeFila == 0 || contadorDeFila == 5) {			
			switch (contadordeColuna) { 
				case 1:
				case 2:
				case 3:
				case 4:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_BRANCA.getConstante());
					break;
				case 5:
				case 13:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERDE.getConstante());
					break;
				case 11:
				case 12:
				case 28:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
					break;
				default:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());
			}
			
		} else {
			switch (contadordeColuna) {
				case 1:
				case 5:
				case 13:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERDE.getConstante());
					break;
				case 11:
				case 12:
				case 28:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
					break;
				default:
					aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());					
			}
		}

		if (contadordeColuna == 28) {
			contadordeColuna = 0;
			contadorDeFila++;
		}
		
		return aviaopojo.getImagem();
	}
	
	public void attrListener(ActionEvent evento) {
		
		String tNumeroAssento = (String)evento.getComponent().getAttributes().get("strnumeroassento");
		System.out.println("numero assento: " + tNumeroAssento);		
		
//		Assento tAssento = ((Aviao) session.getAttribute("aviao")).getMapaAssentos().get(tNumeroAssento);
		Aviao tAviao = (Aviao) session.getAttribute("aviao");
		System.out.println("tAviao: " + tAviao);
		Assento tAssento = (Assento) tAviao.getMapaAssentos().get(tNumeroAssento);
//		if (tAssento.isReservado()) {
//			tAssento.setReservado(false);
//			aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());
//		} else {
//			tAssento.setReservado(true);
//			aviaopojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_AMARELO.getConstante());
//		}
	}
	
//	public String getAssentoParametro(FacesContext fc){
//		 
////		aqui esta o problema
//		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
//		return params.get("codigoassento");
// 
//	}	
//	
//	public void attrListener () {
//
//	}

}
