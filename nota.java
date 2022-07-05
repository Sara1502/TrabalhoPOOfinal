package Main;

import java.util.ArrayList;

public class Notas {
    ArrayList<Trabalhos> tra = new ArrayList<Trabalhos>();
    ArrayList<Provas> pro = new ArrayList<Provas>();

    public void addtrab (String nome, double nota, double peso){
        Trabalhos trabalhos = new Trabalhos(nome, nota, peso);
        tra.add(trabalhos);
    }
    public void addpro (String nome, double nota, double peso){
        Provas provas = new Provas(nome, nota, peso);
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
