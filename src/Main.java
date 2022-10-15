public class Main {
    public static void main(String[] args) {
        Persona personita1 = new Persona();
        personita1.setNombre("Julian");
        personita1.setEdad(30);
        personita1.setTelefono("3211234567");
        personita1.setEstadoCivil(estadoCivil.CASADO);
        personita1.setGenero(Genero.MASCULINO);



        Persona personita2 = new Persona();
        personita2.setNombre("Juliana");
        personita2.setTelefono("3111234567");
        personita2.setEdad(18);
        personita2.setEstadoCivil(estadoCivil.SOlTERO);
        personita2.setGenero(Genero.FEMENINA);

        ingresarAFiesta(personita1);
        ingresarAFiesta(personita2);

    }

    private static void ingresarAFiesta(Persona persona) {
        if (persona.getEdad() >= 18 && persona.getEstadoCivil() == estadoCivil.SOlTERO) {
            System.out.println("puede ingresar a la fiesta" + persona.getNombre());

        } else {
            System.out.println("cuando hayas cumplido 18 o hayas terminado " + "con la toxica puedes volver"
                    + persona.getNombre());
            calcularPrecioIngreso(persona);

        }



    }
    private  static void calcularPrecioIngreso(Persona persona){
        int valorApagar = 0;

        switch (persona.getGenero()){
            case FEMENINA:
                valorApagar =7000;

                break;
            case MASCULINO:
                valorApagar = 1000;
                break;
            case NO_BINARIO:
                valorApagar = 8000;
                break;

            default:
        }
    }

}





