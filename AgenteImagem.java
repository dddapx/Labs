import java.util.ArrayList;
import java.util.List;

public class AgenteImagem extends AgenteIA{
    @Override public void processarRequisicao(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException {
        if (input.contains("hackear") || input.contains("roubar") || input.contains("biométrico")){
            throw new PromptInadequadoException ("Você mandou um prompt inadequado.");
        } 
        System.out.println("Agente de Imagem "+ this.getNome() +" sintetizando pixels para: " + input);
    }

    public void processarFila(List<AgenteIA> lista, String comando){
        List<AgenteIA> orquestrador = new ArrayList<>();
        orquestrador.add(new AgenteTexto());
        orquestrador.add(new AgenteImagem());
        for (AgenteIA i : orquestrador){
            i.processarRequisicao(comando);
        }
    }
}
