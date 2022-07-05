package Main;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vitor");
        aluno1.notastrab("trab1", 7, 8);
        aluno1.notaspro("prova1", 7, 4);
        System.out.println(aluno1.nome+" |Media final: "+aluno1.mediafinal());
    }
}
