import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Métodos
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(String titulo) {
        this.livros.removeIf(livro -> livro.getTitulo().equals(titulo));
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.informacoes());
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void emprestarLivro(String titulo, Usuario usuario) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.isDisponivel()) {
                livro.setDisponivel(false);
                usuario.getLivrosEmprestados().add(livro);
                System.out.println("Livro emprestado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado ou não disponível.");
    }

    public void devolverLivro(String titulo, Usuario usuario) {
        for (Livro livro : usuario.getLivrosEmprestados()) {
            if (livro.getTitulo().equals(titulo)) {
                livro.setDisponivel(true);
                usuario.getLivrosEmprestados().remove(livro);
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}