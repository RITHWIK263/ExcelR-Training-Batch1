import java.util.Scanner;

public class ps003 {
    String name;
    int wickets;
    int matches;
    int ballsBowled;
    int runsConceded;

    
    public ps003() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    
    public ps003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }


    void computeBowlingAverage() {
    
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }

        
        if (matches == 0 && (ballsBowled > 0 || runsConceded > 0)) {
            System.out.println("Error");
            return;
        }

        
        if (wickets == 0) {
            System.out.println("Name: " + name);
            System.out.println("bowling_avg=Infinity");  
        } else {
            double average = (double) runsConceded / wickets; 
            System.out.println("Name: " + name);
            System.out.printf("bowling_avg=%.1f\n", average);  
        }
    }


    void showStatistics() {
        
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }

        System.out.println("Player Statistics:");
        System.out.println("Name: " + name);
        System.out.println("Wickets: " + wickets);
        System.out.println("Matches: " + matches);
        System.out.println("Balls Bowled: " + ballsBowled);
        System.out.println("Runs Conceded: " + runsConceded);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("name: ");
        String name = sc.nextLine();
        
        System.out.print("wickets: ");
        int wickets = sc.nextInt();

        System.out.print("matches: ");
        int matches = sc.nextInt();

        System.out.print("balls_bowled: ");
        int ballsBowled = sc.nextInt();

        System.out.print("runs_conceded: ");
        int runsConceded = sc.nextInt();

    
        ps003 player = new ps003(name, wickets, matches, ballsBowled, runsConceded);

    
        player.showStatistics();


        player.computeBowlingAverage();
        
        sc.close();
    }
}
