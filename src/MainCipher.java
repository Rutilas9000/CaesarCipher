/**
 * @Class: MainCipher
 * @Author: Savion Plater
 * @Course: ITEC 2140 - 05, Spring 2023
 * @Written: April 24, 2023
 * Description: The program will take in a message and a key from the user and output the encrypted or
 * decrypted message.
 */

import java.util.Scanner;
public class MainCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message to be encrypted or decrypted: ");
        String str = in.nextLine();
        System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
        String crypt = in.nextLine();
        System.out.print("Enter a integer key value for encryption or decryption: ");
        int a = in.nextInt();
        CaesarCipher caesarCipher = new CaesarCipher(a);
        switch(crypt) {
            case "E":
                System.out.println("Encrypted message: " + caesarCipher.encrypt(str));
                break;
            case "D":
                System.out.println("Decrypted message: " + caesarCipher.decrypt(str));
                break;
        }

    }
}