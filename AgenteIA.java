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

    public void verificarPrompt(String prompt) throws FalhaProcessamentoAgenteException {
        if (prompt == "hackear" || prompt == "roubar") {
            throw new FalhaProcessamentoAgenteException("O prompt não pode conter palavras inadequadas.");
        }
        System.out.println("Agente processando: " + prompt);
    }

    public void chamarModeloExterno (double numAleatorio){
        double numAleatorio = Math.random();

        if (numAleatorio > 0.7) {
            throw new ErroComunicacaoIAException ("O número não pode ser maior que 0.7.")
        } else {
            System.out.println("O número é válido.");
        }
    }
}