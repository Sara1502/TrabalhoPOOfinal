package Main;

public class Main {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Vitor");
        aluno1.notasTrab("trab1", 7, 8);
        aluno1.notasPro("prova1", 7, 4);
        System.out.println(aluno1.nome+" |Media final: "+aluno1.mediaFinal());
    }
}
