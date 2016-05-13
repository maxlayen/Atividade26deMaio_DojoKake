public class Main {

//Q3 - Luis Guilherme, Guilherme Feitosa
//Q4 - Matheus da Silva, José Vitor
//Q5 - Eduardo Julien, Pedro Elpidio
//Q2, Q6 e Q08 - Emmanuel de Sousa, Paulo Arthur


	  public static void main (String args[]){
		 Scanner s = new Scanner(System.in);
		
		
		Candidato candidato = new Candidato ();           
		Candidato  matrizdados[][] = new Candidato[5][6]; 
		Scanner s = new Scanner(System.in);               
		int escolha=s.nextInt();                          
		menu(escolha);                                    
		if(escolha == 1){                                 
		adicionarCandidato(matrizdados);             
		}
		
		mostrarMenu(s);
		System.out.println(mostrarSeletivo());
		

		
	}
	
	  //Q02
	public static void mostrarMenu(Scanner s){
	    	int opcao;
		
    		System.out.println("Informe a opção desejada de acordo com o menu: \n");
		
		    System.out.println("­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­");
		    System.out.println("MyProject – Seleção de Candidatos");
		    System.out.println("­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­­");
		    System.out.println("1 – Adicionar candidato");
		    System.out.println("2 – Verificar existência do candidato");
		    System.out.println("3 ­ Fases");
		    System.out.println("4 – Mostrar quantidade de candidatos aprovados");
		    System.out.println("5 – Finalizar o programa");
		
	  }
	
	//Q03                                                             
	static Candidato[][] adicionarCandidato(Candidato matriz[][]) {  
		Candidato candidato = new Candidato();                       
		Scanner s = new Scanner(System.in);                          
                                                                     
		for (int i = 0; i < matriz.length; i++) {                    
			for (int j = 0; j < matriz.length; j++) {                
				System.out.println("Insira o nome do candidato: ");  
				candidato.nome = s.nextLine();                       
				System.out.println("Insira qual seu semestre: ");    
				candidato.semestre = s.nextInt();                    
				System.out.println("Insira seu email");              
				candidato.email = s.nextLine();	                     
			System.out.println("Digite seu telefone");               
			candidato.telefone = s.next();                           
			candidato.whatsapp = s.nextBoolean();                    
		}}                                                           
		return matriz;                                               
	}    
	
	// Q4
	static void ordenar(Candidato candidatos[][]){
	int menor; 
	int pos;
	for (int i = 0; i < candidatos.length; i++) {
		menor = candidatos[i][0];
		pos = i;
		
		for (int j = 0; j < candidatos.length; j++) {
			
			if (candidatos[i][0] < menor){
				menor = candidatos[i];
				pos = j;
		}	
		}
		candidatos[pos] = candidatos[i];
		candidatos[i] = menor;
	}
	}
	
	//Q5
	public boolean verificarNumero(String codigo){
		Candidato candidato = new Candidato();
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("iNFORME O NUMERO DE CANDIDATOS");
		n = teclado.nextInt();
		Candidato vetorcandidatos[] = new Candidato [n];
		for (int i = 0; i < vetorcandidatos.length; i++) {
			if(codigo.equals(vetorcandidatos[i].codigoinscrito)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	
	
	  //Q6
    public static String mostrarSeletivo(){
		    String explicacao = "O processo seletivo da MyProject é composto por 3 fases: \nA primeira delas é a inscrição, onde o candidato deve informar seus dados básicos acerca da universidade e informações de contato. \nA segunda é a dinâmica em grupo, onde os participantes são divididos em grupos e deverão realizar atividades propostas pelos avaliadores, a fim de avaliar seu comportamento em equipe. \nA terceira são as entrevistas individuais, onde os inscritos vão ser chamados em particular para conversar sobre seus interesses em participar, suas aspirações e outras perguntas para uma final avaliação no processo de seleção.";
		
		    return explicacao;
    }
    
    //Q08
    public static void terminar(){
		    System.exit(0);
		}


}
