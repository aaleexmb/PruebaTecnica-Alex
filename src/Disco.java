public class Disco {
    private String brand;
    private String memory;
    private String content;
    private String diskType;

    public Disco(String brand, String memory, String content, String diskType) {
        this.brand = brand;
        this.memory = memory;
        this.content = content;
        this.diskType = diskType;
    }

    public void girarDisco(){
        System.out.println("Disco girando...");
    }

    public void almacenarDatos(String metodoLecturaEscritura){
        System.out.println("Almecenando datos en disco: " + metodoLecturaEscritura);
    }

    public void leerDatos(String metodoLecturaEscritura){
        System.out.println("Leyendo datos en disco: " + metodoLecturaEscritura);
    }

    public String getBrand() {
        return brand;
    }

    public void infoDisco(){
        System.out.println("-----------INFO----------");
        System.out.println("Marca: " + brand);
        System.out.println("Capacidad: " + memory);
        System.out.println("Contenido: " + content);
        System.out.println("Tipo de Disco: " + diskType);
    }
}
