package entities;

public class Conta {
    
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public Conta(Integer numero, String agencia, String nomeCliente) {

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public void saque(Double valor){
        if(valor > this.saldo){
            throw new RuntimeException("Saldo Insuficiente");
        }
        else {
            this.saldo -= valor;
        }
    }

    public void deposito(Double valor){
        this.saldo += valor;
    System.out.println(valor);
    }


    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Olá " + this.nomeCliente +
        " obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + 
        ", conta " + this.numero + " e seu saldo "+
        this.saldo +" já está disponível para saque.";
    } 
}
