package POO_YouTube;

public class Comentario {
	private String comentario;
	private Usuario usuario;
	private Video video;
	private Comentario comenta;
	
	public Comentario (String comentario,Usuario usuario) {
		this.comentario = comentario;
		this.usuario = usuario;	
	}
	
	public Comentario() {
		
	}
	public Comentario (Video video, Comentario comenta, String comentario) {
		this.video = video;
		this.comentario = comentario;
	}
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Comentario getComenta() {
		return comenta;
	}
	public void setComenta(Comentario comenta) {
		this.comenta = comenta;
	}

public String toString() {
	return "Comentario [comenatrio=" + "comenatario]";
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((comenta == null) ? 0 : comenta.hashCode());
	result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
	result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
	result = prime * result + ((video == null) ? 0 : video.hashCode());
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
	Comentario other = (Comentario) obj;
	if (comenta == null) {
		if (other.comenta != null)
			return false;
	} else if (!comenta.equals(other.comenta))
		return false;
	if (comentario == null) {
		if (other.comentario != null)
			return false;
	} else if (!comentario.equals(other.comentario))
		return false;
	if (usuario == null) {
		if (other.usuario != null)
			return false;
	} else if (!usuario.equals(other.usuario))
		return false;
	if (video == null) {
		if (other.video != null)
			return false;
	} else if (!video.equals(other.video))
		return false;
	return true;
}
}

