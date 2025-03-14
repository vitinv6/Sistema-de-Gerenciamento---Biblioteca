public class Livro {
  private String titulo;
  private String autor;
  private int anoPublicação;
  private boolean disponivel;

  // Construtor
  public Livro(String titulo, String autor, int anoPublicação, boolean disponivel) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicação = anoPublicação;
    this.disponivel = disponivel;
  }

  // Getters e Setters
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getAnoPublicacao() {
    return anoPublicação;
  }

  public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicação = anoPublicacao;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  public String informacoes() {
      return "Título: " + titulo + "\n" +
             "Autor: " + autor + "\n" +
             "Ano de Publicação: " + anoPublicação + "\n" +
             "Disponível: " + (disponivel ? "Sim" : "Não");
  }
}