public class DiscoDuro extends Disco{
    public DiscoDuro(String brand, String memory, String content, String diskType) {
        super(brand, memory, content, diskType);
    }

    @Override
    public void girarDisco() {
        System.out.println("Disco Duro girando...");
    }

    @Override
    public void almacenarDatos(String metodoLecturaEscritura) {
        System.out.println("Escribiendo datos en Disco Duro mediante " + metodoLecturaEscritura);
    }

    @Override
    public void leerDatos(String metodoLecturaEscritura) {
        System.out.println("Leyendo datos en Disco Duro mediante " + metodoLecturaEscritura);
    }
}
