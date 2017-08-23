public class Calentador
{
    private int temperatura;
    private int incremento;
    
    Calentador()
    {
        temperatura = 15;
        incremento = 3;
    }
    
    public void calentar()
    {
        if(temperatura+3 < 30)
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
        if(temperatura-3 > -10)
        {
            temperatura = temperatura - incremento;
        }
        else
        {
            System.out.println("La temperatura ya no puede bajar mas");
        }
        
    }
    
    public void temperaturaActual()
    {
       System.out.println("La Temperatura actual es de: " + temperatura); 
    }
}
