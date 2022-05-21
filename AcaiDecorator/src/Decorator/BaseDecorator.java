
package Decorator;

public class BaseDecorator implements Adicional{
	
	Adicional wrapper;
        
	Adicional Tamanho;
 
    BaseDecorator (Adicional ad){
      this.wrapper = ad ;
    }   
    
    @Override
    public void Tamanho(char t) {
        wrapper.Tamanho(t);
        }
        
    @Override
    public String getDescricao(){
        return wrapper.getDescricao()  ;
    }
    
    @Override
    public double Custo() {
        return wrapper.Custo() ;
    }
}
