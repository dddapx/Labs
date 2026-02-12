public class PromptInadequadoException extends Exception {
    public void verificarPrompt(String prompt) throws FalhaProcessamentoAgenteException {
        if (prompt == "hackear" || prompt == "roubar") {
            throw new FalhaProcessamentoAgenteException("O prompt não pode conter palavras inadequadas.");
        }
        System.out.println("Agente processando: " + prompt);
    }
    public void chamarModeloExterno (double numAleatorio){
        double numAleatorio = Math.random();

        if (numAleatorio > 0.7) {
            
        }
    }
}