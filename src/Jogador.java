/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public class Jogador {
    String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void getNome(){
        System.out.println("Nome: " + nome);
    }
}
