package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

import java.io.File;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio.ExibicaoRelatorioBufferedReader;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio.ExibicaoRelatorioFileReader;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio.ExibicaoRelatorioInputStream;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio.ExibicaoRelatorioScanner;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio.LeitorRelatorio;

public class GerenciadorLeituraRelatorio {
	
	private String relatorioLeituraArquivo;
	private File arquivoRelatorio;
	
	public GerenciadorLeituraRelatorio(String relatorioLeituraArquivo) {
		this.relatorioLeituraArquivo = relatorioLeituraArquivo;
	}

	public boolean existeRelatorio() {
		arquivoRelatorio = new File(relatorioLeituraArquivo);
		if(!arquivoRelatorio.exists()) {
			return false;
		}
		return true;
	}

	public void lerRelatorio(TipoLeituraRelatorio tipoLeituraRelatorio) {
		LeitorRelatorio leitor = new LeitorRelatorio();
		switch (tipoLeituraRelatorio) {
		case BUFFERED_READER:
			leitor.trocar(new ExibicaoRelatorioBufferedReader());
			break;

		case FILE_READER:
			leitor.trocar(new ExibicaoRelatorioFileReader());
			break;
			
		case INPUT_STREAM:
			leitor.trocar(new ExibicaoRelatorioInputStream());
			break;
			
		default:
			leitor.trocar(new ExibicaoRelatorioScanner());
			break;
		}
		leitor.ler(arquivoRelatorio);
	}
}
