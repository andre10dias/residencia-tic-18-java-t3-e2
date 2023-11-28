package model;

import java.util.ArrayList;

public class Amizade {
	private ArrayList<Usuario> usuariosA;
	private ArrayList<Usuario> usuariosB;
	
	public Amizade(ArrayList<Usuario> usuariosA, ArrayList<Usuario> usuariosB) {
		this.usuariosA = usuariosA;
		this.usuariosB = usuariosB;
	}

	public Amizade() {
		
	}

	public ArrayList<Usuario> getUsuariosA() {
		return usuariosA;
	}

	public void setUsuariosA(ArrayList<Usuario> usuariosA) {
		this.usuariosA = usuariosA;
	}

	public ArrayList<Usuario> getUsuariosB() {
		return usuariosB;
	}

	public void setUsuariosB(ArrayList<Usuario> usuariosB) {
		this.usuariosB = usuariosB;
	}
		
}
