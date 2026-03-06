public class PluginGeradorCodigo implements IAcaoAgente {
    /*Regra: Se o comando tiver mais de 50 caracteres, lança FalhaProcessamentoAgenteException (limite de tokens de código).
      Retorno: "Snippet de código Java gerado para: [comando]".*/
    @Override
    public String analiseCodigo (String comando){
      if (comando.toLowerCase().contains("hackear") ||
          comando.toLowerCase().contains("roubar")){
            throw new PromptInadequadoException("O prompt não pode conter palavras inadequadas.");
      }
      System.out.println("Resultado da pesquisa no Google sobre: "+comando);
    }
}
