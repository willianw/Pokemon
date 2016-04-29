import java.util.Scanner;

public class Battle {
    Scanner scan = new Scanner(System.in);
    Jogador j1, j2;
    
    public Battle(){
        System.out.println("Batalha!");
        j1 = new Jogador(1);
        j2 = new Jogador(2);
    }
    
}