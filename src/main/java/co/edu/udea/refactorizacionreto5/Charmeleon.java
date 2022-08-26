package co.edu.udea.refactorizacionreto5;

public class Charmeleon extends Pokemon{

    public Charmeleon() {
    }

    public Charmeleon(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    
    @Override
    public Pokemon evolucionar() {
        Pokemon charizard = new Charizard(nombre,nivel,puntajeSalud);
        return charizard;
    }

    @Override
    public String gritar() {
        return "Charmeleon";
    }
    
}
