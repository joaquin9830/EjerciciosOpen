public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(20);
        int edad = persona.getEdad();

        persona.setNombre("Angelo");
        String nombre = persona.getNombre();

        persona.setTelefono(5559088);
        int telefono = persona.getTelefono();

        System.out.println("La edad de "+nombre + " es "+edad +" "+" y su número de telefono es "+telefono);

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int valor){
        this.edad = valor;
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public void setTelefono(int valor){
        this.telefono = valor;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
