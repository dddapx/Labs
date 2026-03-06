public interface IAcaoAgente {
    String usarHabilidade(String comando) throws FalhaProcessamentoAgenteException, PromptInadequadoException;
}
