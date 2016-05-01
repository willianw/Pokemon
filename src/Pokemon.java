/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class Pokemon {
    public static int MAXATK = 4;
    Scanner scan = new Scanner(System.in);
    PokeAtaque atkAtivo;
    Jogador treinador;
    Collection <PokeAtaque> ataques;
    String nome, tipo;
    int vida;
    
    public Pokemon(HashMap receita, Jogador treinador){
        this.treinador = treinador;
        ataques = new ArrayList<>();
        this.nome = (String)receita.get("Nome");
        this.tipo = (String)receita.get("Tipo");
        this.vida = Integer.parseInt((String)receita.get("Vida"));
        for(int i = 1; i <= MAXATK; i++){
            ataques.add(new PokeAtaque("Ataque "+ i, Integer.parseInt((String)receita.get("a"+i))));
        }
        Iterator i = ataques.iterator();
        this.atkAtivo = (PokeAtaque)i.next();
    }
    
    public String apresentar(){
        return ("Nome: " + nome + "\nTipo: " + tipo + "\nVida: " + vida);
    }
    
    public void tomaDano(int dano) throws Exception{
        vida -= dano;
        if (vida <= 0)
            morrer();
    }
    
    public void morrer() throws Exception{
        System.out.println(nome + " morreu");
        treinador.campo.remove(this);
        if(treinador.temPokemons())
            treinador.escolherPokemon();
    }
    
    public void adicionaVida(int val){
	this.vida += val;
    }
    
    public int danoAtkAtivo(){
        return atkAtivo.getDano();
    }
}