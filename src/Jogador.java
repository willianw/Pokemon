
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Jogador {
    static final int MAXPOKEMONS = Main.MAXPOKEMONS;
    Scanner scan = new Scanner(System.in);
    String nome;
    Pokemon ativo;
    Collection <Pokemon> campo;
    Boolean desistido;
    int numero;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Jogador(int n) throws Exception{
        this.desistido = false;
        this.numero = n;
        cadastrarJogador();
        cadastrarPokemons();
    }
    
    private void cadastrarJogador(){
        System.out.print("Digite o nome do jogador #" + this.numero + ": ");
        this.nome = scan.next();
    }
    
    private void cadastrarPokemons() throws Exception{
        campo = new ArrayList<Pokemon>();
        for(int i = 0; i < MAXPOKEMONS; i++){
            Pokedex.apresentar();
            System.out.print("["+i+"/"+MAXPOKEMONS+"] Escolha um pokemón: ");
            campo.add(new Pokemon(Pokedex.getHashPokemon(Integer.parseInt(scan.next()))));
        }
    }
    
    public void escolher() throws Exception{
        Iterator i = campo.iterator();
        int j = 1;
        while(i.hasNext()){
            ((Pokemon)i.next()).apresentar();
        }
        System.out.print("Escolha um pokemon: ");
        this.ativo = procurarPokemon(Integer.parseInt(scan.next()));
    }
    
    public void jogada(){
        System.out.println("Vez de " + nome + ": ");
    }
    
    public boolean querJogar(){
        return !desistido;
    }
    
    public boolean temPokemons(){
        return !this.campo.isEmpty();
    }
    
    public boolean podeJogar(){
        return querJogar() && temPokemons();
    }
    
    public Pokemon procurarPokemon(int indice) throws Exception{
        Iterator i = campo.iterator();
        int j = 1;
        while(i.hasNext() && j < indice){
            i.next();
            j++;
        }
        if (j == indice)
            return (Pokemon)i.next();
        else
            throw new Exception("Índice inválido");
    }
}