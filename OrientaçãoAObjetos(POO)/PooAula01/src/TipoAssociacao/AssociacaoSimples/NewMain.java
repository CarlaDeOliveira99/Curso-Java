/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TipoAssociacao.AssociacaoSimples;

/**
 *
 * @author carla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Brinquedo brinc = new Brinquedo();
       brinc.nome = "Bolinha verde";
       
       Cachorro c = new Cachorro();
       c.nome =  "Bob";
       c.BrinquedoFavorito = brinc;
      
       System.out.println(c.BrinquedoFavorito.nome);
    }
    
}
