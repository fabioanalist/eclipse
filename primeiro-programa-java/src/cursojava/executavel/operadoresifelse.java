package cursojava.executavel;

public class operadoresifelse {

	public static void main(String[] args) {
	
		/*
		int mediaAluno = 50;
		String nome = "Fabio";
		
	if (mediaAluno >= 70 && nome.equals("Alex")) {
				System.out.println("Parabens Voce esta Aprovado");
				
	} else if (mediaAluno < 70) {
		System.out.println(" Voce esta Reprovado");
	} else {
		System.out.println("Aluno não Encontrado");
	}
	}
	*/
	
	int nota1 = 10;
	int nota2 = 60;
	int nota3 = 70;
	int nota4 = 80;
	int media = 0;
	
	media = (nota1 + nota2 + nota3 + nota4) /4;
	
	/*Condicoes Logicas If Else*/
	/*
	 if (media >=70) {
		 System.out.println("Aluno Aprovado " + media);
	 } if (media >= 40 && media <= 69) {
		System.out.println("Aluno em Recuperacao: "+ media); 
		 
	 }	 
	 else {
		 System.out.println("Aluno Reprovado " + media);
	}*/
	

	/*saidaResultado = media >= 70 ? "aluno Aprovado" : "Aluno Reprovado";*/ 
	
	 /*Operadora Ternários sao para micro validações*/
	/*
	String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperacao" : "Reprovado";
	 
	System.out.println(saidaResultado);
	*/
	
	/*Operacoes logicas aninhadas: sao operacoes dentro de operacoes*/
	
	if (media >= 50) {
		if (media >= 70) {
			if (media > 90) {
				System.out.println("Aprovado - Parabens");
			}
			System.out.println("Aprovado");
		}else {
			System.out.println("Recuperação");
		
}