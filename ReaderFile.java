import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
     public static void ler(String path) {
          try {
               FileReader arq = new FileReader(path);
               BufferedReader lerArq = new BufferedReader(arq);

               String linha = lerArq.readLine(); // lê a primeira linha
               // a variável "linha" recebe o valor "null" quando o processo
               // de repetição atingir o final do arquivo texto
               while (linha != null) { //add $t0, $s2, $t0
                    Verificacao.verifi(linha);
                    linha = lerArq.readLine(); // lê da segunda até a última linha     
               }
                  
               arq.close();
          } catch (IOException e) {
               System.err.printf("Erro na abertura do arquivo: %s.\n",
                         e.getMessage());
          }
     }
}
