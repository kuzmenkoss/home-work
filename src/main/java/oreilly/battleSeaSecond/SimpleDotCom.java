package oreilly.battleSeaSecond;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

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
