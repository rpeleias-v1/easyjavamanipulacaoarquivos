package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio;

import java.io.IOException;

public abstract class GeradorRelatorio {
	
	public void gerar(String dadosRelatorioTrabalho) {
		try {
			gerarArquivoSaida(dadosRelatorioTrabalho);
		} catch (IOException e) {
			System.out.println("Falha na geração do relatório!");
			e.printStackTrace();
		} finally {
			System.out.println("\nRelatório de Ponto diário gerado com sucesso!");
		}
	}

	protected abstract void gerarArquivoSaida(String dadosRelatorioTrabalho) throws IOException;
}
