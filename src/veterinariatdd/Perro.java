package veterinariatdd;


public class Perro extends Mascota {

    private int tamanio;

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public Perro(String nombre){
        super(nombre); // llamar al constructor de la clase padre... 
        
      
    }
    
    //TODO: Sobre escritura
    // sobrescritura
   @Override 
   public String identificarse(){
     //  return super.identificarse()+  " de tipo perro y me llamo";
       
       
       return super.identificarse()+  " de tipo perro y me llamo" + nombre;
       
    }

    @Override
    public double costoBanho() {
          return 15.0 * this.tamanio; 
    }
            
    
}
