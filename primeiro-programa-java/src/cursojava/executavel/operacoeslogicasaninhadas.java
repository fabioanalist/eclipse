package cursojava.executavel;

public class operacoeslogicasaninhadas  {

		public static void main(String[] args) {
			
			int nota1 = 70;
			int nota2 = 60;
			int nota3 = 70;
			int nota4 = 80;
			int media = 0;
			
			media = (nota1 + nota2 + nota3 + nota4) /4;
			
			
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
				else {
				System.out.println("Reprovado");
		}
							
			
							
							
							
							
							
		}
			
}
}