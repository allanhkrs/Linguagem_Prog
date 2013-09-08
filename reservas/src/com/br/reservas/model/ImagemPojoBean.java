package com.br.reservas.model;

import com.br.reservas.util.ConstantesEnum;

public class ImagemPojoBean {
	

	private String imagem = ConstantesEnum.IMAGEM_ASSENTO_AZUL.getConstante();

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
}
