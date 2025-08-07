import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        Mentoria mentoriaJava = new Mentoria();

        cursoJavaBasico.setTitulo("Fundamentos de Java");
        cursoJavaBasico.setDescricao("Curso de Java Básico");
        cursoJavaBasico.setCargaHoraria(40);

        Curso cursoJavaIntermediario = new Curso();
        cursoJavaIntermediario.setTitulo("Intermediario de Java");
        cursoJavaIntermediario.setDescricao("Curso de Java Intermediario");
        cursoJavaIntermediario.setCargaHoraria(40);

        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Desmistificando as Keywords Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java Developer");
        bootcampJava.setDescricao("Desenvolvimento backend Java");
        bootcampJava.getConteudos().add(cursoJavaBasico);
        bootcampJava.getConteudos().add(cursoJavaIntermediario);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devAmarildo = new Dev();
        devAmarildo.setNome("Amarildo");
        devAmarildo.inscreverBootcamp(bootcampJava);

        System.out.println();
        System.out.printf("Conteúdos Inscritos: %s\n", devAmarildo.getConteudosInscritos());
        System.out.printf("Total de conteúdos inscritos: %s\n", devAmarildo.getConteudosInscritos().toArray().length);
        System.out.printf("Data de inicio: %s\n", bootcampJava.getDataInicio());
        System.out.printf("Data de termino: %s\n", bootcampJava.getDATA_FIM());
        System.out.printf("Conteúdos Concluidos: %s\n", devAmarildo.getConteudosConcluidos());
        System.out.printf("Xp atual: %s\n\n", devAmarildo.calcularXpTotal());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        devAmarildo.progredirBootcamp();
        System.out.printf("Conteúdos Inscritos: %s\n", devAmarildo.getConteudosInscritos());
        System.out.printf("Total de conteúdos inscritos: %s\n", devAmarildo.getConteudosInscritos().toArray().length);
        System.out.printf("Conteúdos Concluidos: %s\n", devAmarildo.getConteudosConcluidos());
        System.out.printf("Xp atual: %s\n\n", devAmarildo.calcularXpTotal());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        devAmarildo.progredirBootcamp();
        System.out.printf("Conteúdos Inscritos: %s\n", devAmarildo.getConteudosInscritos());
        System.out.printf("Total de conteúdos inscritos: %s\n", devAmarildo.getConteudosInscritos().toArray().length);
        System.out.printf("Conteúdos Concluidos: %s\n", devAmarildo.getConteudosConcluidos());
        System.out.printf("Xp atual: %s\n\n", devAmarildo.calcularXpTotal());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        devAmarildo.progredirBootcamp();
        System.out.printf("Conteúdos Inscritos: %s\n", devAmarildo.getConteudosInscritos());
        System.out.printf("Total de conteúdos inscritos: %s\n", devAmarildo.getConteudosInscritos().toArray().length);
        System.out.printf("Conteúdos Concluidos: %s\n", devAmarildo.getConteudosConcluidos());
        System.out.printf("Xp atual: %s\n\n", devAmarildo.calcularXpTotal());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        devAmarildo.progredirBootcamp();
        System.out.printf("Conteúdos Inscritos: %s\n", devAmarildo.getConteudosInscritos());
        System.out.printf("Total de conteúdos inscritos: %s\n", devAmarildo.getConteudosInscritos().toArray().length);
        System.out.printf("Conteúdos Concluidos: %s\n", devAmarildo.getConteudosConcluidos());
        System.out.printf("Xp atual: %s\n", devAmarildo.calcularXpTotal());
    }
}