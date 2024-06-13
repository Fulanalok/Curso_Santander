import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Rex";
        cachorro1.cor = "branco";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        cachorro1.latir();
        System.out.println("O cachorro pegou uma" + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.Interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.Interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.Interagir("vai dormir"));
    }
}
