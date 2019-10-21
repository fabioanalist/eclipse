package cursojava.executavel;

import classes.Aluno;
public class hashCode {

public static void main(String[] args) {
	

	Aluno aluno1 = new Aluno();
	aluno1.setNome("Alex");
	aluno1.setNumeroCPF("123");
	
	Aluno aluno2 = new Aluno();
	aluno1.setNome("Alex");
	aluno1.setNumeroCPF("1234");
	
	if (aluno1.equals(aluno2)) {
		System.out.println("Iguais");
	}else {
		System.out.println("Diferentes");
	}
}	
}
