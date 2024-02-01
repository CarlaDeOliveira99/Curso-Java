package herancaAbstractExtends;

/**
 *
 * @author carla
 */
public class Bolsista extends Aluno {

    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome); 
    }
    
    
    // para não subescrever colocar final(folha no aluno, bolsista não pode sobreposto)
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista!! pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
