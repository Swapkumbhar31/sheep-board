import java.util.ArrayList;

public class ListOfSheep {

    public static ArrayList<Sheep> arrayList = new ArrayList<>();

    public int AddSheep(Sheep sheepToAdd) {
        // return number of sheep in the Database
        int numberOfSheep = 0;
        (arrayList).add(sheepToAdd);
        System.out.println("Added a sheep " + sheepToAdd.SheepName);
        System.out.println("Total number of sheeps:" + Sheep.numberOfSheep);
        return numberOfSheep;
    }
}