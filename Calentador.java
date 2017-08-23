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
        temperatura = temperatura + incremento;
    }
    
    public void enfriar()
    {
        temperatura = temperatura - incremento;
    }
    
    public void temperaturaActual()
    {
       System.out.println("La Temperatura actual es de: " + temperatura); 
    }
}
