public class Atividade1 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Jose");
        func.setCPF("00226758177");
        func.setSalario(10.000);
        func.apresentar();

        Gerente ger = new Gerente();
        ger.setNome("Maria");
        ger.setCPF("07796636760");
        ger.setSalario(20.000);
        ger.setSenha(10);
        ger.autentica(10);
        ger.apresentar();
    }
}
