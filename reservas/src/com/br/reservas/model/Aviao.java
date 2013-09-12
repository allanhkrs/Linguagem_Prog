package com.br.reservas.model;

import java.util.HashMap;
import java.util.Set;


public class Aviao {

	HashMap mapaAssentos = new HashMap();
	
	public HashMap getMapaAssentos() {
		
		Set<String> chaves = mapaAssentos.keySet();
		
		for (String chave : chaves) {
            if(chave != null)  
                System.out.println(chave + mapaAssentos.get(chave));			
		}
		return this.mapaAssentos;
	}

	public void setMapaAssentos(HashMap mapaAssentos) {
		this.mapaAssentos = mapaAssentos;
	}

	public void setAssentoAoMapa(String pNumeroAssento, Assento pAssento) {
		this.mapaAssentos.put(pNumeroAssento,pAssento);
	}

		
}
