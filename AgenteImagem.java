import java.util.ArrayList;
import java.util.List;

public class AgenteImagem extends AgenteIA{
    @Override public void processarRequisicao(String input){
        AgenteImagem.conectarServidor();
        if (input.contains("hackear") || input.contains("roubar") || input.contains("biométrico")){
            throw new PromptInadequadoException ("Você mandou um prompt inadequado.");
        } 
        System.out.println("Agente de Imagem "+ AgenteImagem.getNome() +" sintetizando pixels para: " + input);
    }

    List<AgenteIA> orquestrador = new ArrayList<>();
    orquestrador.add("AgenteChat");
    orquestrador.add("AgenteImagem");

    public void processarFila(List<AgenteIA> lista, String comando){
        for (AgenteIA i; i<orquestrador; i++){
            i.executarTarefa(comando);
        }
    }
}
