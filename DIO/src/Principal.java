import Classes.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        Dev dev = new Dev(1,"Ingrid");

        Bootcamp bootcamp = new Bootcamp(LocalDate.now(),LocalDate.now().plusMonths(1),"Santander",1,"Para garotas");

        Cursos cursos = new Cursos("Introducao","Inicio do caminho",1,124.5);

        Mentorias mentorias = new Mentorias("Duvidas","hora de codar",3,14.0);

        bootcamp.addAulas(mentorias);
        bootcamp.addAulas(cursos);

        dev.addBootcamp(bootcamp);

        Map<Integer,Bootcamp>  bootcampDev= dev.getBootcampDev();
        for (Bootcamp b : bootcampDev.values()) {
            System.out.println(b.toString());
        }

    }
}
