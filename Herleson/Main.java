public class Main {

  public static void main (String args[]){
    Scanner s = new Scanner(System.in);
		
		
		mostrarMenu(s);
		System.out.println(mostrarSeletivo());
		terminar();

		
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
	
	  //0Q6
    public static String mostrarSeletivo(){
		    String explicacao = "O processo seletivo da MyProject é composto por 3 fases: \nA primeira delas é a inscrição, onde o candidato deve informar seus dados básicos acerca da universidade e informações de contato. \nA segunda é a dinâmica em grupo, onde os participantes são divididos em grupos e deverão realizar atividades propostas pelos avaliadores, a fim de avaliar seu comportamento em equipe. \nA terceira são as entrevistas individuais, onde os inscritos vão ser chamados em particular para conversar sobre seus interesses em participar, suas aspirações e outras perguntas para uma final avaliação no processo de seleção.";
		
		    return explicacao;
    }
    
    //Q08
    public static void terminar(){
		    System.exit(0);
		}


}
