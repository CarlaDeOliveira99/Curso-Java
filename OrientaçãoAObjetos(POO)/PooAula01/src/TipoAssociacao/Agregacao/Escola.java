/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoAssociacao.Agregacao;

/**
 *
 * @author carla
 */
public class Escola {

    private Professor prof;

    public void terAula() {
        System.out.println("Toca o sino, driiin");
        prof.darAula();
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

}
