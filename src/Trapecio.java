public class Trapecio extends Cuadrilatero{
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, double baseMayor, double baseMenor, double altura) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }


    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void area(double area) {
        area=((baseMayor+baseMenor)/2)*altura;
    }
    public void TraDistancia(){
        System.out.println("Ingresa el valor de el lado x1: " + x1);
        System.out.println("Ingresa el valor de el lado y1: " + y1);
        System.out.println("Ingresa el valor de el lado x2: " + x1);
        System.out.println("Ingresa el valor de el lado y2: " + y1);
        baseMayor = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Ingresa el valor de el lado x3: " + x1);
        System.out.println("Ingresa el valor de el lado y3: " + y1);
        System.out.println("Ingresa el valor de el lado x4: " + x1);
        System.out.println("Ingresa el valor de el lado y4: " + y1);
        baseMenor = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        altura = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
    }
}
