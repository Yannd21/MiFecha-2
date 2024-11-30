public class MiFecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor por defecto
    public MiFecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1990;
    }

    // Constructor con parámetros
    public MiFecha(int dia, int mes, int anio) {
        if (setDia(dia) && setMes(mes) && setAnio(anio) && fechaValida()) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            // Si la fecha no es válida, inicializamos a 01/01/1990
            this.dia = 1;
            this.mes = 1;
            this.anio = 1990;
        }
    }

    // Métodos get
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    // Métodos set con validación
    public boolean setDia(int dia) {
        if (dia > 0 && dia <= 31) { // Validación básica
            this.dia = dia;
            return true;
        }
        return false;
    }

    public boolean setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public boolean setAnio(int anio) {
        if (anio > 0) { // Consideramos años positivos
            this.anio = anio;
            return true;
        }
        return false;
    }

    // Validar fecha completa
    public boolean fechaValida() {
        if (mes < 1 || mes > 12 || dia < 1) return false;

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esBisiesto(anio)) {
            diasPorMes[1] = 29; // Ajustar febrero para años bisiestos
        }
        return dia <= diasPorMes[mes - 1];
    }

    // Método para verificar si el año es bisiesto
    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
