package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    void sulfurasS5Q5() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 5) };
        SulfurasUpdater app = new SulfurasUpdater(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void sulfurasDifferentName() {
        Item[] items = new Item[] { new Item("Sulfuras,Hand of Ragnaros", 5, 5) };
        SulfurasUpdater app = new SulfurasUpdater(items);
        app.updateQuality();
        assertEquals("Sulfuras,Hand of Ragnaros", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }

    @Test
    void sulfurasS0Q5() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 5) };
        SulfurasUpdater app = new SulfurasUpdater(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void sulfurasS5Q50() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 50) };
        SulfurasUpdater app = new SulfurasUpdater(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

}
