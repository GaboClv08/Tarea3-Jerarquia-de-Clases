public class circulo extends figura implements Comparable<
    circulo>{
    private double radio;

    public circulo(double pRadio){
        radio = pRadio;
    }

    public double calcularArea(){
        return (2*3.14)*(radio*radio);
    }

    public int obtenerLados(){
        return 0;
    }

    public int compareTo(circulo circPorComparar){
        double areaPorComparar = circPorComparar.calcularArea();
        System.out.println("El radio de la figura a comparar es: "+areaPorComparar);
        double miArea = this.calcularArea();
        System.out.println("El radio de mi figura es: "+miArea);
        int ladoPorComparar =  circPorComparar.obtenerLados();
        System.out.println("El numero de lados de la figura a comparar es: "+ladoPorComparar);
        int miLado = this.obtenerLados();
        System.out.println("El numero de lados de mi figura es: "+miLado);
        
        if(miArea==areaPorComparar){
            System.out.println("Los radios son iguales");
            if(miLado == ladoPorComparar){
                System.out.println("Tienen el mismo numero de lados");
            }
            else{
                System.out.println("No tienen el mismo numero de lados");
            }
            return 0;
        }
        else if (miArea > areaPorComparar){
            System.out.println("El radio de mi figura es mayor");
            return 1;
        }
        else{
            System.out.println("El radio de mi figura es menor");
            return -1;
        }
    }
    public static void main(String[] args){
        circulo circ = new circulo(5.2);
        circulo circ2 = new circulo(4.6);
        circ.compareTo(circ2);
        }
}