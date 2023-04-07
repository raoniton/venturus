/*
Exercicio 3
Na contagem de votos de uma eleição, são gerados vários registros de votação 
contendo o nome do candidato e a quantidade de votos (formato .csv) que ele 
obteve em uma urna de votação. Você deve fazer um programa para ler os registros 
de votação a partir de um arquivo, e daí gerar um relatório consolidado com os 
totais de cada candidato.
  
Atividade 3
Crie uma arquivo .txt e cole tais informações:
Pitter Jonas,15 
Steven Green,22 
Ana Sarah,21 
Pitter Jonas,30 
Ana Sarah,15
Steven Green,27 
Steven Green,22 
Ana Sarah,25 
Pitter Jonas,31
*/
package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author raoniton
 */
public class Exercicio03 {
    //Map de Candidadtos e Votos que foram obtidos atraves de uma tabela CSV
    public static Map<String, Integer> criaMapCandVotoFromCSV(String pathFile){
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        try(BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            String line = br.readLine();    // essa leitura lê a primeira linha do csv que sao os nomes dos campos,
            line = br.readLine();           // essa leitura eh para de fato ler o primeiro dado
            
            String[] text;
            while(line != null){
                text = line.split(",");
                if(!hashMap.containsKey(text[0])){
                    hashMap.put(text[0], Integer.valueOf(text[1]));
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

        String pathFile = "/Users/raoniton/NetBeansProjects/Exercicio03/src/exercicio03/candidatoVoto.csv";
        Map<String, Integer> candidatoVoto = criaMapCandVotoFromCSV(pathFile);// = new HashMap<String, Integer>();
       
        // Um forma de exibir atraves do Enhanced For
        for(Map.Entry i: candidatoVoto.entrySet()){
            System.out.println(i.getKey() + ": " +i.getValue());          
        }
         
    }
    
}
