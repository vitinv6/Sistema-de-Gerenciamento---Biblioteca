public class LivroDigital extends Livro {
    private String urlDownload;

    // Construtor
    public LivroDigital(String titulo, String autor, int anoPublicacao, boolean disponivel, String urlDownload) {
        // Chama o construtor da classe pai (Livro) com todos os parâmetros necessários
        super(titulo, autor, anoPublicacao, disponivel);
        this.urlDownload = urlDownload;
    }

    // Getter e Setter para urlDownload
    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }

    // Sobrescrevendo o método informacoes para incluir a URL de download
    @Override
    public String informacoes() {
        return super.informacoes() + "\n" +
               "URL de Download: " + urlDownload;
    }
}
