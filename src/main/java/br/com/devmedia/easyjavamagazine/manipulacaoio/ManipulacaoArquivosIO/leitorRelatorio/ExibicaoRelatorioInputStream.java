package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExibicaoRelatorioInputStream implements ExibicaoRelatorio {

	@Override
	public void executar(File relatorioPontoDiario) throws IOException {
		InputStream in = new FileInputStream(relatorioPontoDiario);
		int dadoDoRelatorio;
		while ((dadoDoRelatorio = in.read()) != -1) {
			System.out.println(dadoDoRelatorio);
		}
		in.close();
	}

}
