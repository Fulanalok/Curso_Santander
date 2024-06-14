import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Rex", "Marrom",25, 5.5, 3, "feliz");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());

        System.out.println("O cachorro pegou uma" + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.Interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.Interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.Interagir("vai dormir"));
    }
}
