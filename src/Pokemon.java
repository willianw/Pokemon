/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class Pokemon {
    public static int MAXATK = 4;
    Scanner scan = new Scanner(System.in);
    String nome, tipo;
    int vida;
    
    public Pokemon(HashMap receita){
        this.nome = (String)receita.get("Nome");
        this.tipo = (String)receita.get("Tipo");
        this.vida = Integer.parseInt((String)receita.get("Vida"));
    }
    
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Vida: " + vida);
    }
}