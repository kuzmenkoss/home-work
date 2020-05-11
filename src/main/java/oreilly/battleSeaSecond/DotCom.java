//https://www.oreilly.com/catalog/errata.csp?isbn=9780596009205

package oreilly.battleSeaSecond;
import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) { //это сеттер
        this.locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "МИМО";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "ПОТОПИЛ";
                System.out.println("Ой! Вы потопили" + name + " :( ");
            } else {
                result = "ПОПАЛ";
            }
        }
        // System.out.println(result);
        return result;
    }

}
