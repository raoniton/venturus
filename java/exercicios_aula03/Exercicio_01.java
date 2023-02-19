package exercicio_01;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author raoniton
 */
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale meuLocal = new Locale( "pt", "BR" ); 
        NumberFormat formatBR = NumberFormat.getCurrencyInstance( meuLocal ); 
        
        String produto1 = "Computador";
        String produto2 = "Tablet";
        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';
        double preco1 = 5100.0;
        double preco2 = 1000.50;
        double medida = 53.234567;
        
               
        System.out.println("Produtos:\n");
        System.out.printf("%s, Preco Total: %s\n\n",produto1, formatBR.format(preco1));
        System.out.printf("%s, Preco Total: %s\n\n\n",produto2, formatBR.format(preco2));
        System.out.printf("Registro: %d anos, codigo %d e sexo: %c\n\n\n", idade, codigo, sexo);
        System.out.printf("Medida com oito casas decimais: %.8f\n\n", medida);
        System.out.printf("Medida com oito casas decimais: %.2f\n", medida);
        
        
    }
    
}
