package com.br.corporativo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.corporativo.model.Voo;


@ManagedBean(name="vooBean")
@SessionScoped
public class VooBean {
   
    private List<Voo> voos;
    private Voo vooSelecionado;
	
    @PostConstruct
    public void init(){
        voos = new ArrayList<Voo>();
        voos.add(new Voo(1,"22/09/2013 10:00:01","P621","Curitiba (CWB)","São Paulo (CGH)", "3", "13"));
        voos.add(new Voo(2,"23/09/2013 10:30:00","P990","Porto Alegre (POA)","Teresina (THE)", "1", "0"));
        voos.add(new Voo(3,"23/09/2013 11:30:00","P569","São Paulo (CGH)","Teresina (THE)", "6", "20"));
    }

    public List<Voo> getVoos() {
        return this.voos;
    }

    public void setProducts(List<Voo> pVoo) {
        this.voos = pVoo;
    }

    public Voo getSelecionado() {
        return this.vooSelecionado;
    }

    public void setSelecionado(Voo pSelecionado) {
        this.vooSelecionado = pSelecionado;
    }
    
    public String getDadosVoo() {
    	return "Hora: " + this.vooSelecionado.getDataHora() + "   Partindo de: " + this.vooSelecionado.getOrigem() + "   Chegando em:" + this.vooSelecionado.getDestino();
    }
    
    public String statusVoo() {
    	return "status";
    }

}