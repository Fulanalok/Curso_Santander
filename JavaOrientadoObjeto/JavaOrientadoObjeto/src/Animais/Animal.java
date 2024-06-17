package Animais;

public class Animal {
    protected String nome;

    protected String cor;

    protected int altura;

    protected double peso;

    protected String estadoDeEspirito;

    protected void comer() {
    }

    protected void soar() {

    }
    protected void dormir() {
    }

    private int tamanhoDoRabo;

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome=" + nome + '\'' +
                '}';
    }
}