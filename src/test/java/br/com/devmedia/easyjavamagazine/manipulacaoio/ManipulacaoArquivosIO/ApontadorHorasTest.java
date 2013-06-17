package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ApontadorHorasTest {

	ApontadorHoras apontador;
	
	@Before
	public void inicializar() {
		apontador = new ApontadorHoras();
	}
	
	@Test
	public void testCalculoHorasDiarias() {
		apontador.setHorarioEntrada(9.0d);
		apontador.setHorarioSaidaAlmoco(12.0d);
		apontador.setHorarioVoltaAlmoco(13.0d);
		apontador.setHorarioSaida(18.0d);
		assertEquals(apontador.calcularHorarioDiario(), 8.0d, 0.0001);
	}
	
	@Test
	public void testCalculoHorarioTrabalhoPositivo() {
		apontador.setHorarioEntrada(9.0d);
		apontador.setHorarioSaida(18.0d);
		assertTrue(apontador.horarioDeTrabalhoValido());
	}
	
	@Test
	public void testCalculoHorarioTrabalhoNaoNegativo() {
		apontador.setHorarioEntrada(9.0d);
		apontador.setHorarioSaida(8.0d);
		assertFalse(apontador.horarioDeTrabalhoValido());
	}
	
	@Test
	public void testCalculoHorarioAlmocoPositivo() {
		apontador.setHorarioSaidaAlmoco(12.0d);
		apontador.setHorarioVoltaAlmoco(13.0d);
		assertTrue(apontador.horarioDeAlmocoValido());
	}
	
	@Test
	public void testCalculoHorarioAlmocoNaoNegativo() {
		apontador.setHorarioSaidaAlmoco(13.0d);
		apontador.setHorarioVoltaAlmoco(12.0d);
		assertFalse(apontador.horarioDeAlmocoValido());
	}
}
