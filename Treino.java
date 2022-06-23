package Main;

import java.util.ArrayList;

public class Treino {
    private ArrayList<Atividade> exercicios;

    public Treino(ArrayList<Atividade> exercicios) {
        this.exercicios = exercicios;
    }


    public Atividade exibirExercicio(int i){
        if(exercicios.size() > i && exercicios.size() != 0 && i >= 0){
            return exercicios.get(i);
        }
        return null;
    }
    public ArrayList<Atividade> pegarTodosExercicios(){
        return exercicios;
    }

    public ArrayList<Atividade> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Atividade> exercicios) {
        this.exercicios = exercicios;
    }
}
