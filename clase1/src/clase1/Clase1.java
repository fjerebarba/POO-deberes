
package clase1;

public class Clase1 {

    public static void main(String[] args) {
        Persona Persona1 = new Persona("Freud",18);
        Persona1.informacion();
        
        Persona Persona2 = new Persona("Jonathan",19);
        Persona2.informacion();
        
        Persona Persona3 = new Persona("Jeremy",20);
        Persona3.informacion();
        
        Car Car1 = new Car("Renaul","Azul", 2005);
        Car1.informacion();
        
        Car Car2 = new Car("Chevrolet","Negro",1980);
        Car2.informacion();
        
        Car Car3 = new Car("Masda","Blanco",2000);
        Car3.informacion();
        
        Animales Animales1 = new Animales("Perro","Kifa");
        Animales1.informacion();
        
        Animales Animales2 = new Animales("Gato","Pelusa");
        Animales2.informacion();
        
        Animales Animales3 = new Animales("Leon","Kira");
        Animales3.informacion();
    }
    
}
