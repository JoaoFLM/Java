
public abstract class Conta implements Senha{
    public String titular;
    protected String CPF;
    protected double saldo;
    protected int senha;
    public boolean acess;

    public Conta(String t, String cpf, int se){
        this.titular = t;
        this.CPF = cpf;
        this.saldo = 0;
        this.senha = se;
        this.acess = false;
    }

    public void sacar(double sacar){
        if(this.acess){    
            if(sacar > this.saldo){
                throw new IllegalArgumentException("Valor invalido");
            }
            else {
                this.saldo -= sacar;
                System.out.println("Saque realizado com sucesso");
            }
        }
        else throw new AcessoInvalidoException("ACESSO NEGADO!!!!!");
    }

    public void deposito(double deposito){
        if(this.acess){
            if(deposito < 0){
                throw new IllegalArgumentException("Valor invalido");
            }
            else {
                this.saldo += deposito;
                System.out.println("Deposito realizado com sucesso");
            }
        }
        else throw new AcessoInvalidoException("ACESSO NEGADO!!!!!");
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getCPF(){
        return this.CPF;
    }

    public abstract void mostrarInformacoes();
}