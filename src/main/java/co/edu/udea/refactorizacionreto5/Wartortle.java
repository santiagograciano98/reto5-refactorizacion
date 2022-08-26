package co.edu.udea.refactorizacionreto5;

public class Wartortle extends Pokemon{

    public Wartortle() {
    }

    public Wartortle(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() {
        Pokemon blastoise = new Blastoise(nombre, nivel, puntajeSalud);
        return blastoise;
    }

    @Override
    public String gritar() {
        return "Wartortle";
    }
    
}
