public class Cd extends Disco{
    public Cd(String brand, String memory, String content, String diskType) {
        super(brand, memory, content, diskType);
    }

    @Override
    public void girarDisco() {
        System.out.println("CD girando...");
    }

    @Override
    public void almacenarDatos(String metodoLecturaEscritura){
        System.out.println("Escribiendo datos en CD mediante " + metodoLecturaEscritura);
    }

    @Override
    public void leerDatos(String metodoLecturaEscritura) {
        System.out.println("Leyendo datos en CD mediante " + metodoLecturaEscritura);
    }
}
