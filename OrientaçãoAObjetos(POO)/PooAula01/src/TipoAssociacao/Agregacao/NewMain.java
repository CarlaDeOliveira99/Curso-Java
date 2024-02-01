/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TipoAssociacao.Agregacao;

/**
 *
 * @author carla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor p = new Professor();
        Escola e = new Escola();
        
        e.setProf(p);
        e.terAula();
        
        p.passearComDog();
    }
    
}
