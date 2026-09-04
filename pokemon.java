import java.util.Arrays;

abstract class pokemon {
    private String nombre;
    private String[] ataque1;

    pokemon(String nombre, String[] ataque1){
        this.nombre = nombre;
        this.ataque1 = ataque1;
    }

    public String getNombre(){
        return nombre;
    }
    public String[] getAtaque(){
        return ataque1;
    }

    public abstract String decirTipo();
    public abstract String getTipo();
}

class agua extends pokemon{
    agua(String nombre, String[] ataque1){
        super(nombre, ataque1);
    }

    public String decirTipo(){
        String t = "Nombre: " + getNombre() + " Tipo: Agua" + " Ataque: " + Arrays.toString(getAtaque());
        return t;
    }
    public String getTipo(){
        return "Agua";
    }
}

class fuego extends pokemon{
    fuego(String nombre, String[] ataque1){
        super(nombre, ataque1);
    }

    public String decirTipo(){
        String t = "Nombre: " + getNombre() + " Tipo: Fuego" + " Ataque: " + Arrays.toString(getAtaque());
        return t;
    }
    public String getTipo(){
        return "Fuego";
    }
}

class planta extends pokemon{
    planta(String nombre, String[] ataque1){
        super(nombre, ataque1);
    }

    public String decirTipo(){
        String t = "Nombre: " + getNombre() + " Tipo: Planta" + " Ataque: " + Arrays.toString(getAtaque());
        return t;
    }
    public String getTipo(){
        return "Planta";
    }
}
