package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio;

import java.io.File;
import java.io.IOException;

public class LeitorRelatorio { 
	
	private ExibicaoRelatorio exibicaoRelatorio;
	
	public void ler(File relatorioPontoDiario) {
		try {
			exibicaoRelatorio.executar(relatorioPontoDiario);
		} catch (IOException e) {
			System.out.println("Falha na exibição do relatório!");
		}
	}
	
	public void trocar(ExibicaoRelatorio exibicaoRelatorio) {
		this.exibicaoRelatorio = exibicaoRelatorio;
	}
}
