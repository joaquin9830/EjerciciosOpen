public class numero {

    //Ejercicio numeroIf
    public static void main(String[] args) {
       int numeroIf = 0;
       if(numeroIf > 0){
           System.out.println("El número es positivo");
       } else if (numeroIf < 0) {
           System.out.println("El número es negativo");
       }else{
           System.out.println("El número es cero");
            }

       //Segunda parte bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        //Tercera parte bucle do While
        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile - 1 ;
        }while(numeroWhile > 3);






       }


    }

