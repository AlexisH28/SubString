/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package substring;

import java.util.Scanner;

/**
 *
 * @author Alexis Hernandez
 */
public class SubString {

     public static String getSmallestAndLargest(String s, int k) {        
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
      
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
          
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }      
        return smallest + "\n" + largest;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String s = teclado.next();
        int k = teclado.nextInt();

        System.out.println(getSmallestAndLargest(s, k));
    }
    
}
