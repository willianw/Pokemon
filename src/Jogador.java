
import java.util.Scanner;

public class Jogador {
    static final int MAXPOKEMONS = Main.MAXPOKEMONS;
    Scanner scan = new Scanner(System.in);
    String nome;
    Pokemon[] campo;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Jogador(int n){
        System.out.print("Digite o nome do jogador #" + n + ": ");
        this.nome = scan.next();
        campo = new Pokemon[MAXPOKEMONS];
        for(int i = 0; i < MAXPOKEMONS; i++){
            Pokedex.apresentar();
            System.out.println("Escolha um pokemón: ");
            campo[i] = new Pokemon(Integer.parseInt(scan.next()));
        }
    }
    
}
