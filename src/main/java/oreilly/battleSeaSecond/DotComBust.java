package oreilly.battleSeaSecond;
import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // Создадим несколько "сайтов" и присвоим им адреса
        // Созаем три объекта DotCom, даем им имена и помещаем в ArrayList.
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        //Выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три 'сайта'.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");
        // повторяем с каждым объектом дотком в списке
        for (DotCom dotComToSet : dotComsList) {
            // получаем пользовательский ход
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // вызываем сетер из объекта дотком, чтобы передаеть ему местоположение, которое получили
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "МИМО";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("ПОПАЛ")) {
                break;
            }
            if (result.equals("ПОТОПИЛ")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все 'сайты' ушли ко дну! Ваши акции теперь ничего не стоят");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у вас довольно много времени." + numOfGuesses + "попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
