package com.br.reservas.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_cliente;
	private String nm_cliente;
	private String ds_cpf_cliente;
	private String ds_end_cliente;
	private String ds_tel_cliente;
	private int cd_sexo_cliente;

}
