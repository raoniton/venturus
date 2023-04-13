/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha_desafio;

import java.util.Scanner;

/**
 *
 * @author raoniton
 */
public class Jogador {
    private static int numJogador=1;
    private int id;
    private String nome;
    private int vitorias;
    private String simbolo;
    
    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }
    
    public String getSimbolo(){
        return this.simbolo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    public void incrementaVitoria(){
        this.vitorias++;
    }
    
        
    public Jogador(String nome){
        this.nome = nome;
        this.vitorias = 0;
        this.id = numJogador;
        numJogador++;
    }
    
    public Jogador(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("  Jogador %d, digite seu nome: ", this.id);
        this.nome = scanner.nextLine();
        this.vitorias = 0;
        
    }
    
}
