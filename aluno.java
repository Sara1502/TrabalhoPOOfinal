
package Main;

public class Alunos {
    String nome;
    Notas notas = new Notas();

    public Alunos(String nome) {
        this.nome = nome;
    }
    public void notasTrab (String nome, double nota, double peso){
        this.notas.addTrab(nome, nota, peso);
    }
    public void notasPro (String nome, double nota, double peso){
        this.notas.addPro(nome, nota, peso);
    }
    public double mediaFinal() {
        return notas.calnotapeso()/notas.somapeso();
    }

}
