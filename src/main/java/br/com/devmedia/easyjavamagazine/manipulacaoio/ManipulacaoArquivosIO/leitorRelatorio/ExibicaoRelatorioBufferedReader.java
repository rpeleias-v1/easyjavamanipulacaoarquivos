package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExibicaoRelatorioBufferedReader implements ExibicaoRelatorio {

	@Override
	public void executar(File relatorioPontoDiario) throws IOException {
		InputStream in = new FileInputStream(relatorioPontoDiario);
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inr);
		
		String linhaDoRelatorio = reader.readLine();
		
		while(linhaDoRelatorio != null) {
			System.out.println("Linha do relatório = " + linhaDoRelatorio);
			linhaDoRelatorio = reader.readLine();
		}
		
		reader.close();
		inr.close();
		in.close();
	}

}
