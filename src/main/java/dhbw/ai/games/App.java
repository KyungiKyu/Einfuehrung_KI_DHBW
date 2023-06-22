package dhbw.ai.games;

import dhbw.ai.games.exceptions.IllegalMoveException;
import dhbw.ai.games.impl.GameState;

//Achtung: Diese Datei darf nicht editiert werden!
/**
 * Diese Klasse ist eine Testanwendung.
 */
public class App
{

    public static void main(String[] argv){


        GameState gameState = new GameState();
        try {
            gameState = gameState.move(0,0); //X
            gameState = gameState.move(1,1); //O
            gameState = gameState.move(0,1); //X
            gameState = gameState.move(1,0); //O
            gameState = gameState.move(0,2); //X
            System.out.println(gameState.toString());

        } catch (IllegalMoveException e) {
            e.printStackTrace();
        }


    }
}

