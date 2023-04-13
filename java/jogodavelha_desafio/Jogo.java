/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha_desafio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author raoniton
 */
public class Jogo {
    
    //CRIA E PREENCHE A MATRIZ QUE MOSTRA O TABULEIRO DO JOGO
    private ArrayList<ArrayList<String>> m = new ArrayList<ArrayList<String>>();
    int nJogo = 0;
    Scanner scanner = new Scanner(System.in);
    public ArrayList<ArrayList<String>>  criaArray(){
        int i, j, pos=1;
        for(i=0; i < 3; i++){
            m.add(new ArrayList<String>());
            for(j=0; j < 3; j++){
                m.get(i).add(j, String.valueOf(pos));
                pos++;
            }
        }
         
        return m;
    }
      
    //PRITA O TABULEIRO DO JOGO DA VELHA
    public void printaJogo(){
        int i, j;
        System.out.println("  ============== JOGO DA VELHA ================\n");
        
        for(i = 0; i < m.size(); i++){

            for(j = 0; j < m.size(); j++){
                if(j < 2)
                    System.out.printf("\t%s \t#",m.get(i).get(j));
                else
                    System.out.printf("\t%s \t",m.get(i).get(j));


            if(j == 2 && i < 2)
                 System.out.printf("\n\n  ============= # ============= # =============   ");
            }   
            System.out.println("\n");
        }
        
        
    }
    
    //VERIFICA SE A POSICAO JA FOI PREENCHIDA
    public boolean posicaoDisponivel(int v[], int pos){
        return v[pos-1] == 0;
    }
    
    //VERIFICA LINHAS
    public int verificalin(int v[]){
        if(v[0] == v[1] && v[0] == v[2])
            return v[0];
        else if(v[3] == v[4] && v[3] == v[5])
            return v[3];
        else if(v[6] == v[7] && v[6] == v[8])
            return v[6];
                    
        return 0;
    }
    
    //VERIFICA COLUNAS
    public int verificaCol(int v[]){
        if(v[0] == v[3] && v[0] == v[6])
            return v[0];
        else if(v[1] == v[4] && v[1] == v[7])
            return v[1];
        else if(v[2] == v[5] && v[2] == v[8])
            return v[2];
                    
        return 0;
    }
    
    //VERIFICA DIAGONAL PRINCIPAL
    public int verificaDiagPrinc(int v[]){
        if(v[0] == v[4] && v[0] == v[8])
            return v[0];
        return 0;
    }
    
    //VERIFICA DIAGONAL SECUNDARIA
    public int verificaDiagSec(int v[]){
        if(v[6] == v[4] && v[6] == v[2])
            return v[6];
        return 0;
    }
    
    //FUNCAO QUE VERIFICA AS POSSIBILIDADES DE ENTRADA ERRADA
    //SE A PESSOA DIGITE QUALQUER COISA DIFERENTE DO INTERVALO [1,9]
    public int verificaEntradaSeIncorreta(){
        int jogada=1;
        boolean teste = false;
        while(!teste){
            try{
                jogada = scanner.nextInt();
                
                try{
                    if(jogada < 1 || jogada > 9){
                        throw new ArrayIndexOutOfBoundsException();
                    }else
                        teste = true;
                    
                }catch(ArrayIndexOutOfBoundsException e){
                    System.err.println("  A jogada deve estar entre 1 e 9 e deve estar disponível! Tente novamente:");
                    scanner.nextLine();
                }
            }catch(InputMismatchException e){
                System.err.println("  A jogada deve ser um numero entre 1 e 9! Tente novamente:");
                scanner.nextLine();
            }
        }
          
              
        return jogada;
    }
    
    public boolean jogarNovamente(){
        
        System.out.println("Deseja jogar novamente?");
        System.out.println("[1] - Jogar novamente\n[2] - Sair");
        int op;
        while(true){
            try{
                op = scanner.nextInt();
                switch (op) {
                    case 1 -> {
                        return true;
                       
                    }
                        
                    case 2 -> {
                        return false;
                    }
                    default -> throw new InputMismatchException();
                }
            }catch(InputMismatchException e){
                System.err.println("Opcao Invalida! Tente novamente: " + e.getMessage());
                scanner.nextLine();
            }
        }
        
        
    }
    
    public void placar(ArrayList<Jogador> vJog){
            System.out.printf("PLACAR: %s %d x %d %s\n", vJog.get(0).getNome(), vJog.get(0).getVitorias(), vJog.get(1).getVitorias(), vJog.get(1).getNome());
    }
    
    public void jogo(Jogador j1, Jogador j2){
        
        //Inicializa as variaveis e vetores
        int[] vPos = new int[9];
        int jogada, count=0;
        ArrayList<Jogador> vJog = new ArrayList<Jogador>();
        vJog.add(j1);
        vJog.add(j2);

        j1.setSimbolo("XX");
        j2.setSimbolo("OO");
        
        //variavel globar que exibe o tabuleiro do jogo da velha
        m = criaArray();
        
        
        placar(vJog);
        
       
        printaJogo();
        do{
            System.out.printf("  Sua vez, %s. Faca sua jogada: \n", vJog.get(count % 2).getNome());
            System.out.printf("  ");
            jogada = verificaEntradaSeIncorreta();
            
            //verfica se a posicao escolhar pelo jogador esta disponivel, ou se ja foi escolhida
            if(posicaoDisponivel(vPos, jogada)){
                vPos[jogada - 1] = count % 2 + 1;
                int i, j;
                for(i = 0; i < 3; i++){
                    for(j=0; j < 3; j++){
                        if(String.valueOf(jogada).equals(m.get(i).get(j))){
                            m.get(i).set(j, vJog.get(count % 2).getSimbolo());
                        }
                    }
                }
                //Se tudo deu certo
                count++;
            }else{
                System.err.println("  Jogada invalida! Tente novamente");
            }
            
            
            printaJogo();
            //Verifica as linhas vertivais, horizontais e diagonais, caso alguma 
            //retorne != 0, significa que algum jogador acabou de vencer a partida
            if(verificaCol(vPos) != 0 || verificalin(vPos) != 0 || verificaDiagPrinc(vPos) != 0 || verificaDiagSec(vPos) != 0){

                //essa mensagem so aparece para o ultimo jogador que jogou, por isso decremento a variavel-> count
                System.out.printf("TEMOS UM VENCEDOR, PARABENS %s!\n", vJog.get((count-1)%2).getNome());
                vJog.get((count-1)%2).incrementaVitoria();
                break;
            }else if(count == 9){
                 System.out.printf("EMPATOU!\n");
            }
            
        }while(count < 9);  
        
        //Mostra o placar depois do fim do jogo
        placar(vJog);
        
        
        //cria novas arrays e coloca null nas outras, isso fara com que 
        //o garbage collector limpe os objetos que jogamos fora.
        m = new ArrayList<ArrayList<String>>();
        vPos = null;
        count = 0;
        vJog = null;
        
    }

    
}
