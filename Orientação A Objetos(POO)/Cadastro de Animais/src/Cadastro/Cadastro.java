package Cadastro;

import java.util.Random;

/**
 *
 * @author carla
 */
public class Cadastro {

    //atributos
    protected String nome;
    protected String sexo;
    protected int idade;
    protected String raca;
    protected String porte;
    protected String dono;
    protected int codigo;
    protected String vacina;
 

    //metodos get e set 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    

   
    

    @Override
    public String toString() {
        return "======== dados ========"
                + "\nNome: " + nome
                + "\nSexo: " + sexo
                + "\nIdade: " + idade
                + "\nRaca: " + raca
                + "\nPorte: " + porte
                + "\nNome do Dono: " + dono;
               
                

    }

}
