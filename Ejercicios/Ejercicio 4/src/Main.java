public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.edad = 34;
    cliente.nombre= "Rogelio Hulius";
    cliente.telefono=328965;
    cliente.credito= 3000;
        System.out.println("El cliente "+cliente.nombre+" tiene la edad de "+ cliente.edad+" años, su telefono es "+cliente.telefono+" y tiene un credito de $ "+cliente.credito);

    Trabajador trabajador = new Trabajador();
    trabajador.edad= 25;
    trabajador.nombre= "Juan Galo";
    trabajador.telefono=456689798;
    trabajador.salario=500000;
        System.out.println("El trabajador "+trabajador.nombre+" tiene la edad de "+ trabajador.edad+" años, su telefono es "+trabajador.telefono+" y tiene un salario de $ "+trabajador.salario);

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;


}

class Cliente extends Persona{
    int credito;

}

class Trabajador extends Persona{
    int salario;
}
