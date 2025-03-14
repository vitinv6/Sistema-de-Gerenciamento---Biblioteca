import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e Setters
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

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void addLivroEmprestado(Livro livro) {
        this.livrosEmprestados.add(livro);
    }

    public void removeLivroEmprestado(Livro livro) {
        this.livrosEmprestados.remove(livro);
    }
}