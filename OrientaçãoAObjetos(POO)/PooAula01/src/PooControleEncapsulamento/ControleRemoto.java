package PooControleEncapsulamento;
public class ControleRemoto implements Controlador {
     // aqui sera privado para que não seja modificado
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // metodos especiais
    
        // controlador
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // get e set
    
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public boolean getLigado(){
        return ligado;
    }
    
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    public boolean getTocando(){
        return tocando;
    }
    
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    
    // metodos abstratos em import

    @Override  // significa sobescrevendo
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---------- Menu ----------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
            
        }
        System.out.println(" ");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechar Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
