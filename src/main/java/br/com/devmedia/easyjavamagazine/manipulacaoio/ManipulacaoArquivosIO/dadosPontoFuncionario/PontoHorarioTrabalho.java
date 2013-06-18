package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario;

public class PontoHorarioTrabalho {

	private ApontadorHoras apontadorHoras;
	
	public PontoHorarioTrabalho(ApontadorHoras apontadorHoras) {
		this.apontadorHoras = apontadorHoras;
	}
	
	public String listar() {
		return "\nEntrada: " + apontadorHoras.getHorarioEntrada() + "\nSaída para Almoço = " + apontadorHoras.getHorarioSaidaAlmoco() + 
				"\nVolta do Almoço = " + apontadorHoras.getHorarioVoltaAlmoco() + "\nHorário de Saída = " + apontadorHoras.getHorarioSaida() + 
				"\nHorário de Trabalho Total = " + apontadorHoras.getData();
	}

	public ApontadorHoras getApontadorHoras() {
		return apontadorHoras;
	}

	public void setApontadorHoras(ApontadorHoras apontadorHoras) {
		this.apontadorHoras = apontadorHoras;
	}
}
