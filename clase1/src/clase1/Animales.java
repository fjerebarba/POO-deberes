
package clase1;

public class Animales {
    public String Tipodeanimal;
    public String Nombre;
    
    public Animales(String Tipodeanimal, String Nombre){
        this.Tipodeanimal = Tipodeanimal;
        this.Nombre = Nombre;
    }
    
    public void informacion(){
        System.out.println("El tipo de animal es: "+Tipodeanimal+" y el nombre es: "+Nombre);
    }
}
