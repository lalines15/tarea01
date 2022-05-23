
package tarea1;


public class TAREA1 {

   
    public static void main(String[] args) {
    TV tv1 = new TV();
        tv1.encender();
        tv1.setCanal(30);
        tv1.setVolumen(5);
    
        System.out.println("");
        System.out.println("");
        
        TV tv2 = new TV();
        tv2.encender();
        tv2.subirCanal();
        tv2.subirCanal();
        tv2.subirVolumen();
    }
    
}
