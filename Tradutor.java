public class Tradutor {
     public static String[] returnTraducao(String r1, String r2, String r3) { // lw $t0, $t1 1200
          Registrador registrador = new Registrador(); // slti $s1, $s2, 245
                                                       // mfhi $s1
                                                       // mult $s1, $s2
          String traducao[] = new String[3];

          if (r1 == null) {
               traducao[0] = "00000";
          } else if (registrador.getMip(r1) != null) { // v
               traducao[0] = registrador.getMip(r1);
          } else {
               traducao[0] = Integer.toBinaryString(Integer.parseInt(r1));
          }

          if (r2 == null) {
               traducao[1] = "00000";
          } else if (registrador.getMip(r2) != null) { // v
               traducao[1] = registrador.getMip(r2);
          } else {
               System.out.println(r2);
               traducao[1] = Integer.toBinaryString(Integer.parseInt(r2));
          }

          if (r3 == null) {
               traducao[2] = "00000";
          } else if (registrador.getMip(r3) != null) {
               traducao[2] = registrador.getMip(r3);
          } else {
               traducao[2] = Integer.toBinaryString(Integer.parseInt(r3)); // v
          }

          traducao[0] = arrumarbinario(traducao[0], 5);
          traducao[1] = arrumarbinario(traducao[1], 5);
          traducao[2] = arrumarbinario(traducao[2], 5);

          return traducao;
     }

     public static String arrumarbinario(String binario, int tamanho) {
          if (binario.length() < tamanho) {
               int diferenca = tamanho - binario.length();
               for (int i = 0; i < diferenca; i++) {
                    binario = "0" + binario;
               }
          } else if (binario.length() > tamanho) {
               String last16 = binario.substring(binario.length() - 16);
               binario = last16;
          }

          return binario;
     }
}
