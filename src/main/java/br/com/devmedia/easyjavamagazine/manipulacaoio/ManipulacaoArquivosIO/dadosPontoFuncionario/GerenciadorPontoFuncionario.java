package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioBufferedWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioConsole;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioFileWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioOutputStream;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorioPrintWriter;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.LeitorDados;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.EntradaDadosSystemIn;

public class GerenciadorPontoFuncionario {
	
	public static void main(String args[]) {
		gerarRelatorioPrintWriter();
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

}
