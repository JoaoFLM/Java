public class ContaCorrente extends Conta{

    public ContaCorrente(String t, String cpf, int se) {
        super(t, cpf, se);
    }

    private double mensalidade = 25;

    public void pagarMensalidade(){
        if(this.acess){    
            if(this.saldo < mensalidade){
                throw new IllegalArgumentException("Valor invalido!!!!!");
            }
            else {
                this.saldo -= mensalidade;
                System.out.println("Mensalidade paga com sucesso");
            }
        }
        else throw new AcessoInvalidoException("ACESSO NEGADO!!!!!");
    }

    @Override
    public void autentica(int s) {
       if(this.senha != s){
            throw new SenhaInvalidaException("SENHA INVALIDA!!!!!");
       }
       else {
            this.acess = true;
       }
    }

    public void autentica(){
        if(this.acess){
            this.acess = false;
        }   
        else throw new AcessoInvalidoException("ACESSO NEGADO!!!!!");
    }

    @Override
    public void mostrarInformacoes(){
        if(this.acess){
            System.out.println("Titular: " + this.titular + "\nCPF: " + this.CPF + "\nSaldo: " + this.saldo + "\nMensalidade: " + mensalidade);
        }
        else{
            System.out.println("ACESSO NEGADO!!!!!");
        }
    }
}
