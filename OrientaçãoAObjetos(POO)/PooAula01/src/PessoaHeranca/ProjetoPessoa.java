package PessoaHeranca;

/**
 *
 * @author carla
 */
public class ProjetoPessoa {
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Pedro");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p4.setNome("Fabiana");
       
       p1.setIdade(18);
       p2.setIdade(16);
       p3.setIdade(25);
       p4.setIdade(20);
       
       
       p1.setSexo("M");
       p2.setSexo("F");
       p3.setSexo("F");
       p4.setSexo("F");
       
       p2.setCurso("informatica");
       p3.setSalario(2500.75f);
       p4.setSetor("estoque");
       
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
