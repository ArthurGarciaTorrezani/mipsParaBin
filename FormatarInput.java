public class FormatarInput {
     public static String[] Format(String word) {
          String palavraFormatada = word.replace(" $", ",");
          palavraFormatada = palavraFormatada.replace(" ", "");

          if (word.contains("(")) {
               palavraFormatada = palavraFormatada.replace("$", ""); // lw,t0,0(t7)
               palavraFormatada = palavraFormatada.replace("(", ",").replace(")", "");// lw,t0,0,t7
               String[] certa = palavraFormatada.split(",");
               String temp = certa[2];
               certa[2] = certa[3];
               certa[3] = temp;
               return certa;
          } else {
               palavraFormatada = palavraFormatada.replace(",,", ",");
               String[] certa = palavraFormatada.split(",");
               return certa;
          }

     }
}
