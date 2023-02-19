/*
Faça um programa que seja capaz de identificar a resolução a tela 
do seu computador.
*/
package aula02_resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author raoniton
 */
public class Aula02_ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.printf("Resolucao : %d x %d\n", screenSize.height, screenSize.width);
                
    }
    
}
