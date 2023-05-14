package clay.more.db;

import clay.more.models.Item;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    static List<Item> items = new ArrayList<>();

    static{
        items.add(new Item(1L, "Mac Book Pro", "8 GB RAM 255 GB SSD Intel Core i7", 1199.99));
        items.add(new Item(2L, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        items.add(new Item(3L, "Mac Book Pro", "16 GB RAM 1 TB SSD Apple M1", 1199.99));
        items.add(new Item(4L, "ASUS Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Item(5L, "HP Laser Pro", "8 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Item(6L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));
    }

    public static List<Item> getItems(){
        return items;
    }
}
