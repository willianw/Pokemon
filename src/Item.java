/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public abstract class Item {
    Jogador usuario;
    String nome, tipo;
    
    public Item(Jogador usuario){
	this.usuario = usuario;
    }
    
    public abstract void utilizar();
    public abstract String apresentar();
}