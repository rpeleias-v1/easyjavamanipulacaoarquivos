package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado;

import java.io.Console;
import java.io.IOException;

public class EntradaDadosConsole implements EntradaTeclado {

	@Override
	public String realizarLeitura(String mensagemEntradaDados) throws IOException {
		Console c = System.console();
		return c.readLine(mensagemEntradaDados);
	}

}
