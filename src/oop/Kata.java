package oop;

public class Kata {
    public static boolean validateHello(String greetings) {
//     greetings = greetings.replace("!", "").replace(",", "").toLowerCase();
        greetings = greetings.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        String[] words = greetings.split(" ");

        for (String word : words) {
            if ("hello".equals(word) || "ciao".equals(word) ||
                    "salut".equals(word) || "hallo".equals(word) ||
                    "hola".equals(word) || "ahoj".equals(word) ||
                    "czesc".equals(word)) {
                return true;
            }
        }
        return false;
    }

}