package dhbw.ai.games.exceptions;

public class IllegalMoveException extends Exception
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public IllegalMoveException()
    {
        super();
    }

    public IllegalMoveException(String p_errorMessage)
    {
        super(p_errorMessage);
    }
}
