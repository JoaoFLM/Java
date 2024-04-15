
class Main{
    public static void main(String[] args) {
        ContaPoupança CP01 = new ContaPoupança("Elloah", "080.470.159-82", 20052005);
        ContaCorrente CC01 = new ContaCorrente("Elloah", "080.470.159-82", 20052005);

        CP01.autentica(20052005);
        CC01.autentica(20052005);
        CP01.deposito(123);
        CC01.deposito(123);
        CP01.sacar(50);
        CC01.sacar(23);
        CP01.pagarMensalidade();
        CC01.pagarMensalidade();
        CP01.mostrarInformacoes();
        CC01.mostrarInformacoes();
        CP01.autentica();
        CC01.autentica();
        CP01.mostrarInformacoes();
        CC01.mostrarInformacoes();
    }
}
