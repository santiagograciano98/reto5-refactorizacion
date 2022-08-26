package co.edu.udea.refactorizacionreto5;

public class Charmander extends Pokemon {

    public Charmander() {
    }

    public Charmander(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    
    @Override
    public Pokemon evolucionar() {
        Pokemon charmeleon = new Charmeleon(nombre,nivel,puntajeSalud);
        return charmeleon;
    }

    @Override
    public String gritar() {
        return "Charmander";
    }
    
}
