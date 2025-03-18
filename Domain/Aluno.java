package ExercicioAssociacao.Domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(Seminario[] seminarios, int idade, String nome) {
        this.seminario = seminario;
        this.idade = idade;
        this.nome = nome;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminarios(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
