package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class RelatorioHorarioTrabalhoTest {

	ApontadorHoras apontadorHoras;
	RelatorioHorarioTrabalho relatorioHorarioDeTrabalho;
	
	@Before
	public void inicializar() {
		apontadorHoras = new ApontadorHoras();
		apontadorHoras.setData(Calendar.getInstance().getTime());
		apontadorHoras.setHorarioEntrada(9.0d);
		apontadorHoras.setHorarioSaidaAlmoco(12.0d);
		apontadorHoras.setHorarioVoltaAlmoco(13.0d);
		apontadorHoras.setHorarioSaida(18.0d);
	}
	
	@Test
	public void testGerarRelarorioHorarioTrabalho() {
		relatorioHorarioDeTrabalho = new RelatorioHorarioTrabalho(apontadorHoras);
		String resumoRelatorioDiarioDeTrabalho = "Entrada: " + apontadorHoras.getHorarioEntrada() + "\nSaída para Almoço = " + apontadorHoras.getHorarioSaidaAlmoco() + 
				"\nVolta do Almoço = " + apontadorHoras.getHorarioVoltaAlmoco() + "\nHorário de Saída = " + apontadorHoras.getHorarioSaida() + 
				"\nHorário de Trabalho Total = " + apontadorHoras.getData();
		assertEquals(resumoRelatorioDiarioDeTrabalho, relatorioHorarioDeTrabalho.listar());
	}

}
