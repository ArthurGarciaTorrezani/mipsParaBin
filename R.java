import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class R { // add
     public static String returnbinario(String instrucao, String[] word) {
          // rs rt rd
          Instrucao instrucaotext = new Instrucao();
          String binarInstru = instrucaotext.getr(instrucao); // vai virar o "numero"
          String[] naopadroes = { "sll", "srl", "sra", "bgezal", "bgtz", "lui" };

          List<String> lista = Arrays.asList(naopadroes);

          String binario = "";

          String[] traduzida = new String[3];
          
          if (word.length == 3) {
               traduzida = Tradutor.returnTraducao(word[1], word[2], null);
          } else if (word.length == 2) {
               traduzida = Tradutor.returnTraducao(word[1], null, null);
          } else {
               traduzida = Tradutor.returnTraducao(word[1], word[2], word[3]);
          }
          
          if (!lista.contains(instrucao)) {
               binario = "000000" + traduzida[1] + traduzida[2] + traduzida[0] + "00000"
                       + binarInstru;
               return binario;
          }
          
          if (instrucao.equals("sll")) {
               binario = "000000" + "00000" + traduzida[1] + traduzida[0] + traduzida[2] + "000000";
               return binario;
          }
          
          if (instrucao.equals("srl") || instrucao.equals("sra")) {
               binario = "000000" + "00000" + traduzida[1] + traduzida[0] + traduzida[2]
                       + binarInstru;
               return binario;
          }

          if (instrucao.equals("mfhi")) {
               binario = "000000" + "00000" + "00000" + traduzida[0] + "00000" + binarInstru;
               return binario;
          }

          if (instrucao.equals("mthi") || instrucao.equals("mtlo")) {
               binario = "000000" + traduzida[0] + "00000" + "00000" + "00000" + binarInstru;
               return binario;
          }

          if (instrucao.equals("mflo")) {
               binario = "000000" + "00000" + "00000" + traduzida[0] + "00000" + binarInstru;
               return binario;
          }

          if (instrucao.equals("mult") || instrucao.equals("multu" ) || instrucao.equals("div") || instrucao.equals("divu")) {
               binario = "000000" + traduzida[1] + traduzida[0] + "00000" + "00000"
                       + binarInstru;
               return binario;
          }

          if (instrucao.equals("jr")) {
               binario = "000000" + traduzida[1] + "00000" + "00000" + "00000"
                       + binarInstru;
               return binario;
          }

          if (instrucao.equals("jarl")) {
               binario = "000000" + traduzida[1] + "00000" + traduzida[1] + "00000"
                       + binarInstru;
               return binario;
          }

          return binario;
     }

}
