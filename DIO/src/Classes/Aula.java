package Classes;

public abstract class Aula {
    private String nome;
    private String descricao;
    private Integer id;

    public abstract double horas();

    public Aula(String nome, String descricao, Integer id) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Aulas{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
