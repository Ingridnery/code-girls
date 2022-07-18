package Classes;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bootcamp {
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private String nome;
    private Integer id;
    private String descricao;
    private Map<Integer, Dev> devs = new LinkedHashMap<>();
    private Map<Integer,Aula> aulas = new LinkedHashMap<>();

    public Bootcamp(LocalDate dataInicial, LocalDate dataFinal, String nome, Integer id, String descricao) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
    }


    public void addDev(Dev dev){
        if(devs.containsKey(dev.getId()))return;
        devs.put(dev.getId(),dev);
    }
    public void addAulas(Aula aula){
        if(aulas.containsKey(aula.getId())) return;
        aulas.put(aula.getId(),aula);
    }


    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        int cargaTotal = 0;

        for (Aula a :aulas.values()) {
            if(a instanceof Cursos){cargaTotal+=((Cursos) a).getCargaHoraria();}
            else{cargaTotal+=((Mentorias)a).getCargaHoraria();}
        }
        return "Bootcamp " + nome+": "+
                "data inicial: " + dataInicial +
                ", data final: " + dataFinal +
                ", id=" + id +
                ", descricao:" + descricao + "\n"+
                "Participantes: " + devs.values() +"\n"+
                "Aulas: " + aulas.values()+"\n"+
                "Carga horaria total:"+cargaTotal;
    }
}
