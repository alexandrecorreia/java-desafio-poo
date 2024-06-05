import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria do Java");
        mentoria.setDescricao("descricao Mentoria em java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devUser = new Dev();
        devUser.setNome("Alexandre");
        devUser.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev-1 : " + devUser.getConteudosInscritos());
        devUser.progredir();
        System.out.println("Conteudos inscritos Dev-1 : " + devUser.getConteudosInscritos());
        System.out.println("Conteudos concluidos Dev-1 : " + devUser.getConteudosConcluidos());
        System.out.println("XP " + devUser.calcularTotalXp() );
        System.out.println("----------");

        /*Dev 2 ------------------------------ */

        Dev devUser2 = new Dev();
        devUser2.setNome("Luiz");
        devUser2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev-2 : " + devUser2.getConteudosInscritos());
        devUser2.progredir();
        System.out.println("Conteudos inscritos Dev-2 : " + devUser2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Dev-2 : " + devUser2.getConteudosConcluidos());
        System.out.println("XP " + devUser2.calcularTotalXp() );
        System.out.println("----------");

    }
}
