/**
 * Tehtävä 5 – Main
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Luo Employee[] ja laske palkkasumma.
 *  2. Tulosta tiedot.
 *
 * VINKIT:
 *  - Toteuta aliluokat ensin.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 5: implementoi SalariedEmployee ja HourlyEmployee ennen ajoa.");

        SalariedEmployee a = new SalariedEmployee("Pekka", 2000);
        HourlyEmployee b = new HourlyEmployee("Teuvo", 15, 160);
        Employee[] payroll = { a, b };

        double sum = 0;
        for (Employee employee : payroll) {
            System.out.println(employee);
            sum += employee.monthlyPay();
        }
        System.out.println("Kuukausipalkat yhteensä: " + sum);
    }
}