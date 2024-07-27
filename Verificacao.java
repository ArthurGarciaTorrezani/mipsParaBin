public class Verificacao {
     public static String verifi(String word) {
          Instrucao instrucao = new Instrucao();
          String[] teste = word.split(" ");
          String type = teste[0];
          if (instrucao.getl(type) != null) { // verifica se ta no I
               if (word.contains("(")) {
                    String[] formatada = FormatarInput.Format(word);
                    String retorno = I.returnbinario(type, formatada);
                    return word + "\n" + retorno + "\n";
               } else {
                    String[] formatada = FormatarInput.Format(word);
                    String retorno = I.returnbinario(type, formatada);
                    return word + "\n" + retorno + "\n";
               }

          } else if (instrucao.getr(type) != null) { // verifica se ta no R
               String[] formatada = FormatarInput.Format(word);
               String retorno = R.returnbinario(type, formatada);
               return word + "\n" + retorno + "\n";
          } else { // verifica se ta no J
               String[] wordCerta = word.split(" ");
               String retorno = J.returnBinario(instrucao.getr(wordCerta[0]), wordCerta);
               return word + "\n" + retorno + "\n";
          }
     }
}
