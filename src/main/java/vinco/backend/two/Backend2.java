package vinco.backend.two;

import java.util.Scanner;

/**
 *
 * @author Alex Garcia
 */
public class Backend2 {

    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca la cadena a evaluar: ");
        input = scan.nextLine();
        if (isBalanced(input)) {
            System.out.println("La cadena \"" + input + "\" esta balanceada.");
        } else {
            System.out.println("La cadena \"" + input + "\" no esta balanceada.");
        }
    }

    public static boolean isBalanced(String str) {
        int openParentheses = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                openParentheses++;
            } else if (c == ')') {
                if (openParentheses == 0) {
                    return false;
                }
                openParentheses--;
            } /*else { // descomentar si se pretende evaluar solo con caracteres de parentesis
                return false;
            }*/
        }
        return openParentheses == 0;
    }
}
