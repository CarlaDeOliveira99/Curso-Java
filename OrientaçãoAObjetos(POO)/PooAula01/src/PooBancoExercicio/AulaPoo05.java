package PooBancoExercicio;

public class AulaPoo05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono(" Carla ");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Gian");
        p2.abrirConta("CP");

        p1.estadoAtual();
        p2.estadoAtual();

    }

}
