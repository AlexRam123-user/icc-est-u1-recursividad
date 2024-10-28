public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println(resultado);

        int suma = rec.sumaConsecutivo(5);
        System.out.println(suma);

        int potencia = rec.potencia(3, 3);
        System.out.println(potencia);

        int sumaD= rec.sumarDigitos(456);
        System.out.println(sumaD);
    }
}
