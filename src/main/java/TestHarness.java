public class TestHarness {

    public void GenerateSheep(){

        for (int i = 1; i<11; i++) {
            Sheep sheep1 = new Sheep("SheepBoardId- " + i, "White",
                    (int) Math.ceil(Math.random() * 100), (int) Math.ceil(Math.random() * 100)
            );
            ListOfSheep los = new ListOfSheep();
            los.AddSheep(sheep1);
        }
    }
}
