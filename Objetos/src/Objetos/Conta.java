package Objetos;

public class Conta {
	int numero;
	double saldo;
	double limite;
	double novoLimite;	

	
	    public Conta(int idConta, double valorSaldo, double valorLimite, double valorNovoLimite) {
	        this.numero = idConta;
	        this.saldo = valorSaldo;
	        this.limite = valorLimite;
	        this.novoLimite = valorNovoLimite; 
	    }
	    
	    public String depositar(double valor) {
	        if (valor > 0) {
	            this.saldo += valor;
	            return "Sucesso";
	        }
	        return "Valor inválido";
	    }

	    public boolean sacar(double valor) {
	        if (valor <= (this.saldo + this.limite)) {
	            this.saldo -= valor;
	            return true;
	        } else {
	            System.out.println("Saldo insuficiente : " + valor);
	            return false;
	        }
	    }
	    
	    public int getNumero() { return numero; }
	    public double getSaldo() { return saldo; }
	    public double getLimite() { return limite; }
	   
	    
	    
	    public void setLimite(double limite) {
	        this.limite = limite;
	    }

	    public void setNovoLimite(double novoLimite) {
	        this.novoLimite = novoLimite;
	    }
}
	    
	