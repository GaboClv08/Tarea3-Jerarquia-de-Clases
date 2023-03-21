public class rectangulo extends figura implements Comparable<
    rectangulo>{
    private double base;
    private double altura;

    public rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return base * altura;
    }

    public int obtenerLados(){
        return 4;
    }

    public int compareTo(rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        System.out.println("El area de la figura a comparar es: "+areaPorComparar);
        double miArea = this.calcularArea();
        System.out.println("El area de mi figura es: "+miArea);
        int ladoPorComparar =  rectPorComparar.obtenerLados();
        System.out.println("El numero de lados de la figura a comparar es: "+ladoPorComparar);
        int miLado = this.obtenerLados();
        System.out.println("El numero de lados de mi figura es: "+miLado);
        
        if(miArea==areaPorComparar){
            System.out.println("Las areas son iguales");
            if(miLado == ladoPorComparar){
                System.out.println("Tienen el mismo numero de lados");
            }
            else{
                System.out.println("No tienen el mismo numero de lados");
            }
            return 0;
        }
        else if (miArea > areaPorComparar){
            System.out.println("El area de mi figura es mayor");
            return 1;
        }
        else{
            System.out.println("El area de mi figura es menor");
            return -1;
        }
    }

public static void main(String[] args){
    rectangulo rect = new rectangulo(2.7,8.9);
    rectangulo rect2 = new rectangulo(2.7,8.9);
    rect.compareTo(rect2);
    }

}