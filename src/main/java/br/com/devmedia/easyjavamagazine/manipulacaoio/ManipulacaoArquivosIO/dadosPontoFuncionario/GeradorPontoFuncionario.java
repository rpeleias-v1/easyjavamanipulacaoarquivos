package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.geradorRelatorio.GeradorRelatorio;
import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado.LeitorDados;

public class GeradorPontoFuncionario {
	
	private LeitorDados leitorDados;
	private GeradorRelatorio geradorRelatorio;
	
	public void gerarRelatorioDiario(LeitorDados leitorDados, GeradorRelatorio geradorRelatorio) {
		ApontadorHoras apontadorHoras = leitorDados.realizarLeituraDados();
		if (!apontadorHoras.horarioDeTrabalhoValido()) {
			System.out.println("Horário de trabalho Inválido!");
			System.exit(0);
		}
		PontoHorarioTrabalho pontoHorarioTrabalho = new PontoHorarioTrabalho(apontadorHoras);
		geradorRelatorio.gerar(pontoHorarioTrabalho.listar());
	}

	public LeitorDados getLeitorDados() {
		return leitorDados;
	}

	public void setLeitorDados(LeitorDados leitorDados) {
		this.leitorDados = leitorDados;
	}

	public GeradorRelatorio getGeradorRelatorio() {
		return geradorRelatorio;
	}

	public void setGeradorRelatorio(GeradorRelatorio geradorRelatorio) {
		this.geradorRelatorio = geradorRelatorio;
	}
	
	
}
