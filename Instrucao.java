import java.util.HashMap;
import java.util.Map;

public class Instrucao {
     private final Map<String, String> l = new HashMap<String, String>();
     private final Map<String, String> j = new HashMap<String, String>();
     private final Map<String, String> r = new HashMap<String, String>(); // rs rt rd

     public Instrucao() {
          l.put("lb", "100000");
          l.put("lh", "100001");
          l.put("lwl", "100010");
          l.put("lw", "100011");
          l.put("lbu", "100100");
          l.put("lhu", "100101");
          l.put("lwr", "100110");

          l.put("sb", "101000");
          l.put("sh", "101001");
          l.put("swl", "101010");
          l.put("sw", "101011");
          l.put("swr", "101110");

          l.put("addi", "001000");
          l.put("addiu", "001001");
          l.put("slti", "001010");
          l.put("sltiu", "001011");

          l.put("andi", "001100");
          l.put("ori", "001101");
          l.put("xori", "001110");
          l.put("lui", "001111");

          l.put("bltz", "000001");
          l.put("bgez", "000001");

          l.put("beq", "000100");
          l.put("bne", "000101");
          l.put("blez", "000110");
          l.put("bgtz", "000111");

          l.put("bltzal", "000001");
          l.put("bgezal", "000001");

          r.put("add", "100000");
          r.put("addu", "100001");
          r.put("sub", "100010");
          r.put("subu", "100011");
          r.put("and", "100100");
          r.put("or", "100101");
          r.put("xor", "100110");
          r.put("nor", "100111");
          r.put("slt", "101010");
          r.put("sltu", "101011");

          r.put("sllv", "000100");
          r.put("srlv", "000110");
          r.put("srav", "000111");

          // diferentes
          r.put("sll", "000000");
          r.put("srl", "000010");
          r.put("sra", "000011");

          r.put("mfhi", "010000");
          r.put("mthi", "010001");
          r.put("mflo", "010010");
          r.put("mtlo", "010011");
          r.put("mult", "011000");
          r.put("multu", "011001");
          r.put("div", "011010");
          r.put("divu", "011011");
          r.put("jr", "001000");
          r.put("jarl", "001001");

          j.put("j", "000010");
          j.put("jal", "000011");
     }

     public String getl(String key) {
          return l.get(key);
     }

     public String getr(String key) {
          return r.get(key);
     }

     public String getj(String key) {
          return j.get(key);
     }
}
