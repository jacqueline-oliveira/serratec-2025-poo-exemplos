package org.serratec.aula05.modelos;

public class Imovel {
	private Endereco endereco;
	private TipoImovel tipo;
	private double valor;
	private Pessoa dono;
	
	public Imovel(Endereco endereco, TipoImovel tipo, double valor, Pessoa dono) {
		super();
		this.endereco = endereco;
		this.tipo = tipo;
		this.valor = valor;
		this.dono = dono;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoImovel getTipo() {
		return tipo;
	}

	public void setTipo(TipoImovel tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return "Imovel [endereco=" + endereco + ", tipo=" + tipo + ", valor=" + valor + ", dono=" + dono + "]";
	}
	
}
