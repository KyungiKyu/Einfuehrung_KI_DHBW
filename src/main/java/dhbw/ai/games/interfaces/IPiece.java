

package dhbw.ai.games.interfaces;

/**
 * Interface dient dazu, ein Spielsteine eines Spielers dazustellen.
 *
 *
 *  */
public interface IPiece {
	/**
	 * Methode liefert den Gegner des aktuellen Spielers zurück.
	 * @return Spielstein des Gegners
	 */
	IPiece getOpponent();
}


