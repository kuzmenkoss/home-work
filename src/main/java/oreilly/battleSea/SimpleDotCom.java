package oreilly.battleSea;

public class SimpleDotCom {
    int[] locationCells;
    int[] area = {2, 3, 4};

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); // создать экземпляр класса
        System.out.println("Привет. Давай играть в морской бой, напиши цифру от 1 до 7");
        SuperPuperScanner stringGuess = new SuperPuperScanner();

    }

    public void setLocationCells(int[] locs) { //это не понятно зачем
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        int numOfHits = 0;
        String result = "МИМО";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "ПОПАЛ";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "ПОТОПИЛ";
        }
        System.out.println(result);
        return result;

    }

}
