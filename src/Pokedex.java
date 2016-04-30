import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Pokedex{

    private static Collection<HashMap<String,String>> maps;
    
    static Map <String, String> bubassauro;
    static Map <String, String> squirtle;
    static Map <String, String> charmander;
    
    public static Collection getMaps(){
        return Pokedex.maps;
    }
   
    public static void load() {
        Pokedex.maps = new ArrayList<HashMap<String, String>>();
        
        Pokedex.bubassauro = new HashMap<String, String>();
            Pokedex.bubassauro.put("Nome", "Bubassauro");
            Pokedex.bubassauro.put("Tipo", "Planta");
            Pokedex.bubassauro.put("Vida", "120");
            Pokedex.bubassauro.put("a1", "50");
            Pokedex.bubassauro.put("a2", "40");
            Pokedex.bubassauro.put("a3", "20");
            Pokedex.bubassauro.put("a4", "10");
            
        Pokedex.squirtle = new HashMap<String, String>();
            Pokedex.squirtle.put("Nome", "Squirtle");
            Pokedex.squirtle.put("Tipo", "Água");
            Pokedex.squirtle.put("Vida", "180");
            Pokedex.squirtle.put("a1", "40");
            Pokedex.squirtle.put("a2", "30");
            Pokedex.squirtle.put("a3", "10");
            Pokedex.squirtle.put("a4", "5");
            
        Pokedex.charmander = new HashMap<String, String>();
            Pokedex.charmander.put("Nome", "Charmander");
            Pokedex.charmander.put("Tipo", "Fogo");
            Pokedex.charmander.put("Vida", "80");
            Pokedex.charmander.put("a1", "40");
            Pokedex.charmander.put("a2", "25");
            Pokedex.charmander.put("a3", "20");
            Pokedex.charmander.put("a4", "5");
            
        maps.add((HashMap<String, String>) bubassauro);
        maps.add((HashMap<String, String>) squirtle);
        maps.add((HashMap<String, String>) charmander);
        
    }
    
    public static void apresentar(){
        Pokedex.load();
        Iterator i = (Pokedex.getMaps()).iterator();
        int j = 1;
        while(i.hasNext()){
            System.out.println(j++ + ". " + ((HashMap)i.next()).get("Nome"));
        }
    }
    
    public static HashMap getHashPokemon(int k) throws Exception{
        Iterator i = (Pokedex.getMaps()).iterator();
        int j = 1;
        while(i.hasNext() && j < k){
            i.next();
            j++;
        }
        if (j == k)
            return (HashMap)i.next();
        else
            throw new Exception("Valor inválido");
        
    }
}