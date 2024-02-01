/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TipoAssociacao.Dependencia;

/**
 *
 * @author carla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GerenciadorArquivos gd = new GerenciadorArquivos();
        gd.enviaArquivoTexto("Bom dia! Boa tarde e Boa noite...");
        
        gd.enviaArquivoTextoGoogle(new GoogleDrive());
        
    }
    
}
