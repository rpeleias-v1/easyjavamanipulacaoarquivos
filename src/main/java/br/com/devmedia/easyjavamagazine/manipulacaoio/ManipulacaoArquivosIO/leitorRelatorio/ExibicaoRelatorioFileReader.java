package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ExibicaoRelatorioFileReader implements ExibicaoRelatorio {

	@Override
	public void executar(File relatorioPontoDiario) throws IOException {
		FileReader reader = new FileReader(relatorioPontoDiario);
		int dadoDoRelatorio;
		
		while((dadoDoRelatorio = reader.read()) != -1) {
			System.out.println(dadoDoRelatorio);
		}
		
		reader.close();
	}

}
