package com.br.reservas.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.br.reservas.model.ImagemPojoBean;

@ManagedBean
@SessionScoped
public class ImagemBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private ImagemPojoBean imgpojo = new ImagemPojoBean();

	public String getImagem() {
		return this.imgpojo.getImagem();
	}

}
