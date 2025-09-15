/**
 * Tehtävä 4 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Shape[] ja laske kokonaispinta-ala.
 *  2. Tulosta toString()-arvot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 4: implementoi Rectangle ja Circle ennen ajoa.");

        Rectangle a = new Rectangle(5, 5);
        Rectangle b = new Rectangle(5, 4);
        System.out.println(a.area());
        System.out.println(a.equals(b));

        Circle c = new Circle(34);
        Circle c2 = new Circle(34);
        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.equals(c2));

        Shape[] shapes = { a, b, c };

        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
            System.out.println(shape);
        }
        System.out.println("Kokonaispinta-ala: " + sum);
    }
}