/*
Exercicio 1
Um site de internet registra um log de acessos dos usuários. Um registro de log 
consiste no nome de usuário (apenas uma palavra) e o instante em que o usuário acessou 
o site no padrão ISO 8601, separados por espaço, conforme exemplo. Fazer um programa 
que leia o log de acessos a partir de um arquivo, e daí informe quantos usuários 
distintos acessaram o site.
  
Crie uma arquivo .txt e cole tais acessos: 
jose 2018-08-26T20:45:08Z
alex 2018-08-26T21:49:37Z 
pedro 2018-08-27T03:19:13Z
jose 2018-08-27T08:11:00Z 
jeniffer3 2018-08-27T09:19:24Z 
alex 2018-08-27T22:39:52Z 
jose 2018-08-28T07:42:19Z
*/
package exercicio01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
/**
 *
 * @author raoniton
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> logsNames = new HashSet<String>();
        String path = "/Users/raoniton/NetBeansProjects/Exercicio01/src/exercicio01/Acesso.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            String[] text;
            while(line != null){
                text = line.split(" ");
                logsNames.add(text[0]);
                
                line = br.readLine();   //le a linha seguinte
            }
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
        }
           
        System.out.println("Total users: "+logsNames.size());
        //System.out.println(logsNames);
    }
    
}
