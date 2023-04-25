/**
 * @Class: CaesarCipher
 * @Author: Savion Plater
 * @Course: ITEC 2140 - 05, Spring 2023
 * @Written: April 24, 2023
 * Description: The program will take in a message and a key from the user and output the encrypted or
 * decrypted message.
 */
public class CaesarCipher {

    private int a;

    public CaesarCipher(int a) {
        this.a = a;
    }

    public String encrypt(String message) {
        if (a > 26) {
            a = a % 26;
        } else if (a < 0) {
            a = (a % 26) + 26;
        }

        String Cipher = "";
        int length = message.length();
        for (int i = 0; i < length; i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + a);
                    if (c > 'z') {
                        Cipher += (char) (ch - (26 - a));
                    } else {
                        Cipher += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + a);
                    if (c > 'Z') {
                        Cipher += (char) (ch - (26 - a));
                    } else {
                        Cipher += c;
                    }
                }
            } else {
                Cipher += ch;
            }
        }

        return Cipher;
    }

    public String decrypt(String message) {
        if (a > 26) {
            a = a % 26;
        } else if (a < 0) {
            a = (a % 26) + 26;
        }

        String Cipher = "";
        int length = message.length();
        for (int i = 0; i < length; i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - a);
                    if (c < 'a') {
                        Cipher += (char) (ch + (26 - a));
                    } else {
                        Cipher += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - a);
                    if (c < 'A') {
                        Cipher += (char) (ch + (26 - a));
                    } else {
                        Cipher += c;
                    }
                }
            } else {
                Cipher += ch;
            }
        }
        return Cipher;
    }
}