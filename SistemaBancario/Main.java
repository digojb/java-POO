package SistemaBancario;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		
		c1.abrirConta("cc");
		c1.setNumConta(111);
		c1.setDono("Diogo");
		c1.depositar(0);
		c1.sacar(50);
		c1.fecharConta();
		c1.estadoAtual();

	}

}
