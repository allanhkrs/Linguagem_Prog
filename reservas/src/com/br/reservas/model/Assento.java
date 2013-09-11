package com.br.reservas.model;

public class Assento {

	private int coluna = 0;
	private int fileira = 0;
	private int numeroAssento = 0;
	private boolean reservado = false;
	
	public Assento() {
		
	}


	public Assento(int pNumeroAssento) {
		this.numeroAssento = pNumeroAssento;
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
