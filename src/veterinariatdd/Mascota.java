package veterinariatdd;



// clase padre y/ o madre
public abstract class  Mascota {
    
    
    protected String nombre;

    public String getNombre() {
        return nombre;
    }
    
    // no se alcanca en otras clases 
    //private String raza;
    //private boolean vacuna;
    // para el caso de herencia protected
    protected String raza;
    protected boolean vacuna;
    
    
    // valores de serializacion 
    public Mascota(String nombre){
        this.nombre = nombre;
        this.vacuna = false;
    }
    
    // sobrescritura
    public String  identificarse(){
        return "Soy una mascota";
        
    }
    
    // metodo abstracto
    public abstract double costoBanho();
    
    
   
    
}
