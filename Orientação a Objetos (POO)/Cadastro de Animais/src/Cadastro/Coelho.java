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
public class Coelho extends Cadastro{
   private Scanner teclado;

    public Coelho() {
        this.teclado = new Scanner(System.in);

    }

    public void setCadastrarCoelho() {

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

         this.codigo = 4;
    } 
    
    @Override
    public String toString() {
        return super.toString() + "\nCategoria Coelho " + "\n";

    }
}
