
package pooaula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status (){ 
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Ponta "  + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Modelo " + this.modelo);
    
}
    
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
         this.tampada = false;
    }
}
