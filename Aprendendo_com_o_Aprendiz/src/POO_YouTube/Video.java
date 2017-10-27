package POO_YouTube;

public class Video {
	private String nome;
	private String descricao;
	private int idVideo;
	private Canal canal;
	private Usuario usuario;
	private String titulo;
	
	public Video() {
		
	}
    
	
	public Video(String titulo,Usuario usuario) {
		this.titulo = titulo;
		this.usuario = usuario;
	}
	public Video(String nome,String descricao,int idVideo) {
		this.nome = nome;
		this.descricao = descricao;
		this.idVideo = idVideo;
			
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescriçao() {
		return descricao;
	}
	public void setDescriçao(String descriçao) {
		this.descricao = descriçao;
	}

	public int getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}
	public void setDono(Usuario usuario2) {
		this.usuario = usuario2;
	}
	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canal == null) ? 0 : canal.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + idVideo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (canal == null) {
			if (other.canal != null)
				return false;
		} else if (!canal.equals(other.canal))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idVideo != other.idVideo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

public String tostring () {
	return "Video[nome=" + nome + ",descricao=" + descricao + ",titulo=" + titulo + "]";
}
}
