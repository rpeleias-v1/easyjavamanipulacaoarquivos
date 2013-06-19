package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

import java.io.File;
import java.io.IOException;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioBufferedWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioConsole;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioFileWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioOutputStream;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioPrintWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.EntradaTeclado;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.LeitorDados;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.EntradaDadosSystemIn;

public class GerenciadorPontoFuncionario {
	
	public static void main(String args[]) {
		try {
			EntradaTeclado entradaTeclado = new EntradaDadosSystemIn();
			String opcaoSistema = entradaTeclado.realizarLeitura("Digite a opção 1 para geração de relatório ou"
				+ "\2 para a exibição de um relatório");
			switch (opcaoSistema) {
			case "1":
				
				break;
			case "2":
				
				break;
			default:
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void gerarRelatorioBufferedReader() {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		gerador.gerarRelatorioDiario(new LeitorDados(new EntradaDadosSystemIn()), new GeradorRelatorioBufferedWriter());
	}
	
	private static void gerarRelatorioConsole() {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		gerador.gerarRelatorioDiario(new LeitorDados(new EntradaDadosSystemIn()), new GeradorRelatorioConsole());
	}
	
	private static void gerarRelatorioFileWriter() {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		gerador.gerarRelatorioDiario(new LeitorDados(new EntradaDadosSystemIn()), new GeradorRelatorioFileWriter());
	}
	
	private static void gerarRelatorioOutputStream() {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		gerador.gerarRelatorioDiario(new LeitorDados(new EntradaDadosSystemIn()), new GeradorRelatorioOutputStream());
	}
	
	private static void gerarRelatorioPrintWriter() {
		GeradorPontoFuncionario gerador = new GeradorPontoFuncionario();
		gerador.gerarRelatorioDiario(new LeitorDados(new EntradaDadosSystemIn()), new GeradorRelatorioPrintWriter());
	}
	
	private static void leitorRelatorioBufferedReader(File relatorioPontoFuncionario) {
		
	}

}
