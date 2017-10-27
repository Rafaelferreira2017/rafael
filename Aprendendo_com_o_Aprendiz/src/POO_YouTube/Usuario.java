package POO_YouTube;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private int idUsuario;
	private Canal canal;
	private String email;

	public Usuario(String email, String nome ) {
		this.email = email;
		this.nome = nome;
		
		}
	public Usuario() {
		
	}
	public Usuario(String nome,int idUsuario, Canal canal) {
		this.nome = nome;
		this.idUsuario = idUsuario;
		this.canal = canal;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Usuario> getVideo() {
		return getVideo();
	}

	public String toString() {
		return "Usuario [nome=" + nome + ", idUsuario=" + idUsuario + ", canal=" + canal + ", email=" + email + "]";
	}
		
}
