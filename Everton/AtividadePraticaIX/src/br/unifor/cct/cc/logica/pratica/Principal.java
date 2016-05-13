package br.unifor.cct.cc.logica.pratica;

import java.util.Scanner;

public class Principal {
	
	public static int numeroInscricao = 0;
	
	public static void main(String[] args) {
		Candidato [][] candidatos = new Candidato[4][5];	
		
		int opcao = 0;
		
		// Condição para Encerrar o programa.
		while (opcao!=5) {
		opcao = menu(candidatos,opcao);
		
			// As demais funções não estão sendo chamadas de acordo com o exercício
			// O código deve estar funcional.
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

	// Questão 02 - Davi Melo / Augusto Cesar
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

	// Questão 03 - Takeshi / Lucas Oliveira
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

	// Questão 04 - Luigi / Isis
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
	//Questão 05 - Lucas Frota / Antonio Kevin
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
	
	// Questão 06 - Pedro Henrique / Daniel Dantas
	// TODO 
	
	
	// Questão 07 - Nicolas / Max
	public static int alunosAprovados(String [] candidatos){
		int aprovados = 0;
		for (int i = 0; i < candidatos.length; i++) {
			for (int j = 0; j < candidatos.length; j++) {
				System.out.println("Informe se o candidato["+(i+1)+"]["+(j+1)+"] foi aprovado");
				aprovados = scan.nextBoolean();
				if(aprovados){
					alunosAprovados++;
				}
			}

			return alunosAprovados;
		}
	}
	
	// Questão 08 - Francisco Olímpio / Gabriel Albuquerque
}
