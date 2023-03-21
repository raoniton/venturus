/*
Endereco
------------
+ rua
+ numero 
+ bairro 
+ cidade 
+ estado
 
*/
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Endereco {

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Endereco() {
        this.rua = "";
        this.numero = 0;
        this.cidade = "";
        this.estado = "";
    }
    
    public Endereco(String rua, int numero, String cidade, String estado){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Endereco cadastrarEndereco(){
        Scanner scanner = new Scanner(System.in);
        Endereco endereco = new Endereco();
        String rua, cidade, estado;
        int numero;
        System.out.println("Digite o nome da rua:");
        setRua(scanner.nextLine());
        
        System.out.println("Digite o numero: ");
        setNumero(scanner.nextInt());
        
        System.out.println("Digite o nome da cidade: ");
        setCidade(scanner.nextLine());
        
        System.out.println("Digite o nome do estado: ");
        setEstado(scanner.nextLine());
        
        return endereco;
    }
    
    @Override
    public String toString(){
        return "Endereco: "+this.rua+", "+this.numero+" - "+this.cidade+"-"+this.estado+"\n";
    }
    
    public String rua;
    public int numero;
    public String cidade;
    public String estado;
    
}
