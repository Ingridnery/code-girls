package Classes;

public class Mentorias extends Aula{
    public Double cargaHoraria;

    public Mentorias(String nome, String descricao, Integer id, Double cargaHoraria) {
        super(nome, descricao, id);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double horas() {
        return cargaHoraria;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria " + getNome()+", "+
                "descricao: "+getDescricao()+", "+
                "carga horaria: " + cargaHoraria;
    }
}
