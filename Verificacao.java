public class Verificacao {
     public static void verifi(String word) {
          Registrador mip = new Registrador();
          Instrucao instrucao = new Instrucao();

          String[] teste = word.replace(",", "").split(" ");
          String palavraFormatada = word.replace(" $",","); //  lw    ,t0, 0($t7)
          palavraFormatada = palavraFormatada.replace(" ",""); // lw,t0,0($t7)

          String type = teste[0];
          if (instrucao.getl(type) != null) {
               if (word.contains("(")) {
                    palavraFormatada = palavraFormatada.replace("$",""); // lw,t0,0(t7)
                    System.out.println(palavraFormatada);
                    palavraFormatada = palavraFormatada.replace("(",",").replace(")","");// lw,t0,0,t7
                    String[] certa = palavraFormatada.split(",");
                    String temp = certa[2];
                    certa[2] = certa[3];
                    certa[3] = temp;
                    String retorno = I.returnbinario(type, certa);
                    System.out.println(retorno);
               } else {
                    palavraFormatada = palavraFormatada.replace(",,",",");
                    System.out.println(palavraFormatada);
                    String[] certa = palavraFormatada.split(",");
                    String retorno = I.returnbinario(type, certa);
                    System.out.println(retorno);
               }

          }else if(instrucao.getr(type) != null) { // srl    $t0, $t0, 1
               palavraFormatada = palavraFormatada.replace(",,",",");
               System.out.println(palavraFormatada);
               String[] certa = palavraFormatada.split(",");
               System.out.println(R.returnbinario(type, certa));
          }else{
               String[] wordCerta = word.split(" ");
               J.returnBinario(instrucao.getr(wordCerta[0]),wordCerta);
          }
     }
}
