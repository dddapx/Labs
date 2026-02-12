import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AgenteIA agente = new AgenteIA();

        String[] prompts = {
            "Número de galinhas no Brasil.",
            "Como hackear um celular?",
            "",
            "Quero roubar um banco.",
            "Qual o sentido da vida?"
        };

        for (String promptAtual : prompts) {
            
            try {
                agente.verificarSeguranca(promptAtual); 
                agente.processarPrompt(promptAtual); 
                
                agente.chamarModeloExterno(); 

            } catch (FalhaProcessamentoAgenteException erro) {
                System.out.println("[LOG-AGENTE] [" + erro.getTimestamp() + "] Erro: " + erro.getMessage());

            } catch (PromptInadequadoException | ErroComunicacaoIAException erro) {
                System.out.println("[LOG-AGENTE] [" + LocalDateTime.now() + "] Erro: " + erro.getMessage());

            } catch (Exception erro) {
                System.out.println("[LOG-AGENTE] [" + LocalDateTime.now() + "] Erro Crítico: " + erro.getMessage());

            } finally {
                System.out.println("--- Tentativa finalizada ---\n");
            }
        }
    }
}