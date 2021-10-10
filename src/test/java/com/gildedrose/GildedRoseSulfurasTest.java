package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseSulfurasTest {

    @Test
    void sellinAbove0Stays() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].sellIn);
    }

    @Test
    void sellin0Stays() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void sellinUnder0Stays() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-10, app.items[0].sellIn);
    }

    @Test
    void qualityAbove0Stays() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].quality);
    }

    @Test
    void quality0Stays() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}
