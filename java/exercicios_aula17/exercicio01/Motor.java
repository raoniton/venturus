/*
Motor
-----
+ligado
-gasolina
-----
+ligar()
+temGasolina() 
*/
package exercicio01;

/**
 *
 * @author raoniton
 */
public class Motor implements Controle{

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }
    
    
    public boolean ligado;
    private boolean gasolina;
    
    @Override
    public void ligar(){
        if(temGasolina()){
            this.setLigado(true);
            System.out.println("Motor foi ligado");
        }else{
            this.setLigado(false);
            System.out.println("Nao temos gasolina para ligar o motor");
        }
    }
    
    @Override
    public boolean temGasolina(){
        return this.isGasolina();
    }
}
