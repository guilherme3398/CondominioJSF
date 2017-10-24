package br.com.condominio.domain;

import java.util.Calendar;
import java.util.Date;

public class Morador {
	private Long idmorador;
	private String nome;
	private String andar;
	private Long napartamento;
	private Calendar dataNascimento;
	private Date dataInclusao;
	private Date dataAlteracao;
	private Long ativo;
	private String condominio;

	public Long getIdmorador() {
		return idmorador;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Long getAtivo() {
		return ativo;
	}

	public void setAtivo(Long ativo) {
		this.ativo = ativo;
	}

	public void setIdmorador(Long idmorador) {
		this.idmorador = idmorador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public Long getNapartamento() {
		return napartamento;
	}

	public void setNapartamento(Long napartamento) {
		this.napartamento = napartamento;
	}

	public String getCondominio() {
		return condominio;
	}

	public void setCondominio(String condominio) {
		this.condominio = condominio;
	}

}
