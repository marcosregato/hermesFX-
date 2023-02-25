package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;


public class ConstruirBd {

	static Logger logger = Logger.getLogger(ConstruirBd.class);

	Connection c = null;
	Statement stmt = null;
	private Config config = new Config();


	public boolean criarBanco() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection(config.getPathFile());
			logger.info("Opened database successfully");
			return true;
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		return false;
	}

	public boolean queryEstruturaTabela() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection(config.getPathFile());
			stmt = c.createStatement();
			
			
			String sql = "CREATE table pessoa("
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
					+ "	nome varchar(255),"
					+ "	endereco varchar(255),"
					+ "	telefone varchar(255),"
					+"  idCargo int,"
					+ "	FOREIGN KEY (idCargo) REFERENCES cargo(id)"
					+ ");"
					+ "CREATE table loja("
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
					+ "	nome varchar(255),"
					+ "	endereco varchar(200),"
					+ "	bairro varchar(200),"
					+ "	cep varchar(200),"
					+ "	idPessoa int,"
					+ "	idRito int,"
					+ "	idPotencia int,"
					+ "	idEstado int,"
					+ "	FOREIGN KEY (idRito) REFERENCES rito(id),"
					+ "	FOREIGN KEY (idPessoa) REFERENCES pessoa(id),"
					+ "	FOREIGN KEY (idPotencia) REFERENCES potencia(id),"
					+ "	FOREIGN KEY (idEstado) REFERENCES estado(id)"
					+ ");"
					+ "CREATE table cargo("
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
					+ "	nome varchar(255)"
					+ ");"
					+ "CREATE table rito("
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
					+ "	nome varchar(255)"
					+ ");"
					+ "CREATE table potencia("
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
					+ "	nome varchar(255)"
					+ ");"
					+ "CREATE table estado("
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
					+ "	nome varchar(255)"
					+ ")";
			
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
			logger.info("Opened database successfully");
			return true;

		} catch (Exception e) {
			//TODO melhor a mensagem de erro
			logger.info(e.getStackTrace());

		}
		return false;

	}
}