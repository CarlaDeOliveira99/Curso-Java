package Cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.text.Caret;

/**
 *
 * @author carla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Cadastro> registro = new ArrayList<Cadastro>();

        int escolha = 0;

        do {
            System.out.println("Escolha a opção a baixo: \n"
                    + "1 - Preencher Cadastro\n"
                    + "2-  Informações do cadastro completo\n"
                    + "3 - Situação da vacina\n"
                    + "4- sair");
            escolha = teclado.nextInt();

            if (escolha == 1) {

                System.out.println("Escolhao nº abaixo qual animal deseja cadastrar:\n"
                        + "1 - Cachorro\n"
                        + "2 - Gato\n"
                        + "3 - Papagaio\n"
                        + "4 - Coelho\n"
                        + "5 - Menu\n");

                int animalEscolhido = teclado.nextInt();

                switch (animalEscolhido) {
                    case 1:
                        Cachorro ca = new Cachorro();
                        ca.setCadastrarCachorro();
                        registro.add(ca);
                        break;
                    case 2:
                        Gato ga = new Gato();
                        ga.setCadastrarGato();
                        registro.add(ga);
                        break;
                    case 3:
                        Papagaio pa = new Papagaio();
                        pa.setCadastrarPapagaio();
                        registro.add(pa);
                        break;
                    case 4:
                        Coelho co = new Coelho();
                        co.setCadastrarCoelho();
                        registro.add(co);
                        break;
                    case 5:
                        animalEscolhido = escolha;
                        break;
                }

            } else if (escolha == 2) {

                for (int i = 0; i < registro.size(); i++) {

                    System.out.println(registro.get(i));
                }

            } else if (escolha == 3) {

                String resuVacina = " ";

                Random ale = new Random();
                int valor = ale.nextInt(2);

                switch (valor) {
                    case 0:
                        resuVacina = "Todas as vacinas em dia";
                        break;
                    case 1:
                        resuVacina = " Possui uma vacina em atraso";
                        break;
                    case 2:
                        resuVacina = " Não possui nenhuma vacina em dia ";
                }
                
               

               
            }

        } while (escolha != 4);

        if (escolha
                == 4) {
            System.out.println("Sessão finalizada");
        }
    }

}
