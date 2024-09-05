package controler;

import java.util.Scanner;

import model.db.DB;
import view.TelaPrincipal;

public class Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		Scanner console = new Scanner(System.in);
		try {
			console = TelaPrincipal.menuPrincipal(console);
		}
		catch(Exception e) {
			System.out.println("Erro: " + e);
		}
		finally {
			DB.fechaConexao();
		}	
	}
}
