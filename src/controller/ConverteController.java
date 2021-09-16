package controller;

import br.edu.fateczl.brunosantos.Pilha;

public class ConverteController {
	public void decimalToBinario(int numero) {
		Pilha p = new Pilha();
		//final String resultado;
		String resultado = "";
		while(numero > 0) {
			int resto = numero % 2;
			p.push(resto);
			numero /= 2;
		}
		while(!(p.pilhaVazia())) {
			try {
				int desempilha = p.pop();
				 
				 resultado = Integer.toString(desempilha);
				 
				 System.out.print(resultado);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
