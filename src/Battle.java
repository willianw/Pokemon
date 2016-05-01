import java.util.Scanner;

public class Battle {
    Scanner scan = new Scanner(System.in);
    Jogador j1, j2;
    int rodada;
    
    public Battle() throws Exception{
        System.out.println("Batalha!");
        j1 = new Jogador(1);
        j2 = new Jogador(2);
        rodada = 0;
        while(j1.podeJogar() && j2.podeJogar()){
            if((++rodada % 2) == 1)
                j1.jogada();
            else
                j2.jogada();
        }
        System.out.println("Fim de jogo.");
        
    }
    
}