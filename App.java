import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Calcule a distância entre dois pontos no plano cartesiano. Os pontos são (x1, y1) e (x2, y2).
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite as cordenadas: x1, y1");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Digite as cordenadas: x2, y2");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println("A distancai entre os pontos são: " + distancia);
        
        
    }
}
