package view;

import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TelaPrincipal {

	public static Scanner menuPrincipal(Scanner console) throws InterruptedException, ParseException {
		
		int op = 0;
		do {
			System.out.println("\n\n### Sistema de Controle Escolar  ###");
			System.out.println("    =========================");
			System.out.println("    |     1 - Aluno         |");
			System.out.println("    |     2 - Curso         |");
			System.out.println("    |     3 - Disciplina    |");
			System.out.println("    |     0 - Sair          |");
			System.out.println("    =========================");
			System.out.print("    Opção -> ");
			op = console.nextInt();
			console.nextLine();
			
			switch(op) {
				case 1: ;
				case 2: TelaCurso.menuCurso(console);
				case 3: ;
				case 0: 
						System.out.println(" Aplicação foi encerrada!");
						break;
				default: 
						System.out.println(" Opção Inválida!");
						TimeUnit.SECONDS.sleep(2);
			}
			
		}while (op != 0);
		
		return console;
	}

}
