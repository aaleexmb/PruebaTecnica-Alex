import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cd cd = getInfoCd();
        DiscoDuro discoDuro = getInfoDiscoDuro();


        cd.infoDisco();
        System.out.println();
        cd.girarDisco();
        cd.almacenarDatos(MetodoLectura(cd));
        cd.leerDatos(MetodoLectura(cd));
        System.out.println();

        discoDuro.infoDisco();
        System.out.println();

        discoDuro.girarDisco();
        discoDuro.almacenarDatos(MetodoLectura(discoDuro));
        discoDuro.leerDatos(MetodoLectura(discoDuro));

    }

    private static String MetodoLectura(Disco disco) {
        if (disco instanceof Cd) {
            return "láser";
        } else if (disco instanceof DiscoDuro) {
            return "cabezal magnético";
        } else {
            return "método no definido";
        }
    }

    private static Cd getInfoCd() {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Introduce la marca del CD: ");
        String CDbrand = inputKeyboard.nextLine();
        System.out.println("Introduce la capacidad del CD: ");
        String CDmemory = inputKeyboard.nextLine();
        System.out.println("Introduce el contenido del CD: ");
        String CDcontent = inputKeyboard.nextLine();

        return new Cd(CDbrand, CDmemory, CDcontent, "CD");
    }

    private static DiscoDuro getInfoDiscoDuro() {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Introduce la marca del Disco Duro: ");
        String DDbrand = inputKeyboard.nextLine();
        System.out.println("Introduce la capacidad del Disco Duro: ");
        String DDmemory = inputKeyboard.nextLine();
        System.out.println("Introduce el contenido del Disco Duro: ");
        String DDcontent = inputKeyboard.nextLine();

        return new DiscoDuro(DDbrand, DDmemory, DDcontent, "Disco Duro");
    }
}

