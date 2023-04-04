/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("/Users/raoniton/NetBeansProjects/Exercicio03/src/exercicio03/file.txt");
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        }catch(IOException e){
            System.out.println("Erro ao abrir arquivo: " +e.getMessage());
        }finally{
            System.out.println("O bloco finally foi executado.");
        }
    }
    
}
