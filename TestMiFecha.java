public class TestMiFecha {
    public static void main(String[] args) {
        // Crear un objeto con el constructor por defecto
        MiFecha fecha1 = new MiFecha();
        System.out.println("Fecha por defecto: " + fecha1.getDia() + "/" + fecha1.getMes() + "/" + fecha1.getAnio());

        // Crear un objeto con valores válidos
        MiFecha fecha2 = new MiFecha(29, 2, 2024); // Año bisiesto
        System.out.println("Fecha válida: " + fecha2.getDia() + "/" + fecha2.getMes() + "/" + fecha2.getAnio());

        // Crear un objeto con valores inválidos
        MiFecha fecha3 = new MiFecha(31, 4, 2024); // Abril no tiene 31 días
        System.out.println("Fecha inválida: " + fecha3.getDia() + "/" + fecha3.getMes() + "/" + fecha3.getAnio());
    }
}
