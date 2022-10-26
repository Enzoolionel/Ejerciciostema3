public class principal {
    public static void main(String[] args) {

        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println(numeroIf + " es mayor que 0");
        }else if(numeroIf == 0){
            System.out.println(numeroIf + " es igual que 0");
        }else{
            System.out.println(numeroIf + " es menor que 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "Primaver";

        switch (estacion){
            case "Verano":
                System.out.println("La estación del año es "+ estacion);
                break;
            case "Invierno":
                System.out.println("La estación del año es "+ estacion);
                break;
            case "Otoño":
                System.out.println("La estación del año es "+ estacion);
                break;
            case "Primavera":
                System.out.println("La estación del año es "+ estacion);
                break;
            default:
                System.out.println("El dato ingresado no es una estación.");
        }
    }
}
