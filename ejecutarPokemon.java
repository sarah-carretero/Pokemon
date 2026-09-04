public class ejecutarPokemon {
    pokemonMenu menu = new pokemonMenu();
    public void iniciarPrograma(){
        menu.mostrarPokemones(); // muestra los pokemones completos
        menu.preguntas(); // 2 preguntas
        boolean score = menu.adivinarPokemon();
        menu.pedirNombre(score);
    }
}
