import java.util.ArrayList;

public class ListOfSheep {

    public static ArrayList<Sheep> arrayList = new ArrayList<>();

    public int AddSheep(Sheep sheepToAdd) {
        int numberOfSheep = 0;
        arrayList.add(sheepToAdd);
        System.out.println("Added a sheep " + sheepToAdd.SheepName);
        System.out.println("Total number of sheep:" + Sheep.numberOfSheep);
        return numberOfSheep;
    }

}