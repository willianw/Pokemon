import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Jogador {
    static final int MAXPOKEMONS = Main.MAXPOKEMONS;
    Scanner scan = new Scanner(System.in);
    String nome;
    Jogador adversario;
    Pokemon ativo;
    Item utilizando;
    Collection <Pokemon> campo;
    Collection <Item> inventario;
    Boolean desistido;
    int numero;
    
    public void desistir(){
	this.desistido = true;
    }

    public void setAdversario(Jogador adversario){
        this.adversario = adversario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Jogador(int n) throws Exception{
	this.inventario = new ArrayList<>();
	this.inventario.add(new Remedio(this, 20)); //Provisório.
	this.utilizando = inventario.iterator().next();
	//Posterior: adicionar loja de itens;
        this.desistido = false;
        this.numero = n;
        cadastrarJogador();
        cadastrarPokemons();
    }
    
    private void cadastrarJogador(){
        System.out.print("Digite o nome do jogador #" + this.numero + ": ");
        this.nome = scan.next();
    }
    
    private void cadastrarPokemons() throws Exception{
        campo = new ArrayList<Pokemon>();
        for(int i = 0; i < MAXPOKEMONS; i++){
            Pokedex.apresentar();
            System.out.print("["+i+"/"+MAXPOKEMONS+"] Escolha um pokemón: ");
            campo.add(new Pokemon(Pokedex.getHashPokemon(Integer.parseInt(scan.next())), this));
        }
    }
    
    public void menuItem() throws Exception{
	System.out.println("Escolher ítem");
	Iterator i = inventario.iterator();
	if(inventario.isEmpty())
	    System.out.println("Inventário Vazio!");
	else{
	    int j = 0;
	    while(i.hasNext()){
		System.out.println(++j + ". " + ((Item)i.next()).apresentar());
	    }
	    usarItem(Integer.parseInt(scan.next()));
	}
    }
    
    private void usarItem(int k) throws Exception{
	Iterator i = inventario.iterator();
	int j = 1;
	while(i.hasNext() && j < k){
	    i.next();
	}
	if (j == k)
	    ((Item)i.next()).utilizar();
	else
	    throw new Exception ("Valor inválido.");
    }
    public void escolherPokemon() throws Exception{
        Iterator i = campo.iterator();
        int j = 1;
        while(i.hasNext()){
            System.out.println(((Pokemon)i.next()).apresentar());
        }
        System.out.print("Escolha um pokemon: ");
        this.ativo = procurarPokemon(Integer.parseInt(scan.next()));
    }
    
    public void jogada() throws Exception{
        System.out.println("Vez de " + nome + ": ");
        System.out.println("Pokemon ativo: \n" + this.ativo.apresentar());
        System.out.println("1. Correr");
        System.out.println("2. Trocar Pokemon");
        System.out.println("3. Usar ítem");
        System.out.println("4. Atacar");
        
        int opcao = Integer.parseInt(scan.next());//Substituir por escolha de ação
        
        switch(opcao){
	    case 1:
		(new Desistencia(this, null)).executar();
		break;
	    case 2:
		this.escolherPokemon();
		break;
	    case 3:
		this.menuItem();
		break;
            case 4: 
                (new Ataque(this, adversario)).executar();
                break;
	    default:
		throw new Exception("Opção inválida");
        }
    }
    
    public boolean querJogar(){
        return !desistido;
    }
    
    public boolean temPokemons(){
        return !this.campo.isEmpty();
    }
    
    public boolean podeJogar(){
        return querJogar() && temPokemons();
    }
    
    public Pokemon procurarPokemon(int indice) throws Exception{
        Iterator i = campo.iterator();
        int j = 1;
        while(i.hasNext() && j < indice){
            i.next();
            j++;
        }
        if (j == indice)
            return (Pokemon)i.next();
        else
            throw new Exception("Índice inválido");
    }
}