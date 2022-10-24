public class mainTest {
    private static final String colores[]={"rojo","Verde","Negro"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            Circulo circulo =FlyweightFactory.obtenerCirculo(colorAleatorio());
            circulo.setRadio(i+2.0);
            circulo.setTamaño("Tamaño:"+i+2);

        }
    }
    private static String colorAleatorio(){
        return colores[(int)(Math.random()*colores.length)];
    }
    public static void dibujar(){
        System.out.println("dibujamos objeto color:"+ colores);
    }
}
