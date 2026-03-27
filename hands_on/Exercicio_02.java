public class Exercicio_02 {
    public static void main(String[] args) {
        //raio
        double r = 6371.01;

        //dando valor as coordenadas
        double latitudeA = 25;
        double longitudeA = 35;
        double latitudeB = 35.5;
        double longitudeB = 25.5;
       
        //organizando para a formula
        double x1 = Math.toRadians(latitudeA);
        double y1 = Math.toRadians(longitudeA);
        double x2 = Math.toRadians(latitudeB);
        double y2 = Math.toRadians(longitudeB);

        //formula
        double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        //saida
        System.out.println("A distância entre os pontos A e B são: " + d);
    }
}
