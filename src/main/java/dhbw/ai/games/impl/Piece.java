package dhbw.ai.games.impl;


import dhbw.ai.games.interfaces.IPiece;


/**
 * Enumeration dient dazu, ein Spielstein eines Spielers abzubilden.
 *
 */
public enum Piece implements IPiece {
       X, O, E;   //Enum mit den Werten X, O oder E

        @Override
        public Piece getOpponent() {
            switch (this) {
                case X:
                    return Piece.O;
                case O:
                    return Piece.X;
                default: // E, empty
                    return Piece.E;
            }
        }

        @Override
        /**
         * Gibt eine textuelle Beschreibung eines Spielers aus. Mögliche Werte:
         *  E: Spieler unbekannt/steht nicht fest
         *  X: Spieler mit dem Zeichen X
         *  O: Spieler mit dem Zeichen O
         */
        public String toString() {
            switch (this) {
                case X:
                    return "X";
                case O:
                    return "O";
                default: // E, empty
                    return " ";
            }

        }

    }


