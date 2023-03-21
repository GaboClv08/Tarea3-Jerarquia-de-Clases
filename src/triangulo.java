public class triangulo extends figura implements Comparable<
    triangulo>{
    private double base;
    private double altura;

    public triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    public int obtenerLados(){
        return 3;
    }

    public int compareTo(triangulo triPorComparar){
        double areaPorComparar = triPorComparar.calcularArea();
        System.out.println("El area de la figura a comparar es: "+areaPorComparar);
        double miArea = this.calcularArea();
        System.out.println("El area de mi figura es: "+miArea);
        int ladoPorComparar =  triPorComparar.obtenerLados();
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
        triangulo tri = new triangulo(7.2,8.9);
        triangulo tri2 = new triangulo(6.5,10.9);
        tri.compareTo(tri2);
        }
}