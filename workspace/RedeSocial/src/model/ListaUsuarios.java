package model;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaUsuarios {
	static private ArrayList<Usuario>listaUsuarios = new ArrayList<Usuario>();
	
	
	static public void criarUsuarios(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	static public void removerUsuarios(Usuario usuario) {
		listaUsuarios.remove(usuario);
	}
	
	static public void listarUsuarios() {
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario.getNome());
		}
	}
}
