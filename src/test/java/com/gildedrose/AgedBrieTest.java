package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    void AgedBrieTestS5Q0() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 0) };
        AgedBrieUpdater app = new AgedBrieUpdater(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void AgedBrieTestS0Q0() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 0) };
        AgedBrieUpdater app = new AgedBrieUpdater(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void AgedBrieTestS3Q50() {
        Item[] items = new Item[] { new Item("Aged Brie", 3, 50) };
        AgedBrieUpdater app = new AgedBrieUpdater(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void AgedBrieTestS0Q49() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 49) };
        AgedBrieUpdater app = new AgedBrieUpdater(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void AgedBrieTestNameDifferent() {
        Item[] items = new Item[] { new Item("AgedBrie", 5, 2) };
        AgedBrieUpdater app = new AgedBrieUpdater(items);
        app.updateQuality();
        assertEquals("AgedBrie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }
}
