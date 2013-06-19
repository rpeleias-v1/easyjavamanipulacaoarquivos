package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExibicaoRelatorioScanner implements ExibicaoRelatorio{

	@Override
	public void executar(File relatorioPontoDiario) throws IOException {
		InputStream in = new FileInputStream(relatorioPontoDiario);
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(inr);
		Scanner s = new Scanner(reader);
		
		while(s.hasNext()) {
			System.out.println("Linha do relatório utilizando Scanner = " + s.next());
		}
		
		s.close();
		reader.close();
		inr.close();
		in.close();
	}

}
