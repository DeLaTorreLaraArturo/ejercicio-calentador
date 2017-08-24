public class Calentador
{
    private int temperatura;
    private int incremento;
    private int mini;
    private int max;
    
    Calentador(int minimo, int maximo)
    {
        temperatura = 15;
        incremento = 3;
        mini = minimo;
        max = maximo;
    }
    
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
    
    public void calentar()
    {
        if(temperatura+incremento <= max)
        {
            temperatura = temperatura + incremento;
        }
        else
        {
            System.out.println("La temperatura ya no puede subir mas");
        }
    }
    
    public void enfriar()
    {
        if(temperatura-incremento >= mini)
        {
            temperatura = temperatura - incremento;
        }
        else
        {
            System.out.println("La temperatura ya no puede bajar mas");
        }
        
    }
    
    public int temperaturaActual()
    {
       return(temperatura);
    }
}
