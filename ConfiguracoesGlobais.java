public class ConfiguracoesGlobais {
    // Atributo estático e privado para armazenar a instância única
    private static ConfiguracoesGlobais instancia;

    // Atributos globais que representam configurações
    private String idioma = "PT-BR";
    private String tema = "Escuro";

    // Construtor privado pra evitar criação direta
    private ConfiguracoesGlobais(){
    }

    // Método público e estático para obter a única instância da classe
    public static ConfiguracoesGlobais getInstance() {
        if (instancia == null) {
            synchronized (ConfiguracoesGlobais.class) {
                if (instancia == null) {
                    instancia = new ConfiguracoesGlobais();
                }
            }
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Método para exibir as configurações globais
    public void exibirConfiguracoes() {
        System.out.println("Idioma: " + idioma);
        System.out.println("Tema: " + tema);
    }
}
