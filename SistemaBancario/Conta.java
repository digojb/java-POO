package SistemaBancario;

public class Conta {
	public int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public Conta() {
		saldo = 0;
		status = false;

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String t) {
		setTipo(t);
		this.setStatus(true);
		if (t == "cp") {
			this.setSaldo(150);
		} else if (t == "cc") {
			this.setSaldo(50);
		}

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Erro ao fechar conta, saldo disponível");
		} else if (this.getSaldo() < 0) {
			System.out.println("Erro ao fechar conta, débito pendente");
		} else {
			this.setStatus(false);
		}
	}

	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + getDono());
		} else {
			System.out.println("A conta está fechada");
		}

	}

	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("A conta esta fechada");
		}

	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v = 12;
		} else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga");
		} else {
			System.out.println("Saldo insuficiente");

		}
	}

	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

}
