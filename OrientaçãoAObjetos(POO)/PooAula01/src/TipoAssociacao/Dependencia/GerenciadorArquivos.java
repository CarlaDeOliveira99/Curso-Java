
package TipoAssociacao.Dependencia;

/**
 *
 * @author carla
 */
public class GerenciadorArquivos {
    
    
    public void enviaArquivoTexto(String texto) {
        GoogleDrive gd = new GoogleDrive(); //Dependencia
        OneDrive od = new OneDrive(); //Dependencia
        
        gd.envia(texto, false);
        od.envia(texto);
    }
           
    public void enviaArquivoTextoGoogle(GoogleDrive gd /*dependencia*/) {
        gd.envia("Texto padrao", true);
    }
    
}
