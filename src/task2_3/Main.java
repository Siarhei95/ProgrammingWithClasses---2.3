//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

package task2_3;

public class Main {
    public static void main(String[] args) {
        String capital = "Minsk";
        double totalArea = 207595;
        State state = new State(capital);
        State state1 = new State(totalArea);
        Printer printer = new Printer();
        Region region = new Region();
        District district = new District();

        printer.print(state);
        printer.print0(state1);
        printer.print1(region);
        district.dist(region);
    }
}
