import java.util.HashMap;
import java.util.Map;

public class Registrador {
     private Map<String, String> registradores = new HashMap<String, String>();

     public Registrador() {
          registradores.put("at", "00001");
          registradores.put("v0", "00010");
          registradores.put("v1", "00011");
          registradores.put("a0", "00100");
          registradores.put("a1", "00101");
          registradores.put("a2", "00110");
          registradores.put("a3", "00111");

          registradores.put("t0", "01000");
          registradores.put("t1", "01001");
          registradores.put("t2", "01010");
          registradores.put("t3", "01011");
          registradores.put("t4", "01100");
          registradores.put("t5", "01101");
          registradores.put("t6", "01110");
          registradores.put("t7", "01111");
          
          registradores.put("s0", "10000");
          registradores.put("s1", "10001");
          registradores.put("s2", "10010");
          registradores.put("s3", "10011");
          registradores.put("s4", "10100");
          registradores.put("s5", "10101");
          registradores.put("s6", "10110");
          registradores.put("s7", "10111");

          registradores.put("t8", "10000");
          registradores.put("t9", "10001");
          registradores.put("k0", "10010");
          registradores.put("k1", "10011");
          registradores.put("gp", "10100");
          registradores.put("sp", "10101");
          registradores.put("s8", "10110");
          registradores.put("ra", "10111");

          registradores.put("zero", "00000");
     }

     public String getMip(String key) {
          return registradores.get(key);
     }
     
}
