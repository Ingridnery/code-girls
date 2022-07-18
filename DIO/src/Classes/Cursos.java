package Classes;

public class Cursos extends Aula {

    private Double cargaHoraria;

    public Cursos(String nome, String descricao, Integer id, Double cargaHoraria) {
        super(nome, descricao, id);
        this.cargaHoraria = cargaHoraria;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double horas() {
        return cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso " + getNome()+", "+
                "descricao: "+getDescricao()+", "+
                "carga horaria: " + cargaHoraria;
    }
}
