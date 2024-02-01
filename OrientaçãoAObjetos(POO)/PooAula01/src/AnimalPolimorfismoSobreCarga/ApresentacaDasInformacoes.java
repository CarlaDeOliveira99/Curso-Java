package AnimalPolimorfismoSobreCarga;

/**
 *
 * @author carla
 */
public class ApresentacaDasInformacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir(true);
        c.reagir(5, 5);

    }

}
