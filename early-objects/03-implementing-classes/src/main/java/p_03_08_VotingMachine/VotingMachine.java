package p_03_08_VotingMachine;

/**
 * Implement a {@code VotingMachine} class that can be used for a simple
 * election. Have methods to clear the machine state, to vote for a Democrat,
 * to vote for a Republican, and to get the tallies for both parties.
 */
public class VotingMachine
{
    private int demVotes;
    private int repVotes;

    /**
     * Constructs voting machine with democrats and republicans votes = 0.
     */
    VotingMachine()
    {
        demVotes = 0;
        repVotes = 0;
    }

    /**
     * Adds one vote for democrats.
     */
    void voteDemocrats()
    {
        demVotes++;
    }

    /**
     * Adds one vote for republicans.
     */
    void voteRepublicans()
    {
        repVotes++;
    }

    /**
     * Resets all votes to zero.
     */
    void resetVotes()
    {
        demVotes = 0;
        repVotes = 0;
    }

    /**
     * Gets current number of democrats votes.
     *
     * @return the votes for democrats
     */
    int getDemVotes()
    {
        return demVotes;
    }

    /**
     * Gets current number of republicans votes.
     *
     * @return the votes for republicans
     */
    int getRepVotes()
    {
        return repVotes;
    }
}
