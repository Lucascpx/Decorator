
package Decorator;

public class TesteAcai {

	public static void main(String[] args) {
            
            Adicional AcaiSimples = new Acai();
                  
            System.out.println(AcaiSimples.getDescricao());         
            System.out.println(AcaiSimples.Custo());
	       
            Adicional adicional = new Morango(AcaiSimples);
           
            adicional.Tamanho('g');

            System.out.println(adicional.getDescricao());
            System.out.println(adicional.Custo());
	        	        
            adicional = new Banana(adicional);
	       
            adicional = new LeiteCondensado(adicional);
	        
            System.out.println(adicional.getDescricao());	        
            System.out.println(adicional.Custo());
	    }	    		
	}