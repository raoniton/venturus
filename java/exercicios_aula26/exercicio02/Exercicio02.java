/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
//import java.util.List;

/**
 *
 * @author raoniton
 */
public class Exercicio02 {
    //Dados de nomeProduto e precoProduto que foram obtidos atraves de uma tabela CSV
    public static Map<String, Double> produtosFromCSV(String pathFile){
        Map<String, Double> hashMap = new HashMap<String, Double>();
        try(BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            String line = br.readLine();    // essa leitura lê a primeira linha do csv que sao os nomes dos campos,
            line = br.readLine();           // essa leitura eh para de fato ler o primeiro dado
            
            String[] text;
            while(line != null){
                text = line.split(",");
                if(!hashMap.containsKey(text[0])){
                    hashMap.put(text[0], Double.valueOf(text[1]));
                }else{
                    hashMap.put(text[0], hashMap.get(text[0]) + Integer.valueOf(text[1]));
                }
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
            System.exit(1);         // se der erro, exibe a mensagem e encerra o programa
        }
        return hashMap;
    }
    
    public static void main(String[] args) {

        String pathFile = "/Users/raoniton/NetBeansProjects/Exercicio02/src/exercicio02/produtos.csv";
        Map<String, Double> produtos = produtosFromCSV(pathFile); //HashMap criado com dados que obteve de um arq CSV
        Stream<Double> precoStream = produtos.values().stream(); // cria uma stream com os valores vindos da hashMap
        Stream<String> nomeStream = Stream.of(); //cria uma stream vazia 
        
        //CALCULA MEDIA
        double media=0;
        for(Map.Entry i: produtos.entrySet()){
            media = media + (double)(i.getValue());
        }
        media = media/produtos.size();
        System.out.printf("Media preco: %.2f\n",media);
        
        //SELECIONA ELEMENTOS COM VALOR MENOR QUE A MEDIA
        for(Map.Entry<String, Double> p: produtos.entrySet()){
            if(p.getValue() < media){
                //adicionando os dados a 
                nomeStream = Stream.concat(nomeStream, Stream.of(p.getKey()));
            }
        }
        
        //IMPRIME A STREAM ORDENADA DECRESCENTE, APENAS COM OS PRODUTORS QUE SAO MAIS BARATOS QUE A MEDIA
        nomeStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        
    }
    
}

