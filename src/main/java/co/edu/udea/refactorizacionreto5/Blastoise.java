package co.edu.udea.refactorizacionreto5;

public class Blastoise extends Pokemon{

    public Blastoise() {
    }

    public Blastoise(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
       
    }

    @Override
    public String gritar() {
        return "Blastoise";
    }
    
}
