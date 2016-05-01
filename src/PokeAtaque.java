/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Define o tipo de ataque de um Pokemón
 * @author willi_000
 */
public class PokeAtaque {
    String nome;
    int dano;
    
    public PokeAtaque(String nome, int dano){
        this.nome = nome;
        this.dano = dano;
    }
    
    public int getDano(){
        return dano;
    }
}