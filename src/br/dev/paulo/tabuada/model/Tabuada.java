package br.dev.paulo.tabuada.model;

public class Tabuada {

	private double Multiplicando;
	private double menorMultiplicador;
	private double maiorMultiplicador;

	public double getMultiplicando() {
		return Multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		Multiplicando = multiplicando;
	}

	public double getMenorMultiplicador() {
		return menorMultiplicador;
	}

	public void setMenorMultiplicador(double menorMultiplicador) {
		this.menorMultiplicador = menorMultiplicador;
	}

	public double getMaiorMultiplicador() {
		return maiorMultiplicador;
	}

	public void setMaiorMultiplicador(double maiorMultiplicador) {
		this.maiorMultiplicador = maiorMultiplicador;
	}

	public String[] exibirTabuada() {
		
		if(menorMultiplicador > maiorMultiplicador) {
			double temp = maiorMultiplicador;
			maiorMultiplicador = menorMultiplicador;
			menorMultiplicador = temp;
		}
	 
		int tamanhoVetor = (int) (maiorMultiplicador - menorMultiplicador + 1);
		String tabuada[] = new String[tamanhoVetor];
		
		int i = 0;
	while(menorMultiplicador<= maiorMultiplicador) {
		
		double produto = Multiplicando * menorMultiplicador;
		// multiplicando x menorMultiplicador = produto
		tabuada[i] = Multiplicando +" X " + menorMultiplicador + " = " + produto;

//		System.out.printf("%s X %s = %s\n", Multiplicando, menorMultiplicador, produto);
		menorMultiplicador++;
		i++;
	}
	return tabuada;
}

}
