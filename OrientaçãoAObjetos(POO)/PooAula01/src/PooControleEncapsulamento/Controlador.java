package PooControleEncapsulamento;
public interface Controlador {
    
    // criar a parte da interface
    
    public abstract void ligar(); // no lugar do void pode retornar uma String, inteiro e assim por diante
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
