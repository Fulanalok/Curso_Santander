package Animais;

import org.w3c.dom.ls.LSOutput;

public class Cachorro {

    private String nome;

    private String cor;

    private int altura;

    private double peso;

    private int tamanhoDoRabo;

    //contrutores

    public Cachorro() {}

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    private String estadoDeEspirito;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.equals("Lilly"))
            this.nome = null;
    }

    private void comer() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void latir() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return " Bolinha ";
    }

    public String Interagir(String acao) {

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz";
            break;
            case "vai dormir": this.estadoDeEspirito = "bravo";
            break;
            case "nada": this.estadoDeEspirito = "neutro";
                break;

            default: this.estadoDeEspirito = "Neutro";break;
        }

        return this.estadoDeEspirito;




//        if(acao.equals("carinho")) {
//            this.estadoDeEspirito = "feliz";
//        }else if(acao.equals("vai dormir")) {
//            this.estadoDeEspirito = "Bravo";
//        }else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
    }
}
