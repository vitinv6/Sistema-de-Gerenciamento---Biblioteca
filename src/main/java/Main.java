public class Main {
    public static void main(String[] args) {
      LivroDigital livroDigital = new LivroDigital("O Guia do Mochileiro das Galáxias", "Douglas Adams", 1979, true, "https://www.example.com/download/livrodigital.pdf");
      LivroFisico livroFisico = new LivroFisico("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, true, 1216);

      System.out.println("Livro Digital:");
      System.out.println(livroDigital.informacoes());

      System.out.println("\nLivro Físico:");
      System.out.println(livroFisico.informacoes());
    }



    // Modificando o atributo disponivel
    //livro.setDisponivel(false);

    // Verificando a nova disponibilidade
    //System.out.println("Disponível: " +                         livro.isDisponivel());
  

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}