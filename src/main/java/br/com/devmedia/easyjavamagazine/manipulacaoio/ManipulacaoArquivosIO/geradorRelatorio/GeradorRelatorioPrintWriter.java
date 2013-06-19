package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio;

import java.io.IOException;
import java.io.PrintWriter;

public class GeradorRelatorioPrintWriter extends GeradorRelatorio {

	@Override
	protected void gerarArquivoSaida(String dadosRelatorioTrabalho) throws IOException {
		PrintWriter pw = new PrintWriter("arquivoPrintWriter.txt");
		pw.write(dadosRelatorioTrabalho);
		pw.close();
	}

}
