package com.br.reservas.util;

public enum ConstantesEnum {

	IMAGEM_ASSENTO_VERDE("/static/img/imgPoltronaVerde.jpg"),
	IMAGEM_ASSENTO_AZUL("/static/img/imgPoltronaAzul.jpg"),
	CAMINHO_JQUERY_JS("../static/js/jquery-1.3.2.min.js"),
	CAMINHO_SCRIPT_JS("../static/js/script.js"),
	CAMINHO_CUFON_JS("../static/js/cufon-yui.js"),
	CAMINHO_CUFFON_RUN("../static/js/cuf_run.js"),
	CAMINHO_ARIAL_JS("../static/js/arial.js"),
	CAMINHO_CSS("../static/css/main.css");
	
	
	private String constante = null;
	
	private ConstantesEnum(String pConstante) {
		this.constante = pConstante;
	}
	
	public String getConstante() {
		return this.constante;
	}
	
}
