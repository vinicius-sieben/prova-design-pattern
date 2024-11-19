public class TestePersistencia {
    public static void main(String[] args) {
        ConfiguracoesGlobais instancia = ConfiguracoesGlobais.getInstance();
        instancia.setIdioma("FR-FR");
        instancia.setTema("Escuro");

        // Realiza outras operações
        ConfiguracoesGlobais outraInstancia = ConfiguracoesGlobais.getInstance();

        // Verifica se os dados permanecem consistentes
        System.out.println("Idioma: " + outraInstancia.getIdioma()); // Deve ser "fr-FR"
        System.out.println("Tema: " + outraInstancia.getTema());     // Deve ser "escuro"
    }
}
