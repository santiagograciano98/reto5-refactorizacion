package co.edu.udea.refactorizacionreto5;

public class Squirtle extends Pokemon{

    public Squirtle() {
    }

    public Squirtle(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() {
        Pokemon wartortle = new Wartortle(nombre, nivel, puntajeSalud);
        return wartortle;
    }

    @Override
    public String gritar() {
        return "Squirtle";
    }
    
}
