public class Main {
    public static void main (String[] args){
        try {
            // Tenta chamar o agente
            agente.processarPrompt(promptDoUsuario);
            agente.chamarModeloExterno(); // Onde pode dar o erro de conexão
        } catch (PromptInadequadoException e) {
            // AQUI é o Dashboard de Segurança
            System.out.println("[LOG-SEGURANÇA] Tentativa de ataque: " + e.getMessage());
        } catch (ErroComunicacaoIAException e) {
            // AQUI é o Dashboard de Rede
            System.out.println("[LOG-REDE] Falha de conexão: " + e.getMessage());
        } catch (Exception e) {
            // Outros erros genéricos
            System.out.println("[LOG-GERAL] Erro: " + e.getMessage());
        } finally {
            // O checklist pede isso aqui para garantir que executa mesmo com falha
            System.out.println("Processamento da tentativa encerrado.");
        }
    }
}