public class HalfEmptyGlass {

    public static void main(String[] args) {

        final int volumeOfGlass = 300;
        System.out.println("volumeOfGlass = " + volumeOfGlass);

        final double percentOfBeverage = 51.2;
        System.out.println("percentOfBeverage = " + percentOfBeverage);

        final double volumeOfBeverage = volumeOfGlass * percentOfBeverage / 100;
        System.out.println("volumeOfBeverage = " + volumeOfBeverage);
    }
}
