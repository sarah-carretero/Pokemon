import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class pokemonMenu {
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    String ataque[] = {"Hydro pump", "Solar Beam", "Eruption", "Flamethrower", "Aqua Jet", "Whirlpool", "Synthesis", "Petal Dance"};
    boolean activo[] = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    boolean aguaAct = true;
    boolean fuegoAct = true;
    boolean plantaAct = true;

    pokemon squ = new agua("Squirtle", ataquesTotal());
    pokemon tot = new agua("Totodile", ataquesTotal());
    pokemon mud = new agua("Mudpik", ataquesTotal());
    pokemon fro = new agua("Froakie", ataquesTotal());
    pokemon qua = new agua("Quaxly", ataquesTotal());
    pokemon cha = new fuego("Charmander", ataquesTotal());
    pokemon cyn = new fuego("Cyndaquil", ataquesTotal());
    pokemon tor = new fuego("Torchic", ataquesTotal());
    pokemon lit = new fuego("Litten", ataquesTotal());
    pokemon fue = new fuego("Fuecoco", ataquesTotal());
    pokemon bul = new planta("Bulbasaur", ataquesTotal());
    pokemon chi = new planta("Chikorita", ataquesTotal());
    pokemon tre = new planta("Treecko", ataquesTotal());
    pokemon row = new planta("Rowlet", ataquesTotal());
    pokemon spr = new planta("Sprigatito", ataquesTotal());

    pokemon guess[] = {squ, tot, mud, fro, qua, cha, cyn, tor, lit, fue, bul, chi, tre, row, spr};
    int adivina = ran.nextInt(guess.length);
    pokemon secreto = guess[adivina];

    private File archivo;

    public void mostrarPokemones(){
        System.out.println("\nPOKEMONES DISPONIBLES:");
        for(int i = 0; i < guess.length; i++){
            boolean tipoActivo = false;
            if(guess[i].getTipo().equalsIgnoreCase("Agua") && aguaAct){
                tipoActivo = true;
            } else if(guess[i].getTipo().equalsIgnoreCase("Fuego") && fuegoAct){
                tipoActivo = true;
            }else if(guess[i].getTipo().equalsIgnoreCase("Planta") && plantaAct){
                tipoActivo = true;
            }
            if(tipoActivo && activo[i]){
                System.out.println(guess[i].decirTipo());
            }
        }
    }

    public void preguntas(){
        System.out.println("\nPregunta 1");
        System.out.println("1. Tipo");
        System.out.println("2. Ataque");
        int op1 = sc.nextInt();
        sc.nextLine();
        if(op1 == 1){
            preguntarTipo();
        }else if (op1 == 2){
            preguntarAtaque();
        }else {
            System.out.println("Respuesta inv�lida");
            preguntas();
        }
        mostrarPokemones();
        System.out.println("\nPregunta 2");
        System.out.println("1. Tipo");
        System.out.println("2. Ataque");
        int op2 = sc.nextInt();
        sc.nextLine();
        if(op2 == 1){
            preguntarTipo();
        }else if (op2 == 2){
            preguntarAtaque();
        }else {
            System.out.println("Respuesta inv�lida");
            preguntas();
        }
        mostrarPokemones();
    }

    public void preguntarTipo(){
        System.out.println("¿Qué tipo quieres preguntar?");
        System.out.println("1. Agua");
        System.out.println("2. Fuego");
        System.out.println("3. Planta");
        int t = sc.nextInt();
        sc.nextLine();
        String tipoBuscado = "";
        if(t == 1) {
            tipoBuscado = "Agua";
        }
        if(t == 2) {
            tipoBuscado = "Fuego";
        }
        if(t == 3) {
            tipoBuscado = "Planta";
        }
        if(secreto.getTipo().equalsIgnoreCase(tipoBuscado)){
            System.out.println("Sí es " + tipoBuscado);
            if(tipoBuscado.equalsIgnoreCase("Agua")){
                fuegoAct = false;
                plantaAct = false;
            }else if(tipoBuscado.equalsIgnoreCase("Fuego")){
                aguaAct = false;
                plantaAct = false;
            }else if(tipoBuscado.equalsIgnoreCase("Planta")){
                aguaAct = false;
                fuegoAct = false;
            }
        }else{
            System.out.println("No es " + tipoBuscado);
            if(tipoBuscado.equalsIgnoreCase("Agua")){
                aguaAct = false;
            }else if(tipoBuscado.equalsIgnoreCase("Fuego")){
                fuegoAct = false;
            }else if(tipoBuscado.equalsIgnoreCase("Planta")){
                plantaAct = false;
            }
        }
    }

    public void preguntarAtaque(){
        System.out.println("¿Qué ataque quieres preguntar?");
        
        for(int i = 0; i < ataque.length; i++){
            System.out.println((i + 1) + ". " + ataque[i]);
        }
        
        int op = sc.nextInt();
        sc.nextLine();
        
        if(op < 1 || op > ataque.length){
            System.out.println("Opción inválida");
            return;
        }
        
        String ataqueBuscado = ataque[op - 1];
        boolean secretoTiene = false;

        for(int i = 0; i < secreto.getAtaque().length; i++){
            if(secreto.getAtaque()[i].equalsIgnoreCase(ataqueBuscado)){
                secretoTiene = true;
            }
        }
        
        if(secretoTiene){
            System.out.println("Sí tiene " + ataqueBuscado);
        }else{
            System.out.println("No tiene " + ataqueBuscado);
        }

        for(int i = 0; i < guess.length; i++){
            boolean tipoActivo = false;
            
            if(guess[i].getTipo().equalsIgnoreCase("Agua") && aguaAct){
                tipoActivo = true;
            }else if(guess[i].getTipo().equalsIgnoreCase("Fuego") && fuegoAct){
                tipoActivo = true;
            }else if(guess[i].getTipo().equalsIgnoreCase("Planta") && plantaAct){
                tipoActivo = true;
            }
            
            if(tipoActivo && activo[i]){
                boolean pokemonTiene = false;

                for(int j = 0; j < guess[i].getAtaque().length; j++){
                    if(guess[i].getAtaque()[j].equalsIgnoreCase(ataqueBuscado)){
                        pokemonTiene = true;
                    }
                }

                if(secretoTiene != pokemonTiene){
                    activo[i] = false;
                }
            }
        }
    }

    public boolean adivinarPokemon(){
        System.out.println("\nEscribe el nombre:");
        String nom = sc.nextLine();
        boolean resultado;
        
        if(nom.equalsIgnoreCase(secreto.getNombre())){
            System.out.println("Ganaste");
            resultado = true;
        }else{
            System.out.println("Perdiste, era: " + secreto.getNombre());
            resultado = false;
        }
        return resultado;
    }

    public void pedirNombre(boolean status){
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        String jugador = nombre.toLowerCase();
        String doc = jugador + ".txt";
        int ganadas = 0;
        int partidas = 0;
        archivo = new File(doc);

        if(status){
            ganadas++;
        }

        if(status || !status){
            partidas++;
        }

        //Verifica el archivo
        try {

            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
                try {
                    BufferedReader brSplit = new BufferedReader(new FileReader(archivo));
                    BufferedReader br = new BufferedReader(new FileReader(archivo));
                    String linea;

                    while ((linea = brSplit.readLine()) != null) {
                        if(linea.contains("Partidas jugadas")){
                            partidas = Integer.parseInt(linea.split(": ")[1]);
                        }
                        if(linea.contains("Partidas ganadas")){
                            ganadas = Integer.parseInt(linea.split(": ")[1]);
                        }
                    }

                    if(status){
                        ganadas++;
                    }
                    partidas++;

                    brSplit.close();

                    
                    //Escribir reemplazando las partidas
                    try {
                        FileWriter texto = new FileWriter(archivo); 
                        PrintWriter txt = new PrintWriter(texto);

                        txt.println("Jugador: " + nombre + "\nPartidas jugadas: " + partidas + "\nPartidas ganadas: " + ganadas);

                        txt.close();
                        texto.close();

                    } catch (IOException e) {
                        System.out.println("Error al escribir el archivo");
                    }


                    System.out.println("¿Quieres ver tu score en consola?\n1. si\n2. no");
                    int resp = sc.nextInt();

                    if(resp==1){
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                    } else if(resp == 2){
                        System.out.println("Cerrando programa");
                    }

                    br.close();

                } catch (IOException e) {
                    System.out.println("Error al leer el archivo");
                }
                
            } else {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivo.getName());
                        
                // Escribir
                try {
                    FileWriter texto = new FileWriter(archivo); 
                    PrintWriter txt = new PrintWriter(texto);

                    txt.println("Jugador: " + nombre + "\nPartidas jugadas: " + partidas + "\nPartidas ganadas: " + ganadas);

                    txt.close();
                    texto.close();

                } catch (IOException e) {
                    System.out.println("Error al escribir el archivo");
                }

                // Leer archivo
                try {
                    BufferedReader br = new BufferedReader(new FileReader(archivo));
                    String linea;
                    System.out.println("¿Quieres ver tu score en consola?\n1. si\n2. no");
                    int resp = sc.nextInt();

                    if(resp==1){
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                    } else if(resp == 2){
                        System.out.println("Cerrando programa");
                    }

                    br.close();

                } catch (IOException e) {
                    System.out.println("Error al leer el archivo");
                }
            }

        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }

    public String[] ataquesTotal(){
        int a1 = ran.nextInt(ataque.length);
        int a2 = ran.nextInt(ataque.length);
        
        while(a2 == a1){
            a2 = ran.nextInt(ataque.length);
        }
        
        int a3 = ran.nextInt(ataque.length);
        while(a3 == a1 || a3 == a2){
            a3 = ran.nextInt(ataque.length);
        }
        
        int a4 = ran.nextInt(ataque.length);
        while(a4 == a1 || a4 == a2 || a4 == a3){
            a4 = ran.nextInt(ataque.length);
        }
        
        String[] b = {ataque[a1], ataque[a2], ataque[a3], ataque[a4]};
        return b;
    }
}
