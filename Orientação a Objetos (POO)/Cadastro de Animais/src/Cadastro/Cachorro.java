/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadastro;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Cachorro extends Cadastro {

    private Scanner teclado;

    public Cachorro() {
        this.teclado = new Scanner(System.in);

    }

    public void setCadastrarCachorro() {

        
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
            
            this.codigo = 1;
            
            
      
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
                if (this.porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 40;
                } else if (this.porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 42;
                } else if (this.porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 45;
                }
            } else if (idade > 6 && idade <= 7) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 44;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 47;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 50;
                }
            } else if (idade > 7 && idade <= 8) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 48;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 51;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 55;
                }
            } else if (idade > 8 && idade <= 9) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 52;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 56;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 61;
                }
            } else if (idade > 9 && idade <= 10) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 56;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 60;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 66;
                }
            } else if (idade > 10 && idade <= 11) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 60;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 65;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 72;
                }
            } else if (idade > 11 && idade <= 12) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 64;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 69;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 77;
                }
            } else if (idade > 12 && idade <= 13) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 68;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 74;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 82;
                }
            } else if (idade > 13 && idade <= 14) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 72;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 78;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 88;
                }
            } else if (idade > 14 && idade <= 15) {
                if (porte.equalsIgnoreCase("pequeno")) {
                    idadeHumano = 76;
                } else if (porte.equalsIgnoreCase("medio")) {
                    idadeHumano = 83;
                } else if (porte.equalsIgnoreCase("grande")) {
                    idadeHumano = 93;

                }
            }
         
        return idadeHumano;
    }

  @Override
    public String toString() {
         return super.toString() + "\nIdade convertida em humano: " + this.getIdadeConvertidaHumano() +  
                 "\nCategoria Cachorro " +  "\n";
        
    }
}
