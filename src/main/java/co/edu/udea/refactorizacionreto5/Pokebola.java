package co.edu.udea.refactorizacionreto5;

public class Pokebola {
    private int tamanio;
    private Pokemon miPokemon;

    public Pokebola() {
    }

    public Pokebola(int tamanio, Pokemon miPokemon) {
        this.tamanio = tamanio;
        this.miPokemon = miPokemon;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Pokemon getMiPokemon() {
        return miPokemon;
    }

    public void setMiPokemon(Pokemon miPokemon) {
        this.miPokemon = miPokemon;
    }

    
    
}
