package com.br.corporativo.model;

public class Assento {

	private int coluna = 0;
	private int fileira = 0;
	private int numeroAssento = 0;
	private boolean reservado = false;
	private String imgStatusAssento = null;
	
	public Assento() {
		
	}

	public Assento(String pNumeroAssento) {
		this.numeroAssento = Integer.parseInt(pNumeroAssento);
	}
	
	public String getImgStatusAssento() {
		return imgStatusAssento;
	}

	public void setImgStatusAssento(String imgStatusAssento) {
		this.imgStatusAssento = imgStatusAssento;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getFileira() {
		return fileira;
	}

	public void setFileira(int fileira) {
		this.fileira = fileira;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public int getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	
}
