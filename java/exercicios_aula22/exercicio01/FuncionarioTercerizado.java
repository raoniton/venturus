/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

//import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class FuncionarioTercerizado extends Funcionario{
    
    @Override
    public double pagamento(){
        return (this.getHoras()*this.getValorPorHora())*1.1;
    }
    
    //Scanner scanner = new Scanner(System.in);
    @Override
    public Funcionario criaFuncionario(){
        System.out.println("Digite o nome do funcionario");
        this.setNome(scanner.nextLine());

        System.out.println("Digite quantas horas o funcionario trabalhou: ");
        this.setHoras(scanner.nextInt());

        System.out.println("Digite o valor da hora desse funcionario: ");
        this.setValorPorHora(scanner.nextDouble());
        
        return this;
        
    }

    
    
}
