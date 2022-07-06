package Main;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lissa");
        aluno1.notastrab("trab1", 7, 4);
        aluno1.notaspro("prova1", 8, 6);
        System.out.println(aluno1.nome+" |Media final: "+aluno1.mediafinal());
    }
}
