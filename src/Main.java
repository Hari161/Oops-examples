import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the category \n" +
                "1 : Cricket \n" +
                "2: Base Ball");
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> {
                Cricket cricket = new Cricket();
                editValues(cricket);
                loadValues(cricket);
            }
            case 2 -> {
                BaseBall baseBAll = new BaseBall();
                editValues(baseBAll);
                loadValues(baseBAll);
            }
        }
    }

    private static void loadValues(Saveable loadSaveable) {
        System.out.println(loadSaveable);
    }

    private static void editValues(Saveable editSavaeble) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<String>();
        System.out.print("Enter Batsman name :");
        String batsManName = scanner.nextLine();
        System.out.print("Enter his chest number :");
        int chestNumber = scanner.nextInt();
        System.out.print("Enter Total Runs: ");
        long totalRuns = scanner.nextLong();
        values.add(0, batsManName);
        values.add(1, String.valueOf(chestNumber));
        values.add(2, String.valueOf(totalRuns));
        editSavaeble.setValues(values);
    }

}
