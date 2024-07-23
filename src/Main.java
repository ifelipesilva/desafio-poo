import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(111);


        Curso curso2 = new Curso();
        curso2.setTitulo("React");
        curso2.setDescricao("curso de React");
        curso2.setCargaHoraria(40);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());





        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descricao bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devFe = new Dev();
        devFe.setNome("Felipe");
        devFe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devFe.getConteudosInscritos());

        devFe.progredir();

        System.out.println("Conteudos Inscritos: " + devFe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devFe.getConteudosConcluidos());
        System.out.println("XP:> " + devFe.calcularTotalXp());


        Dev devZe = new Dev();
        devZe.setNome("Ze");
        devZe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devZe.getConteudosInscritos());

        devZe.progredir();

        System.out.println("Conteudos Inscritos: " + devZe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devZe.getConteudosConcluidos());
        System.out.println("XP:> " + devZe.calcularTotalXp());




    }
}
