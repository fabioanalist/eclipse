package cursojava.executavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
	 
		String nome = JOptionPane.showInputDialog("Qual nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("Qual idade do Aluno ?");
		/*
		String dataNascimento = JOptionPane.showInputDialog("Qual a Data de Nascimento ?");
		String registroGeral = JOptionPane.showInputDialog("Qual RG do Aluno ?");
		String cpf = JOptionPane.showInputDialog("Qual CPF do Aluno ?");
		String nomeMae = JOptionPane.showInputDialog("Qual Nome da Mae do Aluno ?");
		String nomePai = JOptionPane.showInputDialog("Qual Nome do Pai do Aluno ?");
		String matricula = JOptionPane.showInputDialog("Qual Data da Matricula do Aluno ?");
		String serie = JOptionPane.showInputDialog("Qual a Serie do Aluno ?");
		String escola = JOptionPane.showInputDialog("Qual a Escola do Aluno ?");
	*/
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCPF(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setEscola(escola);*/

		/*
		Disciplina disciplina1= new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Servidores");
		disciplina2.setNota(90);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Linux");
		disciplina3.setNota(90);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Windows");
		disciplina4.setNota(90);
		aluno1.getDisciplinas().add(disciplina4);
		*/
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+"?" );
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+"?");
		
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0);{
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue());
		}
		
		System.out.println(aluno1.toString());
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é do Aluno é:" + aluno1.getIdade());
		
		System.out.println("Média do Aluno é:" + aluno1.getMediaNota());
    	/*System.out.println("Resultado 1 do Aluno é:" + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));*/
    	
    	
    	
	
	/*
		Aluno aluno = new Aluno();
		System.out.println(aluno1.toString());
		System.out.println("Média do Aluno é:" + aluno1.getMediaNota());
    	System.out.println("Resultado 1 do Aluno é:" + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Data Nascimento é do Aluno é:" + aluno1.getDataNascimento());
		
	*/
	
	
	
	
	}

	
	
}