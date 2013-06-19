package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leitorRelatorio;

import java.io.File;
import java.io.IOException;

public interface ExibicaoRelatorio {
	
	void executar(File relatorioPontoDiario) throws IOException;

}
