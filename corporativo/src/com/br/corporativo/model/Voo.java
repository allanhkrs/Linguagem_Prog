package com.br.corporativo.model;

public class Voo {
	
	private int id;
	private String dataHora;
	private String piloto;
	private String origem;
	private String destino;
	private int quantidadeAssentosPrimeira;
	private int quantidadeAssentosEconomica;
	
	public Voo(int pId,String pDataHora, String pPiloto, String pOrigem, String pDestino, String pPrimeira, String pEconomica) {
		this.id = pId;
		this.dataHora = pDataHora;
		this.piloto = pPiloto;
		this.origem = pOrigem;
		this.destino = pDestino;
		this.quantidadeAssentosPrimeira = Integer.parseInt(pPrimeira);
		this.quantidadeAssentosEconomica = Integer.parseInt(pEconomica);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getQuantidadeAssentosPrimeira() {
		return quantidadeAssentosPrimeira;
	}

	public void setQuantidadeAssentosPrimeira(String quantidadeAssentosPrimeira) {
		this.quantidadeAssentosPrimeira = Integer.parseInt(quantidadeAssentosPrimeira);
	}

	public int getQuantidadeAssentosEconomica() {
		return quantidadeAssentosEconomica;
	}

	public void setQuantidadeAssentosEconomica(String quantidadeAssentosEconomica) {
		this.quantidadeAssentosEconomica = Integer.parseInt(quantidadeAssentosEconomica);
	}
	
	
	
}
