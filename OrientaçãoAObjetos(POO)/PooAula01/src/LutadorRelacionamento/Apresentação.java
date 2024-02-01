package LutadorRelacionamento;
public class Apresentação {
    public static void main(String[] args) {
     Lutador l[] = new Lutador[6]; 
     l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
     l[1] = new Lutador("Putscript", "Brasil",29, 1.70f, 60.9f, 14, 2, 3);
     l[2] = new Lutador("Snapshadow", "Eua", 27, 1.65f, 62.4f, 1, 6, 8);
     l[3] = new Lutador("Dead Code", "Austrália", 38, 1.70f, 70.2f, 20, 5, 10);
     l[4] = new Lutador("UfoCobol", "Brasil", 24, 1.67f, 75.9f, 5, 4, 6);
     l[5] = new Lutador("NerdArt", "EUA", 34, 1.74f, 80.5f, 13, 5, 4);
     
    Luta UEC01 = new Luta();
    UEC01.marcarLuta(l[0], l[1]);
    UEC01.lutar();
    l[0].status();
    l[1].status();
    
    }
    
}
