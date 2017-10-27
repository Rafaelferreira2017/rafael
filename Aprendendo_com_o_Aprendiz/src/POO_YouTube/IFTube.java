package POO_YouTube;
import java.util.ArrayList;
import java.util.Scanner;

public class IFTube {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Video> videos;
	
	public IFTube() {
		usuarios = new ArrayList<Usuario>();
		videos = new ArrayList<Video>();
	}
	
	public void addVideo(Scanner scan) {
		System.out.println("Título");
		String titulo = scan.nextLine();
		System.out.println("Qual o dono do vídeo?");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
			System.out.println("Este?? (S ou N)");
			if(scan.nextLine().equalsIgnoreCase("S")) {
				Video v = new Video(titulo, usuario);
				videos.add(v);
				return;
			}
		}
		System.out.println("Lista de usuários acabou. Vídeo não será adicionado");
	}
	
	public void ListarVideo() {
		for(Video video: videos) {
			System.out.println(video);
		}
	}
	
	
	public void addUsuario(Scanner scan) {
		System.out.println("Digite o email:");
		String email = scan.nextLine();
		System.out.println("Digite o nome:");
		String nome = scan.nextLine();
		Usuario u = new Usuario(email, nome);
		usuarios.add(u);
	}
	
	public void menu(Scanner scan) {
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Adiconar usuário");
		System.out.println("2 - Adiconar vídeo");
		System.out.println("3 - Listar videos");
		int opcao = scan.nextInt();
		scan.nextLine();
		switch (opcao) {
		case 1:
			addUsuario(scan);
			break;
		case 2:
			addVideo(scan);
			break;
		case 3:
			ListarVideo();
			break;
		default:
			break;
		}
	}
	
}