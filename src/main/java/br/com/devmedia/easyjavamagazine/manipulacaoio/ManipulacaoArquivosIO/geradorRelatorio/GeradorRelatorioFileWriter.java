package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class GeradorRelatorioFileWriter extends GeradorRelatorio{

	@Override
	public void gerarArquivoSaida(String dadosRelatorioTrabalho) throws IOException {
		InputStream in = new  ByteArrayInputStream(dadosRelatorioTrabalho.getBytes());
		FileWriter out = new FileWriter("saidaFileWriter.txt");
		int dado;
		while ((dado = in.read()) != -1) {
            out.write(dado);
        }
		in.close();
		out.close();
	}

}
