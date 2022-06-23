package Main;

public class Aparelho extends Atividade{
    private String nome;
    private float carga;
    private int repeticoes;
    public String tipo;

    public Aparelho(String nome, float carga, int repeticoes, String tipo) {
        this.nome = nome;
        this.carga = carga;
        this.repeticoes = repeticoes;
        this.tipo = tipo;
    }

    public void relatorioExercicio(){
        System.out.println("\nNome: " + this.nome + "\nCarga: " + this.carga + "\nNúmero de repetições: " + this.repeticoes + "\nTipo Aparelho: " + this.tipo + "\n");
    }


    public String getNome() {
        return nome;
    }

    public float getCarga() {
        return carga;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
