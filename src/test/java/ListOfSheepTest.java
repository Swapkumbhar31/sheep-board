import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListOfSheepTest {
    @Test
    public void testLargeNumberOfSheep() {
        ListOfSheep los = new ListOfSheep();
        Faker faker = new Faker();
        for (int i = 0; i < 100000000; i++) {
            Sheep sheep1 = new Sheep(
                    faker.name().firstName(),
                    faker.color().name(),
                    faker.number().numberBetween(20, 100),
                    faker.number().numberBetween(20, 80)
            );
            los.AddSheep(sheep1);
        }
        assertEquals(Sheep.numberOfSheep, ListOfSheep.arrayList.size());
    }
}