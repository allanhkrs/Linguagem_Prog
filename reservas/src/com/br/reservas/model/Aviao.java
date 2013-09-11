package com.br.reservas.model;

import java.util.HashMap;


public class Aviao {

	private HashMap<Integer,Assento> mapaAssentos = new HashMap<Integer, Assento>();
	
	public void setAssentoAoMapa(int pNumeroAssento, Assento pAssento) {
		this.mapaAssentos.put(pNumeroAssento,pAssento);
	}

	public HashMap<Integer, Assento> getMapaAssentos() {
		return mapaAssentos;
	}

	public void setMapaAssentos(HashMap<Integer, Assento> mapaAssentos) {
		this.mapaAssentos = mapaAssentos;
	}
	

		
}
