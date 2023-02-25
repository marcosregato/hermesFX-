package controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;

import dao.PessoaDao;
import java.util.Collections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Pessoa;

public class PessoaController {
	static Logger logger = Logger.getLogger(PessoaController.class);

	PessoaDao dao = new PessoaDao();

	@FXML
	private Button btCancelar;

	@FXML
	private Button btConfirmarExcluir;

	@FXML
	private Button btCCancelarExcluir;

	@FXML
	private Button btSalvar;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtEndereco;

	@FXML
	private TextField txtTelefone;

	@FXML
	private TextField txtBairro;

	@FXML
	private TextField txtCep;

	@FXML
	private ComboBox comboEstado;

	@FXML
	private TextField txtMunicipio;

	@FXML
	private TextField txtEmail;

	Alert alert;


	public void salvar(Pessoa pessoa) {
		try {
			if(pessoa != null) {
				pessoa.setNome(txtNome.getText());
				pessoa.setEndereco(txtEndereco.getText());
				pessoa.setTelefone(txtTelefone.getText());
				pessoa.setBairro(txtBairro.getText());
				pessoa.setCep(txtCep.getText());
				pessoa.setNome(txtMunicipio.getText());
				pessoa.setEstado(comboEstado.getValue().toString());
				pessoa.setEmail(txtEmail.getText());
				dao.salvar(pessoa);
			}else {
				// COLOCAR MENSAGEM
			}


		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );

		}
	}

	public void editar(Pessoa pessoa) {
		try {
			if(pessoa != null) {
				pessoa.setNome(txtNome.getText());
				pessoa.setEndereco(txtEndereco.getText());
				pessoa.setTelefone(txtTelefone.getText());
				pessoa.setBairro(txtBairro.getText());
				pessoa.setCep(txtCep.getText());
				pessoa.setNome(txtMunicipio.getText());
				pessoa.setEstado(comboEstado.getValue().toString());
				pessoa.setEmail(txtEmail.getText());
				dao.editar(pessoa);
			}else {
				// COLOCAR MENSAGEM
			}

		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}

	public List<Pessoa> listar() {
		try {

			return  dao.listar();

		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}

		return Collections.emptyList();
	}

	public void delete(String nome) {
		try {
			alert.setTitle("Deseja excluir esse registro ?");
			ButtonType btConfirmar = new ButtonType("Confirmar");
			//ButtonType btCancelar = new ButtonType("Cancelar");

			Optional<ButtonType> result = alert.showAndWait();

			if(nome != null) {
				if(result.get() == btConfirmar) {
					dao.excluir(nome);
				}
			}

		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
}
