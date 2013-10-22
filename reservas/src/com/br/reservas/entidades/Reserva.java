package com.br.reservas.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_reserva")
public class Reserva {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_reserva;
	private int cd_cliente;
	private int cd_boleto;
	private int cd_status_reserva;
	private int cd_quantidade_adultos;
	private int cd_quantidade_criancas;
	private int cd_quantidade_bebes;
	private Date dt_abertura_reserva;
	private Date dt_fechamento_reserva;
	private String ds_localizador_voucher;
	
}
