package br.com.devmedia.easyjavamagazine.manipulacaoio.ManipulacaoArquivosIO;

import java.util.Calendar;
import java.util.Date;

public class ApontadorHoras {

	private Date data;
	private double horarioEntrada;
	private double horarioSaida;
	private double horarioSaidaAlmoco;
	private double horarioVoltaAlmoco;
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void setHorarioEntrada(double horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public void setHorarioSaidaAlmoco(double horarioSaidaAlmoco) {
		this.horarioSaidaAlmoco = horarioSaidaAlmoco;
	}

	public void setHorarioVoltaAlmoco(double horarioVoltaAlmoco) {
		this.horarioVoltaAlmoco = horarioVoltaAlmoco;
	}

	public double getHorarioEntrada() {
		return horarioEntrada;
	}

	public double getHorarioSaida() {
		return horarioSaida;
	}

	public double getHorarioSaidaAlmoco() {
		return horarioSaidaAlmoco;
	}

	public double getHorarioVoltaAlmoco() {
		return horarioVoltaAlmoco;
	}

	public void setHorarioSaida(double horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public double calcularHorarioDiario() {
		return (horarioSaida - horarioEntrada) - (horarioVoltaAlmoco - horarioSaidaAlmoco);
	}
	
	public boolean horarioDeTrabalhoValido() {
		return horarioSaida > horarioEntrada;
	}
	
	public boolean horarioDeAlmocoValido() {
		return horarioSaidaAlmoco < horarioVoltaAlmoco;
	}

}
