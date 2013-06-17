package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO;

public class RelatorioHorarioTrabalho {

	private ApontadorHoras apontadorHoras;
	
	public RelatorioHorarioTrabalho(ApontadorHoras apontadorHoras) {
		this.apontadorHoras = apontadorHoras;
	}
	
	public String listar() {
		return "Entrada: " + apontadorHoras.getHorarioEntrada() + "\nSaída para Almoço = " + apontadorHoras.getHorarioSaidaAlmoco() + 
				"\nVolta do Almoço = " + apontadorHoras.getHorarioVoltaAlmoco() + "\nHorário de Saída = " + apontadorHoras.getHorarioSaida() + 
				"\nHorário de Trabalho Total = " + apontadorHoras.getData();
	}
}
