import java.util.ArrayList;
import java.util.Scanner;
abstract class Sports{
    abstract void type(String type);
}
public class Main extends Sports {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main=new Main();
        System.out.println("enter the category \n" +
                "1 : Cricket \n" +
                "2: Base Ball");
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> {
                Cricket cricket = new Cricket();
                main.type("cricket");
                editValues(cricket);
                loadValues(cricket);
            }
            case 2 -> {
                BaseBall baseBAll = new BaseBall();
                main.type("Base Ball");
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

    @Override
    void type(String type) {
        System.out.println("Type is : "+type);
    }
}
