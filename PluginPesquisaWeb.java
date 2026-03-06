public class PluginPesquisaWeb implements IAcaoAgente {
    /*Regra: Se o comando for "hackear" ou "roubar", deve lançar PromptInadequadoException.
      Retorno: "Resultado da pesquisa no Google sobre: [comando]". */
    @Override
    public void analiseCodigo (String comando) throws PromptInadequadoException{
      if (comando.toLowerCase().contains("hackear") ||
          comando.toLowerCase().contains("roubar")){
            throw new PromptInadequadoException("O prompt não pode conter palavras inadequadas.");
      }
      System.out.println("Resultado da pesquisa no Google sobre: "+comando);
    }
}
