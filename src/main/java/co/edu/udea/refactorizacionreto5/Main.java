package co.edu.udea.refactorizacionreto5;

public class Main {

    public static void main(String[] args) {
        Pokebola miPokebola = new Pokebola();

        Pokemon charmander = new Charmander("Darkai", (byte) 1, 100);
        System.out.println(charmander.gritar());
        miPokebola.setMiPokemon(charmander);

        Pokebola miPokebola1 = new Pokebola();
        Pokemon charmeleon = null;
        try {
            charmeleon = charmander.evolucionar();
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(charmeleon.gritar());
        miPokebola1.setMiPokemon(charmeleon);
        Pokemon charizard = null;
        try {
            charizard = charmeleon.evolucionar();
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(charizard.gritar());
        Pokebola miPokebola2 = new Pokebola();
        miPokebola2.setMiPokemon(charizard);
        try {
            charizard.evolucionar();
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }

        Pokebola miPokebola3 = new Pokebola();
        Pokemon pikachu = new Pikachu("Dialga", (byte) 22, 100);
        System.out.println(pikachu.gritar());
        miPokebola3.setMiPokemon(pikachu);

        Pokebola miPokebola4 = new Pokebola();
        Pokemon raichu = null;
        try {
            raichu = pikachu.evolucionar();
            System.out.println(raichu.gritar());
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            miPokebola4.setMiPokemon(raichu);
            raichu.evolucionar();
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }

        Pokebola miPokebola5 = new Pokebola();
        Pokemon squirtle = new Squirtle("Jirachi", (byte) 36, 100);
        System.out.println(squirtle.gritar());
        miPokebola5.setMiPokemon(squirtle);

        Pokebola miPokebola6 = new Pokebola();
        Pokemon wartortle = null;
        try {
            wartortle = squirtle.evolucionar();
        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(wartortle.gritar());
        miPokebola6.setMiPokemon(wartortle);

        Pokebola miPokebola7 = new Pokebola();
        Pokemon blastoise;
        try {
            blastoise = wartortle.evolucionar();
            System.out.println(blastoise.gritar());
            miPokebola7.setMiPokemon(blastoise);
            blastoise.evolucionar();

        } catch (NoEvolucionaException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
