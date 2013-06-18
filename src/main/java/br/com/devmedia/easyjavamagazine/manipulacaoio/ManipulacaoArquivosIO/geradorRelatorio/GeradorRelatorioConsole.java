package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio;

import java.io.IOException;

public class GeradorRelatorioConsole extends GeradorRelatorio{

	@Override
	protected void gerarArquivoSaida(String dadosRelatorioTrabalho) throws IOException {
		System.out.println(dadosRelatorioTrabalho);
	}	
}
