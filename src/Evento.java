/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public abstract class Evento {
    String nome;
    int prioridade;
    Jogador from, to;
    abstract void executar() throws Exception;
    public Evento(Jogador from, Jogador to)throws Exception{
        this.from = from;
        this.to = to;
    }
}