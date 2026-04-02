package Objetos;

public class TesteJava {
	
	    public static void main(String[] args) {	    	
	        System.out.println("Teste de execução.");       
	        Conta c1 = new Conta(12555, 500.0, 200.0, 100.0);	  
                               	                
	                System.out.println("Nr: " + c1.getNumero());
	                System.out.println("Saldo: " + c1.getSaldo());
	                System.out.println("Limite: " + c1.getLimite());       
	                System.out.println("Sacar 100.0: " + c1.sacar(100.0));
	                System.out.println("Saldo atual: " + c1.getSaldo());	        
	                System.out.println("Sacar 200: " + c1.sacar(200));
	                System.out.println("Saldo atual: " + c1.getSaldo());
	                System.out.println("Limite: " + c1.getLimite());       
	                System.out.println("Sacar 100: " + c1.sacar(100));	                	               
	                System.out.println("Saldo : " + c1.getSaldo());
	                System.out.println("Limite: " + c1.getLimite());
	                System.out.println("Saldo : " + c1.getSaldo()); 
	                System.out.println("Limite : " + c1.getLimite()); 
	                System.out.println("Depositar 800:" + c1.depositar(800));
	                System.out.println("Saldo : " + c1.getSaldo());
	                	                          
	                           	              
	                
	                
	               }
	        }