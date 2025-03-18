package ExercicioAssociacao.Test;


import ExercicioAssociacao.Domain.Aluno;
import ExercicioAssociacao.Domain.Local;
import ExercicioAssociacao.Domain.Professor;
import ExercicioAssociacao.Domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Mônaco");
        Aluno aluno = new Aluno("Ayrton Senna", 32);
        Professor professor = new Professor("Treinador", "Nuno Cobra");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("=====Conselho=====", alunosParaSeminario , local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();



    }
}

