/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoAssociacao.AssociacaoMultipla;

/**
 *
 * @author carla
 */
public class Pessoa {
    
    public String nome;
    public Email[] ListaEmail; //Asscociacao multipla

    public Pessoa() {
        this.ListaEmail = new Email[10];
    }
    
    
    public void addEmail(Email email) {
        for (int i = 0; i < this.ListaEmail.length; i++) {
            if (this.ListaEmail[i] == null) {
                this.ListaEmail[i] = email;
                break;
            }
        }
    }
    
    public void listaEmail() {
        for (Email email : ListaEmail) {
            if(email == null) {
                continue;
            }
            System.out.println(email.conteudo + " Id: " + email.Id);
        }
    }
    
}
