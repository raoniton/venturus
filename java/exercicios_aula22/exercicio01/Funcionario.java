/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;
import java.util.Scanner;
/**
 *
 * @author raoniton
 */
public class Funcionario {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    private String nome;
    private int horas;
    private double valorPorHora;
    
    public Funcionario(String nome, int horas, double valorPorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }
    
    public Funcionario(){
        this.nome = "";
        this.horas = 0;
        this.valorPorHora = 0;
    }
    
    public double pagamento(){
        return this.horas*this.valorPorHora;
    }
    
    Scanner scanner = new Scanner(System.in);
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
