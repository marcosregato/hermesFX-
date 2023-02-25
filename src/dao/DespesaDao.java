package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import config.Config;
import model.Despesa;
import model.Pessoa;

public class DespesaDao {
	
	static Logger logger = Logger.getLogger(DespesaDao.class);

	private Connection con = null;
	private Statement smt = null;
	private Config config = new Config();
	
	
	public void salvar(Despesa despesa){

		try {

			logger.info("Salvando informcao da nova despesa");

			con = DriverManager.getConnection(config.getPathFile());
			smt = con.createStatement();
			String sql = "insert into despesa (id, nome) values(" 
					+ String.valueOf(despesa.getId()) + ", "
					+ "'" + despesa.getNome()+ "');";

			smt.executeUpdate(sql);
			con.close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}

	public void editar(Despesa despesa){
		try {

			logger.info("Editar informcao da despesa");

			con = DriverManager.getConnection(config.getPathFile());
			smt = con.createStatement();
			String sql = "update despesa set "
					+ " nome='"+ despesa.getNome() + ";";

			smt.executeUpdate(sql);
			con.close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}

	public void update(Despesa despesa){
		try {

			logger.info("Atualizando informacao da pessoa");

			con = DriverManager.getConnection(config.getPathFile());
			smt = con.createStatement();
			String sql = "update despesa set "
					+ "nome='"+ despesa.getNome()+ ";";

			smt.executeUpdate(sql);
			con.close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}

	public List<Despesa> listar(){
		try{
			logger.info("Lista de todas as despesa");

			con = DriverManager.getConnection(config.getPathFile());
			smt = con.createStatement();
			String sql = "select d.nome"
					+ "from despesa d";
			
			ResultSet rs = smt.executeQuery(sql);
			List<Despesa> list = new ArrayList<>();
			while( rs.next() ) {
				Despesa despesa = new Despesa();
				despesa.setId(rs.getInt(1));
				despesa.setNome(rs.getString(2));
				list.add(despesa);
			}
			con.close();
			return list;

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}

		return Collections.emptyList();
	}

	public void excluir(int id){
		try{
			logger.info("Excluindo Despesa");

			con = DriverManager.getConnection(config.getPathFile());
			smt = con.createStatement();
			String sql = "DELETE FROM despesa WHERE id=" + id + ";";
			smt.executeUpdate(sql);
			con.close();
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
	
	
	public void buscar(String nome){
		try{
			logger.info("Buscar Despesa");

			con = DriverManager.getConnection(config.getPathFile());
			smt = con.createStatement();
			String sql = "select * "
					+ "    from despesa d where d.nome="+nome+"";
			
			smt.executeUpdate(sql);
			con.close();
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
	
	

}
