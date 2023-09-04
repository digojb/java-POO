package Metodos;

public class Caneta {

	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;

	public Caneta() {
		this.modelo = "BIC";
		this.cor = "Azul";
		this.tampar();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.tampada);
	}

}
