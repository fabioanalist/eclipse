package cursojava.executavel;

import javax.swing.JOptionPane;

public class calculodemedia {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a Nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a Nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a Nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a Nota 4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if (media >= 50 ) {
			
			if (media >=70 ) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado com a M�dia de :" + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em Recupera��o com M�dia de :" + media);
			}
		}else {		
	    	JOptionPane.showMessageDialog(null, "Aluno Esta Reprovado com M�dia de :" + media);
	    	

		}
		
		
	}
	
	
	}
