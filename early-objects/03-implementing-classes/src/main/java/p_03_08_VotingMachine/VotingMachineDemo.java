package p_03_08_VotingMachine;

/**
 * A class to test {@code VotingMachine} class.
 */
public class VotingMachineDemo
{
    public static void main(String[] args)
    {
        VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteDemocrats();
        votingMachine.voteDemocrats();

        votingMachine.voteRepublicans();
        votingMachine.voteRepublicans();
        votingMachine.voteRepublicans();

        System.out.println("Democrats: " + votingMachine.getDemVotes());
        System.out.println("Republicans: " + votingMachine.getRepVotes());

        votingMachine.resetVotes();

        System.out.println("*** Reset votes ***");

        System.out.println("Democrats: " + votingMachine.getDemVotes());
        System.out.println("Republicans: " + votingMachine.getRepVotes());
    }
}
