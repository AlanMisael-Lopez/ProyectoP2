public class Cuadrado extends Cuadrilatero{
    private double lado;

    public Cuadrado(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4, double lado) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.lado = lado;
    }

    @Override
    public void area(double area) {
        area = lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public void CuaDistancia(){
        System.out.println("Ingresa el valor de el lado x1: " + x1);
        System.out.println("Ingresa el valor de el lado y1: " + y1);
        System.out.println("Ingresa el valor de el lado x2: " + x1);
        System.out.println("Ingresa el valor de el lado y2: " + y1);
        lado = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
