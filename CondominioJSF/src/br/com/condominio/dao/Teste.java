package br.com.condominio.dao;

import br.com.condominio.domain.Morador;

public class Teste {

	public static void main(String[] args) {
		Morador m1 = new Morador();
		  m1.setNome("Teste1");
		  
		  Morador m2 = new Morador();
		  m2.setNome("Testeste");
		  
		  MoradorDAO mdao = new MoradorDAO(null);
		  
		  mdao.adiciona(m1);
		  mdao.adiciona(m2);
		  System.out.println("os moradores foram salvos");
	}

}
