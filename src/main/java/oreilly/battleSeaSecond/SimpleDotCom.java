package oreilly.battleSeaSecond;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;


    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); // создать экземпляр класса
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
    }

    public void setLocationCells(int[] locs) { //это не понятно зачем
        this.locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
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