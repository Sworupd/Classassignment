import models.Measurement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Measurement unit = new Measurement(15);
        System.out.println(unit.getKm() + "km");
        System.out.println(unit.getCm() + "cm");
        System.out.println(unit.getDm() + "dm");
        System.out.println(unit.getMm() + "mm");
    }
}