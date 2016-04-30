
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Jogador {
    static final int MAXPOKEMONS = Main.MAXPOKEMONS;
    Scanner scan = new Scanner(System.in);
    String nome;
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
    
    public void jogada(){
        System.out.println("Vez de " + nome + ": ");
    }
}