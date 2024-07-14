import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class I {

     public static String returnbinario(String instrucao, String[] word) {
          Instrucao instrucaotext = new Instrucao(); // lw pra binario

          String binario = instrucaotext.getl(instrucao); // "7"

          String[] naopadroes = { "bltz", "bgez", "bltzal", "bgezal", "bgtz", "lui" };

          List<String> lista = Arrays.asList(naopadroes);

          String[] traduzida = new String[3];

          if (word.length == 3) {
               traduzida = Tradutor.returnTraducao(word[1], word[2], null); //mult $s1, $s2
          }else if(word.length == 2){
               traduzida = Tradutor.returnTraducao(word[1], null, null); //mfhi $s1
          }else {
               traduzida = Tradutor.returnTraducao(word[1], word[2], word[3]); //lw $t0, $t1 1200
          }

          if (!lista.contains(instrucao)) {
               traduzida[2] = Tradutor.arrumarbinario(traduzida[2], 16);
               binario += traduzida[1] + traduzida[0] + traduzida[2];
               return binario;
          }

          if (instrucao.equals("lui")) {
               traduzida[2] = Tradutor.arrumarbinario(traduzida[1], 16);
               binario += "00000" + traduzida[0] + traduzida[2];
               return binario;
          }

          if (instrucao.equals("bgtz") || instrucao.equals("blez") || instrucao.equals("bltz")) {
               traduzida[1] = Tradutor.arrumarbinario(traduzida[1], 16);
               binario += traduzida[0]  + "00000"  + traduzida[1];
               return binario;
          }

          if (instrucao.equals("bgez")) {
               traduzida[1] = Tradutor.arrumarbinario(traduzida[1], 16);
               binario += traduzida[0]  + "00001"  + traduzida[1];
               return binario;
          }

          if (instrucao.equals("bltzal")) {
               traduzida[1] = Tradutor.arrumarbinario(traduzida[1], 16);
               binario += traduzida[0]  + Tradutor.arrumarbinario(Integer.toBinaryString(16), 6)
                       + traduzida[1];
               return binario;
          }

          if (instrucao.equals("bgezal")) {
               traduzida[1] = Tradutor.arrumarbinario(traduzida[1], 16);
               binario += traduzida[2] +  Tradutor.arrumarbinario(Integer.toBinaryString(17), 6)
                       + traduzida[1];
               return binario;
          }

          return binario;
     }
}
