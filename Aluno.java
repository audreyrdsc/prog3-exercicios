import java.util.Scanner;

class Aluno {
	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4]; //notas x média
	
	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }
	
	  public Aluno() {

    }

	
	boolean verificarSituacao(double media) {
        return media >= 7;
    }
	
	public void exibirInformacoes() {
		System.out.println("Histórico Escolar");
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + curso);
		for(int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina: " + disciplinas[i] + 
							   " Notas: "     + notasDisciplinas[i][0] + " " + notasDisciplinas[i][1] + " " + notasDisciplinas[i][2] +
							   " Média: " 	  + notasDisciplinas[i][3]);
			
			//if(notasDisciplinas[i][3] >= 7) {
			//	System.out.println("Situação: Aprovado");
			//} else {
			//	System.out.println("Situação: Reprovado");
			//}
			String situacao = verificarSituacao(notasDisciplinas[i][3]) ? "Aprovado" : "Reprovado";
			System.out.println("Situação: " + situacao);	
			
			
							   
		}
	
	}
	
public void calcularMedia() {
        for (int i = 0; i < disciplinas.length; i++) {
            double notasCalculo = 0;
            for (int j = 0; j < 3; j++) {
                notasCalculo += notasDisciplinas[i][j];
            }
            double media = notasCalculo / 3;
            notasDisciplinas[i][3] = media; // Salva a média na quarta posição (índice 3)
            //System.out.println("Média da disciplina " + disciplinas[i] + ": " + media);
        }
    }
}

class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		a1.nome = scan.nextLine();
		
		System.out.println("Matrícula: ");
		a1.matricula = scan.nextLine();
		
		System.out.println("Curso: ");
		a1.curso = scan.nextLine();
		
		for (int i=0; i < a1.disciplinas.length; i++) {
			System.out.println("Disciplina 0" + (i+1) + ": ");
			//scan.nextLine();
			a1.disciplinas[i] = scan.nextLine();
		
			for (int j=0; j < (a1.notasDisciplinas[i].length - 1); j++) {
				System.out.println("Nota 0" + (j+1) + ": ");
				a1.notasDisciplinas[i][j] = scan.nextDouble();
			}
			scan.nextLine();
				
		}
		
		
		//a1.nome = "Pedro Santos";
		//a1.matricula = "123456";
		//a1.curso = "Ciência da Computação";
		//a1.disciplinas = new String[] {"Programação III", "Banco de Dados", "Engenharia de Software"};
		//a1.notasDisciplinas = new double[][] {{5,5,5,0},{8,8,8,0},{7,7,7,0}};
		
		a1.calcularMedia();
		a1.exibirInformacoes();
	}

}