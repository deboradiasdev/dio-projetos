import java.time.LocalDate;
import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDebora = new Dev();
        devDebora.setNome("Débora");
        devDebora.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Débora:" + devDebora.getConteudosInscritos());
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Débora:" + devDebora.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Débora:" + devDebora.getConteudosConcluidos());
        System.out.println("XP:" + devDebora.calcularTotalXp());

        System.out.println("-------");

        Dev devNathan = new Dev();
        devNathan.setNome("Nathan");
        devNathan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nathan:" + devNathan.getConteudosInscritos());
        devNathan.progredir();
        devNathan.progredir();
        devNathan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nathan:" + devNathan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Nathan:" + devNathan.getConteudosConcluidos());
        System.out.println("XP:" + devNathan.calcularTotalXp());

    }

}