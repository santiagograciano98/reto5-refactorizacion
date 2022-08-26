package co.edu.udea.refactorizacionreto5;

public abstract class Pokemon {
    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();
    
    protected String nombre;
    protected byte nivel;
    protected int puntajeSalud;

    public Pokemon() {
    }

    public Pokemon(String nombre, byte nivel, int puntajeSalud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntajeSalud = puntajeSalud;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public int getPuntajeSalud() {
        return puntajeSalud;
    }

    public void setPuntajeSalud(int puntajeSalud) {
        this.puntajeSalud = puntajeSalud;
    }
    
    
}
