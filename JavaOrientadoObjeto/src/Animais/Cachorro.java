package Animais;

public class Cachorro extends Animal {

    //atributos

    static int numeroDeCachorro;
    private int tamanhoDoRabo;

    //construtor default

    public Cachorro(String nome, String cor, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome,
                cor,
                peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorro  ++;

    }

    //contrutores

    public static int getNumeroDeCachorro() {
        return numeroDeCachorro;
    }

    public static void setNumeroDeCachorro(int numeroDeCachorro) {
        Cachorro.numeroDeCachorro = numeroDeCachorro;
    }

    private String estadoDeEspirito;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.equals("Lilly"))
            this.nome = null;
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
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "nada":
                this.estadoDeEspirito = "neutro";
                break;

            default:
                this.estadoDeEspirito = "Neutro";
                break;
        }

        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!");
    }
}
