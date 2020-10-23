package br.com.unipe.aula.model;

public class Banco {
	
	private double dollar;
	private double CotacaoDollar;
	
	
	public Banco() {}
	
	public Banco(double dollar, double cotacaoDollar) {
		super();
		this.dollar = dollar;
		CotacaoDollar = cotacaoDollar;
	}
	

	@Override
	public String toString() {
		return "Banco [dollar=" + dollar + ", CotacaoDollar=" + CotacaoDollar + "]";
	}

	public double getCotacaoDollar() {
		return CotacaoDollar;
	}

	public void setCotacaoDollar(double cotacaoDollar) {
		CotacaoDollar = cotacaoDollar;
	}
	
	public double getDollar() {
		return dollar;
	}
	public void setDollar(double dollar) {
		this.dollar = dollar;
	}
	
	

}
