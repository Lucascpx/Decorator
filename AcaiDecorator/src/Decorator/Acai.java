
package Decorator;


public class Acai implements Adicional {
    
    public char Tamanho = 'p';

	public void Tamanho(char t) {
         this.Tamanho = t;
	}

	@Override
	public String getDescricao() {
		return "Acai Tradicional "+"Tamanho: "+Tamanho;
	}
        
	@Override
	public double Custo() {

		switch (Tamanho) {

		case 'p':
			return 18.00;
		case 'm':
			return 20.00;
		default:
			return 21.00;
                }
        }
}
