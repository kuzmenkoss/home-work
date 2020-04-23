package oreilly.battleSea;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); // создаем єкземпляр класса  SimpleDotCom
        int[] area = {2, 3, 4}; // создаем массив для корабля с расположением на 2.3.4
        dot.setLocationCells(area);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

    }
}
