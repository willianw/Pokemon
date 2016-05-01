/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public class Ataque extends Evento{
    public Ataque(Jogador from, Jogador to){
        super(from, to);
        this.nome = "Ataque";
        this.prioridade = 4;
    }
    @Override
    public void executar(){
        to.ativo.tomaDano(from.ativo.danoAtkAtivo());
    }
}
