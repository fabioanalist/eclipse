package cursojava.executavel;

import javax.swing.JOptionPane;

public class entradadedados {
	
	public static void main(String[] args) {
		
		
		String carros = JOptionPane.showInputDialog("Informe a Quantidade de Carros");
		String pessoas = JOptionPane.showInputDialog("Informe a Quantidade de Pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		JOptionPane.showMessageDialog(null,"Divisão para Pessoas deu " + divisao + " carros e sobrou " + resto + " carros");
		
			 
		
		
		
	}
	
	

}
