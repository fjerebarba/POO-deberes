
package clase1;

public class Persona {
    public String Nombre;
    public int Edad;
    
    public Persona(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    
    public void informacion(){
        System.out.println("El nombre es: "+Nombre);
        System.out.println("La edad es: "+Edad);
    }
}
