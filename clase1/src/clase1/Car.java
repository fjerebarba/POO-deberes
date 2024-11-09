
package clase1;

public class Car {
    public String Marca;
    public String Color;
    public int Año;
    
    public Car(String Marca,String Color,int Año){
        this.Marca = Marca;
        this.Color = Color;
        this.Año = Año;
    }
    
    public void informacion(){
        System.out.println("La marca es: "+Marca+", el color es: "+Color+" y el ano es: "+Año);
    }
}
