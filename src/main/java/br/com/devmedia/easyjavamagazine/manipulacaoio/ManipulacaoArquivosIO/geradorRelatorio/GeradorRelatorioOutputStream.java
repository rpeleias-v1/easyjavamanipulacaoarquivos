package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class GeradorRelatorioOutputStream extends GeradorRelatorio{

	@Override
	protected void gerarArquivoSaida(String dadosRelatorioTrabalho) throws IOException {
		InputStream in = new  ByteArrayInputStream(dadosRelatorioTrabalho.getBytes());
		OutputStream out = new FileOutputStream("saida.txt");
		int dado;
		while ((dado = in.read()) != -1) {
            out.write(dado);
        }
		in.close();
		out.close();
	}

}
