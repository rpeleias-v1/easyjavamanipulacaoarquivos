package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.leituraTeclado;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO.dadosPontoFuncionario.ApontadorHoras;

public abstract class LeitorDados {

	public ApontadorHoras realizarLeituraDados() {
		ApontadorHoras apontadorHoras = new ApontadorHoras();
		try {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			Date data = (Date)formatter.parse(realizarLeitura("Insira a data desejada = "));  
			double horarioEntrada = Double.parseDouble(realizarLeitura("Insira o horário de Entrada no trabalho = "));
			double horarioSaidaAlmoco = Double.parseDouble(realizarLeitura("Insira o horário de saída para o almoço = "));
			double horarioVoltaAlmoco = Double.parseDouble(realizarLeitura("Insira o horário de volta do almoço = "));
			double horarioSaida = Double.parseDouble(realizarLeitura("Insira o horário de saída do trabalho = "));
			
			
			apontadorHoras.setData(data);
			apontadorHoras.setHorarioEntrada(horarioEntrada);
			apontadorHoras.setHorarioSaidaAlmoco(horarioSaidaAlmoco);
			apontadorHoras.setHorarioVoltaAlmoco(horarioVoltaAlmoco);
			apontadorHoras.setHorarioSaida(horarioSaida);
		} catch (NumberFormatException e) {
			System.out.println("Entrada de horários inválida!");
		} catch (ParseException e) {
			System.out.println("Entrada de data inválida!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return apontadorHoras;
	}
	
	public abstract String realizarLeitura(String mensagemEntradaDados) throws IOException;

}
