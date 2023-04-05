/*
 */
package exercicio05;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author raoniton
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "/Users/raoniton/NetBeansProjects/Exercicio05/src/exercicio05/file.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
