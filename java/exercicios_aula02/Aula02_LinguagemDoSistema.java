/*
Exercicio 1:
Faça um programa que seja capaz de identificar o Idioma do sistema 
do seu computador
*/
package aula02_linguagemdosistema;

import java.util.Locale;

/**
 *
 * @author raoniton
 */
public class Aula02_LinguagemDoSistema {

   public static void main(String[] args) {
        Locale localLang = Locale.getDefault();
        //imprime o nome da Lingua do Sistema, ex: 'Português' ou 'English'
        System.out.println(localLang.getDisplayLanguage());
        
        //imprime a sigla da Lingua do Sistema, ex: 'pt' ou 'en'
        System.out.println(localLang.getLanguage());
        
        //imprime a sigla utilizando outro método
        System.getProperties();
        System.out.println(System.getProperty("user.language"));
              
        
    }
}
