public class Index {
    public static void main(String[] args){
        Persona Persona0 = new Persona();

        Persona0.setNombre("Enzo Peralta");
        Persona0.setEdad(27);
        Persona0.setTelefono(562148243);

        System.out.println(Persona0.getNombre());
        System.out.println(Persona0.getEdad());
        System.out.println(Persona0.getTelefono());

    }
}
class Persona{
    private String nombre;
    private int edad;
    private long telefono;


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }
    public long getTelefono(){
        return this.telefono;
    }
}
