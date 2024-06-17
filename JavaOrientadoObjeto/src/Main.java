
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 3, "Feliz");
        Gato gato1 = new Gato("Frajola", "Preto", 10);
        Passaro passaro1 = new Passaro("Rex", "Branco", 10);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}
