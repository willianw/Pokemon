/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public class Desistencia extends Evento{
    public Desistencia(Jogador from, Jogador to) throws Exception{
        super(from, to);
        this.nome = "Desistencia";
        this.prioridade = 1;
    }
    @Override
    public void executar(){
        from.desistir();
    }
}
