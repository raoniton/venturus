/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio04;

/**
 *
 * @author raoniton
 */
public class Funcionario {
    private final int Id;
    private String Name;
    private Double Salario;
    
    public Funcionario(int Id, String Name, Double Salario){
        this.Id = Id;
        this.Name = Name;
        this.Salario = Salario;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Double getSalario() {
        return Salario;
    }
    
    public void aumentoSalario(Double porcentagem){
        this.Salario = this.Salario*(1+porcentagem/100);
    }
    
    public void showFuncInfo(){
        System.out.printf("%d, %s, %.2f\n",this.Id, this.Name, this.Salario);
    }
    
}
