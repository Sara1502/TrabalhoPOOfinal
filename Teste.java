package Main;

import static org.junit.jupiter.api.Assertions.*;

class Teste {

    @org.junit.jupiter.api.Test
    void testmediafinal() {
        Aluno aluno1 = new Aluno("Lissa");
        aluno1.notastrab("trab1", 7, 4);
        aluno1.notaspro("prova1", 8, 6);
        assertEquals(7.2,aluno1.mediafinal());
    }
}
