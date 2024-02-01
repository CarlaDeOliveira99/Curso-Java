package herancaAbstractExtends;

/**
 *
 * @author carla
 */
public class Aluno extends Cadastro {

    private int matricula;
    private String curso;
    
    
    public void pagarMensalidade(){
        System.out.println("Pagando a mensalidade do aluno" + this.nome );
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    
}
