public class AgenteIA {
    public void processarPrompt(String prompt) throws FalhaProcessamentoAgenteException {
        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }
        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
        }
        System.out.println("Agente processando: " + prompt);
    }
}