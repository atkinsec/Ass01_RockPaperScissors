import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean playing = true;

        do {
            System.out.println("player A move [R,P,S]");
            playerA = in.nextLine();
            if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
            {
                System.out.println("player B move [R,P,S]");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                {
                    if (playerA.equalsIgnoreCase("R"))
                    {
                        if (playerB.equalsIgnoreCase("R"))
                        {
                            System.out.println("It is a tie, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            } else
                                System.out.println("invalid response, try again");

                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            System.out.println("Player B wins, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            } else
                                System.out.println("invalid response, try again");
                        }
                        else
                        {
                            System.out.println("Player A wins, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            } else
                                System.out.println("invalid response, try again");
                        }
                    }
                    else if (playerA.equalsIgnoreCase("P"))
                    {
                        if (playerB.equalsIgnoreCase("R"))
                        {
                            System.out.println("Player A wins, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            }
                            else
                                System.out.println("invalid response, try again");

                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            System.out.println("It is a tie, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            }
                            else
                                System.out.println("invalid response, try again");
                        }
                        else
                        {
                            System.out.println("Player B wins, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            }
                            else
                                System.out.println("invalid response, try again");
                        }
                    }
                    else
                    {
                        if (playerB.equalsIgnoreCase("R"))
                        {
                            System.out.println("Player B wins, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            }
                            else
                                System.out.println("invalid response, try again");

                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            System.out.println("Player A wins, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            }
                            else
                                System.out.println("invalid response, try again");
                        }
                        else
                        {
                            System.out.println("it is a tie, Do you want to play again? [y/n] ");
                            playAgain = in.nextLine();
                            if (playAgain.equalsIgnoreCase("y"))
                            {
                                playing = true;
                            }
                            else if (playAgain.equalsIgnoreCase("n"))
                            {
                                playing = false;
                            }
                            else
                                System.out.println("invalid response, try again");
                        }
                    }
                }
                else
                {
                    System.out.println("Not a valid move, try again.");
                }
            }
            else
            {
                System.out.println("Not a valid move, try again.");
            }

        } while (playing);

    }
}