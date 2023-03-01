/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_04;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorProduto;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();
        
        if(valorProduto < 30 ){
            System.out.println("O valor do produto tera desconto de 10%, Valor Final=" + (valorProduto*0.9));
        }else{
            System.out.println("O valor do produto tera desconto de 10%, Valor Final=" + (valorProduto*0.8));
        }
    }
    
}
