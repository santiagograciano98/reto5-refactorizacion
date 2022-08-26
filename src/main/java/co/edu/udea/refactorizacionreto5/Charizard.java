package co.edu.udea.refactorizacionreto5;


public class Charizard extends Pokemon{

    public Charizard() {
    }

    public Charizard(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
    }

    @Override
    public String gritar() {
        return "Charizard";
    }
    
}
