package controller;

import org.apache.log4j.Logger;

import dao.PessoaDao;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Pessoa;

public class IndexController {
	
	static Logger logger = Logger.getLogger(IndexController.class);
	
	@FXML
    private Button btCancelar;

    @FXML
    private Label labelSenha;

    @FXML
    private TextField txtCancelar;

    @FXML
    private TextField txtLogin;
    
    @FXML
    private Label txtSenha;

    PessoaDao dao = new PessoaDao();
    
    public void acessarSistema(Pessoa pessoa) {
    	try {
    		if(pessoa != null) {
        		pessoa.setNome(txtLogin.getText());
        		pessoa.setNome(txtSenha.getText());
        		dao.salvar(pessoa);
        		
        	}
		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage());
		}
    }
}
