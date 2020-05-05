package oreilly.battleSeaSecond;

import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
//   DotComBust game = new DotComBust();
    //        String a = new String("dfgjfslk");
//        dotComsList.add(a);


    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println();
        System.out.println();
        System.out.println();

    }

    void startPlaying() {
    }

    void checkUserGuess() {
    }

    void finishGame() {
    }

}
