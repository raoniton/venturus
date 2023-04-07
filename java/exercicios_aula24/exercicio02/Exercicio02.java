/*
Exercicio 2
Em um portal de cursos online, cada usuário possui um código único, representado 
por um número inteiro. Cada instrutor do portal pode ter vários cursos, sendo que 
um mesmo aluno pode se matricular em quantos cursos quiser. Assim, o número total 
de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos 
que ele possui, pois pode haver alunos repetidos em mais de um curso.
  

O instrutor José possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor José, depois 
mostrar a quantidade total e alunos dele, conforme exemplo.

Quantos estudantes para o curso A? 3 21
35
22
Quantos estudantes para o curso B? 2 21
50
Quantos estudantes para o curso C? 3 42
35
13
Total de Estudantes: 6
*/
package exercicio02;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Exercicio02 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<Integer> cursoA = new HashSet<Integer>();
        HashSet<Integer> cursoB = new HashSet<Integer>();
        HashSet<Integer> cursoC = new HashSet<Integer>();
        HashSet<Integer> totalAlunos = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        String cursos = "ABC";
        
        int i,nAlunosCurso, nCursos=0;
        
        while(nCursos < 3){
            System.out.println("Quantos estudantes para o curso "+cursos.charAt(nCursos)+"?");
            nAlunosCurso = scanner.nextInt();
            for(i=0; i < nAlunosCurso; i++){
                switch (nCursos) {
                    case 0 -> cursoA.add(scanner.nextInt());
                    case 1 -> cursoB.add(scanner.nextInt());
                    case 2 -> cursoC.add(scanner.nextInt());
                }
            }
            nCursos++;
        }
        
        
        totalAlunos.addAll(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);
        System.out.println("Total de Estudadntes: "+totalAlunos.size());
        
        
        
        
        
    }
    
}
