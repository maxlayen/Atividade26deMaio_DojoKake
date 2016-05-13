package br.unifor.cct.cc.logica.pratica;

import java.util.Scanner;

public class Principal {
	public static int numeroInscricao = 0;
	public static void main(String[] args) {
		Candidato [][] candidatos = new Candidato[4][5];	
		
		int opcao = 0;
		while (opcao!=5) {
		opcao = menu(candidatos,opcao);
		
			switch (opcao) {
			case 1:
				adicionarCandidato(candidatos);
				break;
			case 2:
				verificarCandidato(numeroInscricao, candidatos);
				break;
			default:
				break;
			}
			candidatos = OrdenarInscricao(candidatos);

		}

	}

	// Q02
	public static int menu(Candidato[][] candidato,int opcao){
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------");	 
		System.out.println("My Project-Seleção de candidatos");
		System.out.println("------------------------");	
		System.out.println("1 – Adicionar candidato");
		System.out.println("2 – Verificar existência do candidato");
		System.out.println("3 - Fases");
		System.out.println("4 - Mostrar quantidade de candidatos aprovados");
		System.out.println("5 - Finalizar o programa");

		opcao = scanner.nextInt(); 

		return opcao;
	}

	// Q03
	public static void adicionarCandidato(Candidato[][] candidatos) {

		Scanner s = new Scanner(System.in);

		String nome, curso, email, telefone;
		int semestre;
		boolean whatsapp;

		Candidato candidato = new Candidato();
		candidato.setCodigoInscricao(numeroInscricao);
		numeroInscricao++;

		System.out.println("Informe o semestre do candidato: ");
		semestre = s.nextInt();
		candidato.setSemestreCurso(semestre);

		System.out.println("Informe nome candidato: ");
		nome = s.nextLine();
		candidato.setNomeCandidato(nome);

		System.out.println("Informe o curso do candidato: ");
		curso = s.nextLine();
		candidato.setCurso(curso);

		System.out.println("Informe o email do candidato: ");
		email = s.nextLine();
		candidato.setEmail(email);

		System.out.println("Informe o telefone do candidato: ");
		telefone = s.nextLine();
		candidato.setTelefone(telefone);

		System.out.println("Informe se o candidato tem Whatsapp(True para sim e false para não): ");
		whatsapp = s.nextBoolean();
		candidato.hasWhatsapp();

		for (int i = 0; i < candidatos.length; i++) {
			for (int j = 0; j < candidatos.length; j++) {
				if (candidatos[i][j] == null) {
					candidatos[i][j] = candidato;
					System.out.println(candidatos[i][j].getNomeCandidato());
					break;
				}
			}
			break;
		}	
	}

	// Q04
	public static Candidato[][] OrdenarInscricao(Candidato[][] candidatos){
		for (int i = 0; i < candidatos.length; i++) {
			for (int j = 1; j < candidatos.length; j++) {
				for (int k = 0; k < candidatos.length; k++) {
					for (int l = 0; l < candidatos.length - 1; l++) {
						if(candidatos[k][l + 1] == null){
							break;
						}else{
							if(candidatos[k][l].getCodigoInscricao() > candidatos[k][l + 1].getCodigoInscricao()){
								Candidato aux = new Candidato();
								aux = candidatos[k][l];
								candidatos[k][l] = candidatos[k][l + 1];
								candidatos[k][l + 1] = aux;
							}
						}
					}
					break;
				}
				break;
			}
			break;
		}


		return candidatos;
	}
	//Q5
	public static boolean verificarCandidato(int codigoInscricao,Candidato[][] candidatos){
		boolean alunoExiste = false;
		Scanner scanner = new Scanner(System.in);
		int codigo;
		System.out.println("Informe um código de inscrição.");
		codigo = scanner.nextInt();

		for (int i = 0; i < candidatos.length; i++) {
			for (int j = 0; j < candidatos.length; j++) {
				if (candidatos[i][j] == null) {
					break;
				}else{
					if (candidatos[i][j].getCodigoInscricao() == codigo) {
						alunoExiste = true;
						break;
					}	
				}

			}
			break;
		}

		return alunoExiste;
	}
}
