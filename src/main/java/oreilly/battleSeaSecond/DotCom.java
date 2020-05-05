package oreilly.battleSeaSecond;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    //int[] locationCells;
    //int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) { //это сеттер
        this.locationCells = locs;
    }

    public String checkYourself(String userInput) {
        // int guess = Integer.parseInt(stringGuess);
        String result = "МИМО";
        int index = locationCells.indexOf(userInput);
//        for (int cell : locationCells) {
//                if (guess == cell) {
//                    result = "ПОПАЛ";
//                    numOfHits++;
//                    break;
//                }
//        }
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
//        }
//        if (numOfHits == locationCells.length) {
                result = "ПОТОПИЛ";
            } else {
                result = "ПОПАЛ";
            }
        }
        // System.out.println(result);
        return result;
    }


}
