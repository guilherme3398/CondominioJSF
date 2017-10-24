package br.com.condominio.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.batch.Main;

import br.com.condominio.domain.Morador;

public class MoradorDAO {

	private Connection connection;

	public MoradorDAO(Connection connection) {
		this.connection = connection;
	}

	public void adiciona(Morador morador) {

		try {
			String sql = "INSERT INTO tblmorador(nome,andar,napartamento,dataNascimento,dataInclusao,dataAlteracao,ativo,condominio) values (?,?,?,?,?,?,?,?) ";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, morador.getNome());
			stmt.setString(2, morador.getAndar());
			stmt.setLong(3, morador.getNapartamento());
			stmt.setDate(4, new Date(morador.getDataNascimento().getTimeInMillis()));
			stmt.setDate(5, new Date(morador.getDataInclusao().getTime()));
			stmt.setDate(6, new Date(morador.getDataAlteracao().getTime()));
			stmt.setLong(7, morador.getAtivo());
			stmt.setString(8, morador.getCondominio());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
		
	
	  
  }
	}


