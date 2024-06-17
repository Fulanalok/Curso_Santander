import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Chopper", "Amarelo", 20, 7,  "feliz");

        Gato gato1 = new Gato("Frajola", "Preto", 4.5);

        Passaro passaro1 = new Passaro("piriquito", "verde", 2);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
