/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */

import java.util.Scanner;

public class Pokemon {
    Scanner scan = new Scanner(System.in);
    String nome, tipo;
    int vida;
    public Pokemon(){
        System.out.print("Digite a vida do primeiro pokemón: ");
        this.vida = Integer.parseInt(scan.next());
    }
}