package Main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Atividade> exercicios1 = new ArrayList<Atividade>();
        Atividade aparelho1 = new Aparelho("LegPress", 1, 12, "Perna");
        Atividade aparelho2 = new Aparelho("Esteira", 2, 10, "Aquecimento");
        Atividade aparelho3 = new Aparelho("Bicicleta", 3, 20, "Aquecimento");
        exercicios1.add(aparelho1);
        exercicios1.add(aparelho2);
        exercicios1.add(aparelho3);

        ArrayList<AvaliacaoFisica> avaliacoes1 = new ArrayList<AvaliacaoFisica>();
        AvaliacaoFisica avaliacao1 = new AvaliacaoFisica(80, 1.70F);
        avaliacoes1.add(avaliacao1);

        Treino treino1 = new Treino(exercicios1);
        FichaDoAluno ficha1 = new FichaDoAluno(treino1, avaliacoes1);
        Aluno aluno1 = new Aluno("Carlos", 12, ficha1);


        aluno1.getFicha().relatorio();
    }
}
