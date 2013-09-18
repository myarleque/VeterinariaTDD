package veterinariatdd;

public class VeterinariaTDD {

    public static void main(String[] args) {
      // Mascota mas = new Mascota("Boby");
      //System.out.println("Nombre mascota"+ mas.getNombre());
        
        
        
      // herencia  
     // Perro perro = new Perro("Jorge");
    // System.out.println("Nombre mascota"+ perro.getNombre());

    // Gato gato = new Gato("Fifi");
    // System.out.println("Nombre mascota"+ gato.getNombre());

     // herencia 
     
      // sobre escritura  // polimorfismo 
      Perro perro = new Perro("Jorge");
      System.out.println(perro.identificarse()+ " "+ perro.getNombre());

   
        
    }
}
