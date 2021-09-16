package view;

import controller.ConverteController;

public class Principal {
	public static void main(String args[]) throws Exception {
		int decimal = 10;
		ConverteController cc = new ConverteController();
		cc.decimalToBinario(decimal);
	}
}
