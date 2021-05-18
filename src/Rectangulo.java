public class Rectangulo extends Cuadrilatero{
    private double base;
    private double altura;

    public Rectangulo(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, double base, double altura) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void area(double area) {
        area=base*altura;
    }

    public void RecDistancia(){

        System.out.println("Ingresa el valor  la base x1: " + x1);
        System.out.println("Ingresa el valor de la base y1: " + y1);
        System.out.println("Ingresa el valor de la base x2: " + x2);
        System.out.println("Ingresa el valor de la base y2: " + y2);
        System.out.println("Ingresa el valor de la altura x3: " + x3);
        System.out.println("Ingresa el valor de la altura y3: " + y3);
        base = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        altura = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
    }

    public void Area() {

    }
}
