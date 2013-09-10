package com.br.reservas.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.br.reservas.model.ImagemPojoBean;
import com.br.reservas.util.ConstantesEnum;

@ManagedBean
@SessionScoped
public class ImagemBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private ImagemPojoBean imgpojo = new ImagemPojoBean();
	private int contadorDeAssentos = 0;
	private int contadorDeFila = 1;

	public String getImagem() {
		contadorDeAssentos++;
		System.out.println("contador de assentos:" + contadorDeAssentos + " contador de fila:" + contadorDeFila);
		
		if (contadorDeFila == 1 || contadorDeFila == 6) {			
			switch (contadorDeAssentos) { 
				case 1:
				case 2:
				case 3:
				case 4:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_BRANCA.getConstante());
					break;
				case 5:
				case 13:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERDE.getConstante());
					break;
				case 11:
				case 12:
				case 28:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
					break;
				default:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());
			}
			
		} else {
			switch (contadorDeAssentos) {
				case 1:
				case 5:
				case 13:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERDE.getConstante());
					break;
				case 11:
				case 12:
				case 28:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_VERMELHO.getConstante());
					break;
				default:
					imgpojo.setImagem(ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante());					
				
			}
		}

		if (contadorDeAssentos == 28) {
			contadorDeAssentos = 0;
			contadorDeFila++;
		}
		
		return this.imgpojo.getImagem();
	}

}
