import br.com.desafio.dominio.Curso;
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




        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);




    }
}
