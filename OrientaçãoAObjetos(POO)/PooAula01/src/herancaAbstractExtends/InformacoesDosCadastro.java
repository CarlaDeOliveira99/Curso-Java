package herancaAbstractExtends;

/**
 *
 * @author carla
 */
public class InformacoesDosCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cadastro p1 = new Peesoa(); desta forma esta errado, pois tem abstract 
        
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        
        
        a1.setNome("Gian");
        a1.setMatricula(222);
        a1.setIdade(23);
        
        
        
        v1.setNome("Carla");
        v1.setSexo("F");
        v1.setIdade(23);
        
        System.out.println(v1.toString());
    }
    
}
