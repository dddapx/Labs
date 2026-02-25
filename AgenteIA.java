public abstract class AgenteIA {
    protected String nome = "GPT-4";
    protected String status = "IDLE";

    public String getNome() {
        return nome;
    }

    public void conectarServidor() throws ErroComunicacaoIAException {

    }

    public abstract void processarRequisicao(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException;

    public void processarPrompt(String prompt) throws FalhaProcessamentoAgenteException {
        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }
        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
        }
        System.out.println("Agente processando: " + prompt);
    }

    public void verificarSeguranca(String prompt) throws PromptInadequadoException {
        if (prompt == null) return;
        if (prompt.contains("hackear") || prompt.contains("roubar")) {
            throw new PromptInadequadoException("O prompt não pode conter palavras inadequadas.");
        }
        System.out.println("Agente processando: " + prompt);
    }

    public void chamarModeloExterno () throws ErroComunicacaoIAException {
        double numAleatorio = Math.random();

        if (numAleatorio > 0.7) {
            throw new ErroComunicacaoIAException ("O modelo superou o tempo limite.");
        } else {
            System.out.println("Conexão validada.");
        }
    }
}