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
    public Ataque(Jogador from, Jogador to) throws Exception{
        super(from, to);
        this.nome = "Ataque";
        this.prioridade = 4;
    }
    public void executar() throws Exception{
        to.ativo.tomaDano(from.ativo.danoAtkAtivo());
    }
}