package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioBufferedWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.LeitorDadosSystenIn;

public class GerenciadorPontoFuncionario {
	
	public static void main(String args[]) {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		gerador.gerarRelatorioDiario(new LeitorDadosSystenIn(), new GeradorRelatorioBufferedWriter());
	}

}
