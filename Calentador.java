/**
 * @author Arturo De La Torre Lara
 * @version 31 de Agosto del 2017
 */
public class Calentador
{
    private int temperatura;
    private int incremento;
    private int mini;
    private int max;
    
    public Calentador(int minimo, int maximo)
    {
        temperatura = 15;
        incremento = 3;
        mini = minimo;
        max = maximo;
    }
    /**
     * Si el incremento en la temperatur se desea mayor o menor al establecido puede modificarse con este metodo
     * @param inc paramtero para el valor que se desea sea ahora el incremento
     */
    public void modificarIncremento(int inc)
    {
        if(inc > 0)
        {
            incremento = inc;
        }
        else
        {
            incremento = 0;
        }
    }
    /**
     * Aumenta le suma el incremento a la temperatura y checa el condicional para que esta no rebace el limite establecido en la maxima temperatura
     */
    public void calentar()
    {
        if(temperatura+incremento <= max)
        {
            temperatura = temperatura + incremento;
        }
        else
        {
            System.out.println("La temperatura ya no puede subir mas");
            temperatura = max;
        }
    }
    /**
     *Resta a la temperatura el incremento establecido y checa en el condicional que la temperatura no se menor a la minima establecida 
     */
    public void enfriar()
    {
        if(temperatura-incremento >= mini)
        {
            temperatura = temperatura - incremento;
        }
        else
        {
            System.out.println("La temperatura ya no puede bajar mas");
            temperatura = mini;
        }
        
    }
    /**
     * @return Retorna el valor en el que se encuentra actualmente la temperatura
     */
    public int temperaturaActual()
    {
       return(temperatura);
    }
}
