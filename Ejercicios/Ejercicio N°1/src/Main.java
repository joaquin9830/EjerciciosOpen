public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);
        int resultado = 0;
        resultado = total(10, 10, 50);
        System.out.println(resultado);
    }

    //Ejercicio N°1 => suma de tres parámetros
    public static int total(int a, int b, int c) {
        return a + b + c;
    }


}

//Segunda parte => creación de clase coche
class Coche{
    public int puertas = 4;

    public void AgregarPuertas(){
        this.puertas++;
    }
}

