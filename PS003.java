import java.util.Scanner;
public class PS003 {
    String name;
    int wickets;
    int matches;
    int ballsBowled;
    int runsConceded;

    public PS003() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }
    public PS003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    void computeBowlingAverage() {
        if (wickets != 0) {
            double average = (double) runsConceded / wickets; 
            System.out.println("Bowling Average: " + average);
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name: ");
        String name = sc.nextLine();
        
        System.out.println("wickets: ");
        int wickets = sc.nextInt();

        System.out.println("matches: ");
        int matches = sc.nextInt();

        System.out.println("balls_bowled: ");
        int ballsBowled = sc.nextInt();

        System.out.println("runs_conceded: ");
        int runsConceded = sc.nextInt();


        PS003 player = new PS003(name, wickets, matches, ballsBowled, runsConceded);
        System.out.println("Name: " + player.name);
        System.out.println("Wickets: " + player.wickets);
        System.out.println("Matches: " + player.matches);
        System.out.println("Balls Bowled: " + player.ballsBowled);
        System.out.println("Runs Conceded: " + player.runsConceded);


        player.computeBowlingAverage();
        
        sc.close();
    }
}
