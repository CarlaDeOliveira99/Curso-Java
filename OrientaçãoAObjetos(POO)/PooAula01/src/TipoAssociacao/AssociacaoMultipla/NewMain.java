/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TipoAssociacao.AssociacaoMultipla;

/**
 *
 * @author carla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.addEmail(new Email("Teste123@gmail"));
        p.addEmail(new Email("xablau@gmail"));
        p.addEmail(new Email("babtata@gmail"));
        
        p.listaEmail();
    }
    
}
