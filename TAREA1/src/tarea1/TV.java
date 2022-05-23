
package tarea1;


public class TV {
    
    int canal = 1 , nivelVolumen = 1;
    boolean on;
    
    TV()
    {
    }
    
    public void encender()
    {
        on = true;
        System.out.println("Se encendio la TV");
    }
    
    public void apagar()
    {
        on = false;
        System.out.println("Se apago la TV");
    }

    public void setVolumen(int nuevoNivelVolumen) 
    {
        if (nuevoNivelVolumen > 0 || nuevoNivelVolumen <= 10) 
        {
            this.nivelVolumen = nuevoNivelVolumen;
            System.out.println("Voluman: " + nivelVolumen );
        }
    }
    
    public void setCanal(int nuevoCanal)
    {
        if(nuevoCanal > 0 || nuevoCanal <= 100 )
        {
            this.canal = nuevoCanal;
            System.out.println("Canal: " + canal );
        }
    }
    
    
    public void subirCanal()
    {
        if(canal < 100 )
        {
            canal += 1;
        }
        
        System.out.println("Canal: " + canal);
    }
    
    public void bajarCanal()
    {
        if(canal > 1 )
        {
            canal -= 1;
        }
        
        System.out.println("Canal: " + canal);
    }
    
    
    
    public void subirVolumen()
    {
        if(nivelVolumen < 10 )
        {
            nivelVolumen += 1;
        }
        
        System.out.println("Volumen: " + nivelVolumen);
    }
    
    
    public void bajarVolumen()
    {
        if(nivelVolumen > 1 )
        {
            nivelVolumen -= 1;
        }
        
        System.out.println("Volumen: " + nivelVolumen);
    }
    
    
    
    
    
}
