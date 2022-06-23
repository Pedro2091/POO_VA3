package Main;

public class AvaliacaoFisica {
    private float peso;
    private float altura;

    public AvaliacaoFisica(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        return peso/(altura*altura);
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
