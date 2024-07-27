public class J {
    public static String returnBinario(String instrucao, String[] word) {
        if (instrucao.equals("j")) {
            String number = Integer.toBinaryString(Integer.parseInt(word[1]));
            if (number.length() < 26) {
                int diferen = 26 - number.length();
                for (int i = 0; i < diferen; i++) {
                    number = "0" + number;
                }
            }
            return instrucao + number;
        } else {
            String number = Integer.toBinaryString(Integer.parseInt(word[1]));
            if (number.length() < 26) {
                int diferen = 26 - number.length();
                for (int i = 0; i < diferen; i++) {
                    number = "0" + number;
                }
            }
            return instrucao + number;
        }

    }
}
