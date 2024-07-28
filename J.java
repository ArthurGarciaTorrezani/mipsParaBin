public class J {
    public static String returnBinario(String instrucao, String word) {
        String number = Integer.toBinaryString(Integer.parseInt(word));
        if (number.length() < 26) {
            int diferen = 26 - number.length();
            for (int i = 0; i < diferen; i++) {
                number = "0" + number;
            }
        }
        instrucao = instrucao + number;
        return instrucao;
    }
}
