package config;

import java.io.File;

import org.apache.log4j.Logger;

public class RunApplication {

	
	private static Logger logger = Logger.getLogger(RunApplication.class);
	
	public static void main(String[] asd) {

		try {
			Config config = new Config();
			
			File file = new File(config.getPathFile());
			File[] listArquivo = file.listFiles();
			int i = 0;
			ConstruirBd db = new ConstruirBd();
			File arquivos=null;
			for (int j = listArquivo.length; i < j; i++) {
				arquivos = listArquivo[i];
			}
			
			if(arquivos !=null ) {
				logger.info("O arquivo do .SQLITE ja exite");
			}else {
				db.criarBanco();
				db.queryEstruturaTabela();
				logger.info("Foi criado arquivo do .SQLITE ");
			}

		} catch (Exception e) {
			logger.info(e.getStackTrace());
		}
	}
}
