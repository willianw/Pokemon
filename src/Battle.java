
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public class Battle {
    Scanner scan = new Scanner(System.in);
    Jogador j1 = new Jogador();
    Jogador j2 = new Jogador();
    
    public Battle(){
        System.out.println("Batalha!");
        System.out.print("Digite o nome do primeiro jogador:");
        j1.setNome(scan.next());
        System.out.print("Digite o nome do segundo jogador:");
        j2.setNome(scan.next());
        j1.getNome();
    }
    
}
