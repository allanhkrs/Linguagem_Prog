package com.br.corporativo.model;

import java.util.HashMap;


public class Aviao {

	HashMap<String, Assento> mapaAssentos = new HashMap<String,Assento>();
	
	public HashMap<String, Assento> getMapaAssentos() {
		return this.mapaAssentos;
	}

	public void setMapaAssentos(HashMap<String, Assento> mapaAssentos) {
		this.mapaAssentos = mapaAssentos;
	}

	public void setAssentoAoMapa(String pNumeroAssento, Assento pAssento) {
		this.mapaAssentos.put(pNumeroAssento,pAssento);
	}

		
}
