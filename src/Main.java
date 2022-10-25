public class Main {
    public static void main(String[] args) {

        int resultant;
        resultant = suma(10,10,10);

        Coche myCoche = new Coche();
        myCoche.AgregarPuerta();
        System.out.println(myCoche.puertas);
        System.out.println(resultant);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche{
        public int puertas = 5;
        public void AgregarPuerta(){
            this.puertas++;
        }
    }
}
