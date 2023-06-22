package dhbw.ai.games.interfaces;
import dhbw.ai.games.exceptions.IllegalMoveException;
import dhbw.ai.games.impl.Position;

import java.util.List;

/**
 * Generisches Interface beschreibt Klassen, die den Zustand eines Spiels speichern
 *
 */
public interface IGameState {
	/**
	 * Method gibt an, welcher Spieler dran ist
	 * @return Spieler der an der Reihe ist
	 */
	IPiece getTurn();

	/**
	 * Methode führt einen Zug aus
	 * @param row Angabe der Zeile im Board
	 * @param column Angabe der Spalte im Board
	 * @return Methode liefert einen neuen Spielzustand zurück mit einer aktuellen Belegung der Spielfelder
	 * @throws IllegalMoveException wird ausgelöst, falls eine dieser Bedingungen zutrifft:
	 * <ul>
	 *     <li>Angegebene Zeile ist innerhalb des Spielfeldes nicht gültig</li>
	 *     <li>Angegebene Spalte ist innerhalb des Spielfeldes nicht gültig</li>
	 *     <li>Spiel ist bereits vorbei (gewonnen, verloren oder unentschieden)</li>
	 *     <li>Angegebene Position ist durch eine andere Spielfigur besetzt</li>
	 * </ul>
	 *
	 */
	IGameState move(int row, int column) throws IllegalMoveException;

	/**
	 * Gibt eine Liste der zulässigen Züge zurück
	 * @return Liste der zulässigen Züge
	 */
	List<Position> getLegalMoves();

	/**
	 * Methode gibt an, ob das Spiel gewonnen wurde
	 * @return true falls das Spiel gewonnen wurde. Sonst false.
	 */
	boolean isWin();

	/**
	 * Methode gibt an, ob das Spiel unentschieden ist.
	 * @return true falls das Spiel unentschieden ist. Sonst false.
	 */

	default boolean isDraw() {
		return !isWin() && getLegalMoves().isEmpty();
	}

	/**
	 * Methode gibt an, ob der Zustand ein Endzustand ist. Dies ist der Fall, falls das Spiel gewonnen, verloren oder unentschieden ist.
	 * @return true falls der Zustand ein Endzustand ist. Sonst false.
	 */
	default boolean isTerminal() {
		return isWin() || isDraw();
	}


	/**
	 * Methode gibt eine Bewertung des Zustands aus Sicht eines Spielers zurück.
	 * @param player Spieler für den die Bewertung vorgenommen wird.
	 * @return Bewertung für den angegebenen Spieler: Es wird +1 zurückgegeben, falls der Spieler gewonnen hat, 0 falls das Spiel unentschieden ist und -1 falls der Spieler verloren hat
	 */
	double evaluate(IPiece player);
}
