package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioBufferedWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioConsole;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioFileWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioOutputStream;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioPrintWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.LeitorDados;

public class GerenciadorEscritaRelatorio {
	
	private LeitorDados leitorDados;

	public GerenciadorEscritaRelatorio(LeitorDados leitorDados) {
		this.leitorDados = leitorDados;
	}
	
	public void gerarRelatorio(TipoGeracaoRelatorio tipoGeracaoRelatorio) {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		switch (tipoGeracaoRelatorio) {
		case BUFFERED_WRITER:
			gerador.gerarRelatorioDiario(leitorDados, new GeradorRelatorioBufferedWriter());
			break;
		case FILE_WRITER:
			gerador.gerarRelatorioDiario(leitorDados, new GeradorRelatorioFileWriter());
			break;
		case OUTPUT_STREAM:
			gerador.gerarRelatorioDiario(leitorDados, new GeradorRelatorioOutputStream());
			break;
		case PRINT_WRITER:
			gerador.gerarRelatorioDiario(leitorDados, new GeradorRelatorioPrintWriter());
			break;
		default:
			gerador.gerarRelatorioDiario(leitorDados, new GeradorRelatorioConsole());
			break;
		}
	}

}
