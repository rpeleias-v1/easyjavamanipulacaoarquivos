package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class GeradorRelatorioBufferedWriter extends GeradorRelatorio{

	@Override
	protected void gerarArquivoSaida(String dadosRelatorioTrabalho) throws IOException {
		OutputStream os = new FileOutputStream("relatorioBufferedWriter.txt");
	    OutputStreamWriter osw = new OutputStreamWriter(os);
	    BufferedWriter bw = new BufferedWriter(osw);
	 
	    bw.write(dadosRelatorioTrabalho);
	     
	    bw.close();
	}

}
