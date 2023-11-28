package App;

import java.util.Scanner;

import model.ListaUsuarios;
import model.Usuario;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome, email, senha;
		Usuario usuario = new Usuario();
		Usuario usuario2 = new Usuario();
		
//		System.out.println("Criando novo usuario:");
//		
//		System.out.print("\nInforme o nome do usuario: ");
//		nome = entrada.nextLine();
//		
//		System.out.print("Informe o e-mail do cliente: ");
//		email = entrada.nextLine();
//		
//		System.out.print("\nInforme a senha do usuario: ");
//		senha = entrada.nextLine();
		
		
		
		usuario.setNome("Rafaela");
		usuario.setEmail("rcfbrito");
		usuario.setSenha("1234");
		
		usuario2.setNome("Rafael");
		usuario2.setEmail("rcf");
		usuario2.setSenha("54321");
		
		ListaUsuarios.criarUsuarios(usuario);
		ListaUsuarios.criarUsuarios(usuario2);
		
		ListaUsuarios.listarUsuarios();
		ListaUsuarios.removerUsuarios(usuario);
		
		ListaUsuarios.listarUsuarios();
		
		
		System.out.println(usuario.toString());
		entrada.close();

	}

}
