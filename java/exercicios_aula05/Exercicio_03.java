/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_03;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o dia do mês: ");
        dia = scanner.nextInt();
                
        System.out.println( (dia >=1 && dia <= 15 ) ? "O dia pertence a 1a quinzena do mes." : "O dia  pertence a 2a quinzena do mes." );
        
    }
    
}
