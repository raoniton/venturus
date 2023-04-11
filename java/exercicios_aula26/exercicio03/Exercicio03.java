/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author raoniton
 */
public class Exercicio03 {

      //Dados que foram obtidos atraves de uma tabela CSV
    public static ArrayList<String> dadosFromCSV(String pathFile){
        ArrayList<String> dados = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            String line = br.readLine();    // essa leitura lê a primeira linha do csv que sao os nomes dos campos,
            line = br.readLine();           // essa leitura eh para de fato ler o primeiro dado

            while(line != null){
                dados.add(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
            System.exit(1);         // se der erro, exibe a mensagem e encerra o programa
        }
        return dados;
    }
    public static void main(String[] args) {
        String pathFile = "/Users/raoniton/NetBeansProjects/Exercicio03/src/exercicio03/dados.csv";
        ArrayList<String> dados = dadosFromCSV(pathFile); //array criado com dados, sem tratar ou separar, que obteve de um arq CSV
        List<Funcionario> func = new ArrayList<Funcionario>();
        String nome, email;
        double sal;
        for(String d: dados){
            nome = dados.get(dados.indexOf(d)).split(",")[0];
            email = dados.get(dados.indexOf(d)).split(",")[1];
            sal = Double.parseDouble( dados.get(dados.indexOf(d)).split(",")[2] );
                        
            //System.out.println(nome + email + sal);
            func.add(new Funcionario(nome, email, sal));
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre salario: ");
        double salarioAProcurar = scanner.nextDouble();
        
        //System.out.println(func.get(0).getNome());
        //func.stream().forEach(f -> System.out.println(f.getNome()));
        //func.stream().forEach(f -> System.out.println(f.getEmail()));
        //func.stream().forEach(f -> System.out.println(f.getSalario()));
        func.stream().sorted(Comparator.comparing(Funcionario::getNome)).filter(p -> p.getSalario() > salarioAProcurar).forEach(p -> System.out.println(p.getEmail()));
        
        //Soma dos salarios das pessoas pessoas cujo nome inicia com 'M'
        System.out.println("\nSoma dos salarios das pessoas que tem a letra inicial == 'M'");
        System.out.println(
                func.stream().filter(p -> p.getNome().startsWith("M")).collect(Collectors.summingDouble(p -> p.getSalario()))
        );
    }
    
}
