public class TesteUnicidade {
    public static void main(String[] args) {
        ConfiguracoesGlobais instancia1 = ConfiguracoesGlobais.getInstance();
        ConfiguracoesGlobais instancia2 = ConfiguracoesGlobais.getInstance();

        System.out.println("As instâncias são iguais? " + (instancia1 == instancia2)); // Deve ser true
    }
}
