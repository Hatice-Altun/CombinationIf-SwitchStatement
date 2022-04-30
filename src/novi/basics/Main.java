package novi.basics;

public class Main {

    public static void main(String[] args) {
	// Example combination of an If & Switch Statement
        int currentSeason = 2;
        if(currentSeason >= 0 && currentSeason < 5) {
            switch (currentSeason){
                case 1:
                    System.out.println("Lente!");
                    break;
                case 2:
                    System.out.println("Zomer!");
                    break;
                case 3:
                    System.out.println("Herfst!");
                    break;
                default:
                    System.out.println("Winter!");
            }
        }

    }
}
