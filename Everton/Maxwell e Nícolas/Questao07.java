
	// Questão 7
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
