package oreilly.battleSeaSecond;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        DotCom dot = new DotCom(); // создать экземпляр класса
        int[] locations = {2, 3, 4};
        //dot.setLocationCells(locations);
        String userGuess = "2"; // делаем ход от имени пользователя
        String result = dot.checkYourself(userGuess); // вызываем метод checkYourself () объекта SimpleDotCom

        String testResult = "НЕУДАЧА";
        if (result.equals("ПОПАЛ")) {
            testResult = "ТЕСТ ПРОЙДЕН";
        }
        System.out.println(testResult);
    }

}
