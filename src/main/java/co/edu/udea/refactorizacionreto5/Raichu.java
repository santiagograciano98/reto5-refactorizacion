package co.edu.udea.refactorizacionreto5;

public class Raichu extends Pokemon{

    public Raichu() {
    }

    public Raichu(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Raichu";
    }
    
}
