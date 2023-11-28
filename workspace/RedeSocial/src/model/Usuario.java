package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	private ArrayList<String> postagens;
	private Amizade amizade;

	public Usuario() {
		postagens = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<String> getPostagens() {
		return postagens;
	}

	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void novaPostagem(String postagem) {
		this.postagens.add(postagem);
	}
	
	public void listarPostagem() {
		for (String postagem : postagens) {
			System.out.println(postagem);
		}
	}
	public void criarAmizade(Usuario usuario) {
		ArrayList<Usuario>usuarios = new ArrayList<>();
		Amizade amizade = new Amizade();
		usuarios.add(usuario);
		amizade.setUsuariosA(usuarios);
		
	}
	
}


