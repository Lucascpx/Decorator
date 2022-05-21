
package Decorator;

public class LeiteCondensado extends BaseDecorator {
	
	public LeiteCondensado(Adicional ad) {
	        super(ad);
	    }
	
	public void Tamanho() {		
	}
        @Override
        public String getDescricao(){
            return super.getDescricao()+" Leite Condensado ";
	    }
            
        @Override
        public double Custo(){
            return super.Custo() + 2.50;
        }
}