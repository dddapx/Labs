public class AgenteTexto extends AgenteIA{
    @Override public void processarRequisicao(String input) throws FalhaProcessamentoAgenteException, PromptInadequadoException, ErroComunicacaoIAException {
        this.conectarServidor();
        if (input.length() > 500){
            throw new FalhaProcessamentoAgenteException ("Você superou o limite de caracteres do prompt.");
        } 
        System.out.println("Agente de Texto " + this.getNome()+ " gerando resposta para: " + input);
    }
}
