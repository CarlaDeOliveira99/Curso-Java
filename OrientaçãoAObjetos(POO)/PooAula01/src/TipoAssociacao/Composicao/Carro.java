/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoAssociacao.Composicao;

/**
 *
 * @author carla
 */
public class Carro {
    
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }
    
   
    public void andar() {
        this.motor.ligar();
        System.out.println("Ta andando");
    }
    
   
}
