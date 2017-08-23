public class Calentador
{
    private int temperatura;
    
    Calentador()
    {
        temperatura = 15;
    }
    
    public void calentar()
    {
        temperatura = temperatura + 5;
    }
    
    public void enfriar()
    {
        temperatura = temperatura - 5;
    }
    
    public void temperaturaActual()
    {
       System.out.println("La Temperatura actual es de: " + temperatura); 
    }
}
