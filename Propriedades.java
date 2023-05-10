package Entidades;

import java.util.ArrayList;

public abstract class Propriedades {
	
	private String endereco;
	private int numerodequartos;
	private Double preco;
	
	//Novo Atributo
	
	private ArrayList<Reserva> reservas;
	
	public Propriedades (String endereco, int numerodequartos, Double preco) {
		this.endereco = endereco;
		this.numerodequartos = numerodequartos;
		this.preco = preco;
		
		//Inicializa o ArrayList de Reservas
		this.reservas = new ArrayList<Reserva>();
	}
	
	public String Getendereco(){
		return endereco;
		
	}
	
	public void Setendereco (String endereco) {
		this.endereco = endereco;
	}
	
	public int Getnumerodequartos () {
		return numerodequartos;
	}
	
	public void Setnumerodequartos (int numerodequartos) {
		this.numerodequartos = numerodequartos;
	}
	
	public Double Getpreco () {
		return preco;
	}
	
	public void Setpreco (Double preco) {
		this.preco = preco;
		
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void addReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public abstract String getDescricao();
	

}
