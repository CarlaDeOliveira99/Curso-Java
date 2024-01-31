package Cadastro;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Gato extends Cadastro {
    
    
     private Scanner teclado;

    public Gato() {
        this.teclado = new Scanner(System.in);

    }

    public void setCadastrarGato() {

            System.out.println("Digite o nome do seu bichinho: ");
            this.nome = teclado.next();

            System.out.println("Qual é o sexo do seu bichinho:");
            this.sexo = teclado.next();

            System.out.println("Qual é a idade de seu bichinho?  ");
            this.idade = teclado.nextInt();

            System.out.println("Qual é a raça? ");
            this.raca = teclado.next();

            System.out.println("Qual é o porte? (pequeno, médio, grande ");
            this.porte = teclado.next();
            
            System.out.println("Qual é o nome do dono? ");
            this.dono = teclado.next();
            
             this.codigo = 2;

    }


    public int getIdadeConvertidaHumano() {
        int idadeHumano = 0;
        
            if (this.idade <= 1) {
                idadeHumano = 15;
            } else if (idade > 1 && idade <= 2) {
                idadeHumano = 24;
            } else if (idade > 2 && idade <= 3) {
                idadeHumano = 28;
            } else if (idade > 3 && idade <= 4) {
                idadeHumano = 32;
            } else if (idade > 4 && idade <= 5) {
                idadeHumano = 36;
            } else if (idade > 5 && idade <= 6) {
                idadeHumano = 40;
            } else if (idade > 6 && idade <= 7) {
                idadeHumano = 44;
            } else if (idade > 7 && idade <= 8) {
                idadeHumano = 48;
            } else if (idade > 8 && idade <= 9) {
                idadeHumano = 52;
            } else if (idade > 9 && idade <= 10) {
                idadeHumano = 56;
            } else if (idade > 10 && idade <= 11) {
                idadeHumano = 60;
            } else if (idade > 11 && idade <= 12) {
                idadeHumano = 64;
            } else if (idade > 12 && idade <= 13) {
                idadeHumano = 68;
            } else if (idade > 13 && idade <= 14) {
                idadeHumano = 72;
            } else if (idade > 14 && idade <= 15) {
                idadeHumano = 76;
            }

        return idadeHumano;
    }

  @Override
    public String toString() {
         return super.toString() + "\nIdade convertida em humano: " + this.getIdadeConvertidaHumano() + "\nCategoria Gato\n "+ "\n";
        
    }
    
    
    
}
