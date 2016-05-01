/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public class Escolha extends Evento{
    public Escolha(Jogador from, Jogador to) throws Exception{
        super(from, to);
        this.nome = "Escolha";
        this.prioridade = 2;
    }
    @Override
    public void executar() throws Exception{
        from.escolher();
    }
}