package br.org.serratec.exemplos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo002 {
	public static void main(String[] args) {

		List alunos; 
		int preco = 100;
		preco = 200;
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia: " + data);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
