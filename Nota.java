package Main;

import java.util.ArrayList;

public class Nota {
    ArrayList<Trabalho> tra = new ArrayList<Trabalho>();
    ArrayList<Prova> pro = new ArrayList<Prova>();

    public void addtrab (String nome, double nota, double peso){
        Trabalho trabalhos = new Trabalho(nome, nota, peso);
        tra.add(trabalhos);
    }
    public void addpro (String nome, double nota, double peso){
        Prova provas = new Prova(nome, nota, peso);
        pro.add(provas);
    }
    public double calnotapeso (){
        double mediatrab = 0;
        double mediapro = 0;
        for (int i = 0; i < tra.size(); i++) {
           mediatrab += tra.get(i).nota*tra.get(i).peso;
        }
        for (int i = 0; i < pro.size(); i++) {
            mediapro += pro.get(i).nota*pro.get(i).peso;
        }
        return mediatrab+mediapro;
    }
    public double somapeso() {
        double mediatrab = 0;
        double mediapeso = 0;
        for (int i = 0; i < tra.size(); i++) {
            mediatrab += tra.get(i).peso;
        }
        for (int i = 0; i < pro.size(); i++) {
            mediapeso += pro.get(i).peso;
        }
        return  mediatrab+mediapeso;

    }
}
