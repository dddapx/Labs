public class PluginGeradorCodigo implements IAcaoAgente {
    /*Regra: Se o comando tiver mais de 50 caracteres, lança FalhaProcessamentoAgenteException (limite de tokens de código).
      Retorno: "Snippet de código Java gerado para: [comando]".*/
    @Override
    public String usarHabilidade (String comando) throws FalhaProcessamentoAgenteException{
      if (comando.length() > 50){
        throw new FalhaProcessamentoAgenteException("Limite de tokens de código atingido.");
      }
      return("Snippet de código Java gerado para: "+comando);
    }
}
