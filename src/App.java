public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        /*
         * int resultado = rec.factorial(5);
         * System.out.println(resultado);
         * 
         * int suma = rec.sumaConsecutivo(5);
         * System.out.println();
         * System.out.println(suma);
         * 
         * int potencia = rec.potencia(4, 3);
         * System.out.println();
         * System.out.println(potencia);
         * 
         * int sumaD= rec.sumarDigitos(456);
         * System.out.println();
         * System.out.println(sumaD);
         * 
         * int fibo = rec.fibonacci(1);
         * System.out.println();
         * System.out.println(fibo);
         */
        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("src/directorios");
    }
}
