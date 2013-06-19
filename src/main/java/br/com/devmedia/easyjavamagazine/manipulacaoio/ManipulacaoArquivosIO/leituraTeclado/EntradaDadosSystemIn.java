package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EntradaDadosSystemIn implements EntradaTeclado {

	@Override
	public String realizarLeitura(String mensagemEntradaDados) throws IOException {
		System.out.print(mensagemEntradaDados);
		InputStream is = System.in;
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
	    return br.readLine();
	}

}
