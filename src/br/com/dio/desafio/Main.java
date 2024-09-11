package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição do curso java.");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descrição do curso js.");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("descrição mentoria java.");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devCamilla = new Dev();
		devCamilla.setNome("Camilla");
		devCamilla.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camilla " + devCamilla.getConteudosInscritos());
		devCamilla.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camilla " + devCamilla.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Camilla " + devCamilla.getConteudosConcluidos());
		System.out.println("XP: "+ devCamilla.calcularTotalXp());
		
		System.out.println("-----------------------");
		
		Dev devJosy = new Dev();
		devJosy.setNome("Josy");
		devJosy.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Josy " + devJosy.getConteudosInscritos());
		devJosy.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Josy " + devJosy.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Josy  " + devJosy.getConteudosConcluidos());
		devJosy.progredir();
		devJosy.progredir();
		System.out.println("Conteúdos Inscritos Josy " + devJosy.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Josy  " + devJosy.getConteudosConcluidos());
		System.out.println("XP: "+ devJosy.calcularTotalXp());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria1);
		
		
	}
}
