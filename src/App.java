import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Python para iniciantes");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria para tirar dúvidas sobre Java");
        mentoria.setData(LocalDate.now());
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Python");
        mentoria2.setDescricao("Mentoria para tirar dúvidas sobre Python");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Developer");
        bootcamp.setDescricao("Bootcamp para desenvolvedores");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devVictor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devVictor.getConteudosConcluidos());
        System.out.println("XP: " + devVictor.calcularTotalXp());

        System.out.println("--------------------");

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularTotalXp());
    }
}
