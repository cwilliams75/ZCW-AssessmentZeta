package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String s = handSign;
        String replaceString =handSign.replace("rock", "paper");
        //if (handSign.equal (ROCK) return PAPER;
        //if (handSign.equal (PAPER) return SCISSOR;
        //if (handSign.equal (SCISSOR) return PAPER;
        //return "tie";


        return replaceString;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String s = handSign;
        String replaceString =handSign.replace("rock","scissor");

        return replaceString;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String s = handSignOfPlayer1 + handSignOfPlayer2;

        String replaceString = s.replace("rockscissor", "rock");

        return replaceString;
    }
    // if (getWinningMove(handSignOfPlayer1).equals(getLosingMove(handSignOfPlayer2))){
    // return handSignOfPlayer1;

}
