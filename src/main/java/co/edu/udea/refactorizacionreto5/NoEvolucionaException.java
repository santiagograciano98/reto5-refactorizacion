package co.edu.udea.refactorizacionreto5;

public class NoEvolucionaException extends Exception{
    public NoEvolucionaException(){
        super("Este pokemon no puede evolucionar mas");
    }
}
