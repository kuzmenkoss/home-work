package oreilly.battleSeaFirst;

public class SimpleDotComTestDrive {
    static SimpleDotCom dot = new SimpleDotCom(); // создаем єкземпляр класса  SimpleDotCom

    public static void main(String[] args) {
       // test("0", "-3", "НЕПРАВИЛЬНІЙ ХОД") // до накрутки счетчика ходов
        test("1", "2", "ПОПАЛ");
        test("2", "5", "МИМО");
        test("3", "1", "МИМО");
        test("4", "4", "ПОПАЛ");
        test("5", "256", "МИМО");
        test("6", "3", "ПОТОПИЛ");
        test("7", "-5", "НЕПРАВИЛЬНЫЙ ХОД"); // после накрутки счетчика ходов
        test("8", "2", "УЖЕ ХОДИЛ СЮДА");
        test("9", "2", "ПРЕВЫШЕНО КОЛИЧЕСТВО ХОДОВ");

    }

    public static void test(String nameOfTest, String userGuess, String expectedResult) {
        System.out.println("\nTest " + nameOfTest);
        int[] area = {2, 3, 4}; // создаем массив для корабля с расположением на 2.3.4 (три последовательных числа из семи)
        dot.setLocationCells(area); // вызываем сеттер корабля
        //String userGuess = "2"; // делаем ход от имени пользователя
        String result = dot.checkYourself(userGuess); // вызываем метод checkYourself () объекта SimpleDotCom
        String testResult = "НЕУДАЧА";
        if (result.equals(expectedResult)) {
            testResult = "ТЕСТ ПРОЙДЕН";
        }
        System.out.println(testResult);
    }

}
