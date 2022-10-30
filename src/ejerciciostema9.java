public class ejerciciostema9 {
    public static void main(String[] args) {

        Cliente miCliente = new Cliente();
        Trabajador miTrabajador = new Trabajador();

        miCliente.nombre = "Enzo Peralta";
        miCliente.edad = 27;
        miCliente.telefono = 718527891;
        miCliente.credito = 287;

        System.out.println(miCliente.nombre);
        System.out.println(miCliente.edad);
        System.out.println(miCliente.telefono);
        System.out.println(miCliente.credito);

        miTrabajador.nombre = "Lionel Peralta";
        miTrabajador.edad = 28;
        miTrabajador.telefono = 711237891;
        miTrabajador.salario = 500;

        System.out.println(miTrabajador.nombre);
        System.out.println(miTrabajador.edad);
        System.out.println(miTrabajador.telefono);
        System.out.println(miTrabajador.salario);

    }
}
class Persona{
    String nombre;
    int edad;
    long telefono;

}
class Cliente extends Persona{
    int credito;

}
class Trabajador extends Persona{
    int salario;
}