
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi_000
 */
public class Remedio extends Item{
    int cura;
    public Remedio(Jogador j, int value){
	super(j);
	cura = value;
	tipo = "Remédio";
    }
    
    //Falta dividir a classe em outros tipos de remédio;
    
    public void utilizar(){
	usuario.ativo.adicionaVida(cura);
	usuario.inventario.remove(usuario.utilizando);
    }
    
    public String apresentar(){
	return ("Tipo: " + tipo + "\nCura: " + cura + "\n");
    }
}