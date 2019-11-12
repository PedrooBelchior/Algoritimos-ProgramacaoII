package Aula8.TAD;

/**
 * @author pedro.saraujo
 */
public class Ponto {

    private int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean igual(Ponto p) {
        return this.x == p.x
                && this.y == p.y;
    }

    public double distancia(Ponto p) {
        double distX = Math.pow(this.x - p.x, 2);
        double distY = Math.pow(this.y - p.y, 2);
        return Math.sqrt(distX + distY);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
