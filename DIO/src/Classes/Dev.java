package Classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dev {

   private Integer id;
   private String nome;
   public Map<Integer,Bootcamp> bootcampDev = new LinkedHashMap<>();

    public Dev(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
   public void addBootcamp(Bootcamp bootcamp){
        bootcampDev.put(bootcamp.getId(),bootcamp);
        bootcamp.addDev(this);
   }

    public Integer getId() {
        return id;
    }

    public Map<Integer, Bootcamp> getBootcampDev() {
        return bootcampDev;
    }

    @Override
    public String toString() {
        return "Dev:" +
                 nome +
                " ,id:" + id
                ;
    }
}
