public class Main {
    public static void main(String[] args) {
        // O seguinte código deve gerar erro de compilação
        // ConfiguracoesGlobais instancia = new ConfiguracoesGlobais();

        // Obtendo a instância única do objeto de configurações globais do sistema
        ConfiguracoesGlobais configuracoes = ConfiguracoesGlobais.getInstance();

        // Exibindo as configurações padrão
        configuracoes.exibirConfiguracoes();

        // Alterando o idioma e o tema
        configuracoes.setIdioma("US-EN");
        configuracoes.setTema("Claro");

        // Exibindo as configurações atualizadas
        configuracoes.exibirConfiguracoes();

        // Garantindo que a instância é única
        ConfiguracoesGlobais outraInstancia = ConfiguracoesGlobais.getInstance();
        System.out.println("As instâncias são iguais? " + (configuracoes == outraInstancia));
    }
}
