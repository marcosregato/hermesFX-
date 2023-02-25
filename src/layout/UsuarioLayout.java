package layout;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.PessoaDao;

public class UsuarioLayout {

	JTable table = new JTable();
	PessoaDao dao = new PessoaDao();

	public void pesquisarUsuario() {

		DefaultTableModel model = new DefaultTableModel();

		Object[] columnsName = new Object[4];

		columnsName[0] = "Id";
		columnsName[1] = "Nome";
		columnsName[2] = "Endereço";
		columnsName[3] = "Telefone";

		model.setColumnIdentifiers(columnsName);

		Object[] rowData = new Object[4];

		for(int i = 0; i < dao.listar().size(); i++){

			rowData[0] = dao.listar().get(i).getId();
			rowData[1] = dao.listar().get(i).getNome();
			rowData[2] = dao.listar().get(i).getEndereco();
			rowData[3] = dao.listar().get(i).getTelefone();

			model.addRow(rowData);
		}

		table.setModel(model);

		//        System.out.println(getUsers().size());

	//	Work window = new Work();

		JPanel panel = new JPanel();

		panel.setLayout(new BorderLayout());

		JScrollPane pane = new JScrollPane(table);

		panel.add(pane,BorderLayout.CENTER);

	//	window.setContentPane(panel);
	}


}
