import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        //Ejemplo resuelto del prisma
        
        //Declaramos las  variables
        int cantidadLados;
        double longitudLados, altura, areaLateral,areaTotal,volumen;
        double perimetroBase, areaBase, apotema
            
        //Solicitamos los  datos al usuario
        System.out.print("Cantidad de lados: ");
        cantidadLados = lector.nextInt();
        System.out.print("Altura: ");
        altura = lector.nextDouble();
        System.out.print("Longitud de los lados: ");
        longitudLados = lector.nextDouble
            
        //calculamos los  datos
        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;
        double alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/2));
        areaBase = (perimetroBase * apotema)/2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
        
        //Mostrar los resultados
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}
