/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariatdd;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class PerroTest {
    
    Perro perro;
    
    public PerroTest() {
        perro = new Perro("Boby");
        
    }

    @Test
    public void todoPerrodebeteneruntamanio(){
        
        // se agrego el tamano
        perro.setTamanio(12);
        int tamanho = perro.getTamanio();
        boolean valor = true;
     
        if(tamanho == 0){
            valor = false;
        }
        Assert.assertTrue(valor);
        
        
    }
    
    @Test
    public void debocalcularelcostodelBahoDeUnPerroMini() {
        perro.setTamanio(1);
        Assert.assertEquals(15.0, perro.costoBanho());
    }
    
    @Test
    public void debocalcularcostodelBanoUnPerroMediano(){
     perro.setTamanio(2);
     Assert.assertEquals(30.0, perro.costoBanho());

    }
    
    @Test
    public void debocalcularcostodelBanoUnPerroGrande(){
     perro.setTamanio(3);
     Assert.assertEquals(45.0, perro.costoBanho());

    }
    
    
}