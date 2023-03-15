/*
Classe Material Radioativo - Exercicio 4
*/
package exercicio_04;

/**
 *
 * @author raoniton
 */
public class MaterialRadioativo {
    double massaInicial;
    double massaFinal;
    
    //Construtor
    public MaterialRadioativo(double massa){
        this.massaInicial = massa;
        this.massaFinal = massa;
    }
    
    public String calculaTempo(){
        int totalSegundos=0, hora, min, seg;
        
        while(this.massaFinal > 0.5){
            this.massaFinal = this.massaFinal/2;
            totalSegundos = totalSegundos + 50;
        }
        
        hora = totalSegundos/3600;
        min = (int)(totalSegundos - hora*3600)/60;
        seg = (int)(totalSegundos - hora*3600 - min*60);
        
        return +hora+"h"+min+"min"+seg+"s";
    }
    
    @Override
    public String toString(){
        return  this.massaInicial == this.massaFinal
                ? "Massa Inicial: "+this.massaInicial+" \nMassa Final: ainda nao calculada " + "\n-----------------------"
                : "Massa Inicial: " +this.massaInicial+ " \nMassa Final: "+this.massaFinal + "\n-----------------------"
        ;
    }
}
