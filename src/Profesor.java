import java.util.List;

public class Profesor extends Persona{

    String str; //nombre de la variable no descriptivo
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal() { 
        System.out.println("Nombre: " + str);//usar this para que sea mas claro que son atributos
        System.out.println("Edad: " + edad);//usar this para que sea mas claro que son atributos
        System.out.println("Teléfono: " + numeroDeTelefono);//usar this para que sea mas claro que son atributos
    }

    public void printTodaLaInformacion() {
        System.out.println("Nombre: " + str);//usar this para que sea mas claro que son atributos
        System.out.println("Edad: " + edad);//usar this para que sea mas claro que son atributos
        System.out.println("Teléfono: " + this.numeroDeTelefono);
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}