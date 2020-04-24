package oreilly.battleSea;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); // создаем єкземпляр класса  SimpleDotCom
        int[] area = {2, 3, 4}; // создаем массив для корабля с расположением на 2.3.4 (три последовательных числа из семи)
        dot.setLocationCells(area); // вызываем сеттер корабля
        String userGuess = "2"; // делаем ход от имени пользователя
        String result = dot.checkYourself(userGuess); // вызываем метод checkYourself () объекта SimpleDotCom
        String testResult = "НЕУДАЧА";
        if (result.equals("ПОПАЛ")) {
            testResult = "ПРОЙДЕН";
        }
        System.out.println(testResult);

    }
}
