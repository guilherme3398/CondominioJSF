package br.com.condominio.domain;

import java.util.Date;

public class Evento {

	private Long idevento;
	private String descricao;
	private Date dinclusao;
	private Morador morador;

	public Long getIdevento() {
		return idevento;
	}

	public void setIdevento(Long idevento) {
		this.idevento = idevento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDinclusao() {
		return dinclusao;
	}

	public void setDinclusao(Date dinclusao) {
		this.dinclusao = dinclusao;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

}
