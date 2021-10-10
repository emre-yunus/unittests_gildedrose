package com.gildedrose;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void namedoesnotchange() {
        Item[] items = new Item[] { new Item("normal", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal", app.items[0].name);
    }

    @Test
    void sellinAbove0Decreases() {
        Item[] items = new Item[] { new Item("normal", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void qualityAbove0Decreases() {
        Item[] items = new Item[] { new Item("normal", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void sellin1Decreases() {
        Item[] items = new Item[] { new Item("normal", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void quality1Decreases() {
        Item[] items = new Item[] { new Item("normal", 10, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void sellin0Decreases() {
        Item[] items = new Item[] { new Item("normal", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void quality0DecreasesNot() {
        Item[] items = new Item[] { new Item("normal", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void sellinMin1Decreases() {
        Item[] items = new Item[] { new Item("normal", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void qualityWithSellinMin1DecreasesFast() {
        Item[] items = new Item[] { new Item("normal", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void sellinUnder0Decreases() {
        Item[] items = new Item[] { new Item("normal", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-11, app.items[0].sellIn);
    }

    @Test
    void qualityWithSellinUnder0DecreasesFast() {
        Item[] items = new Item[] { new Item("normal", -10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void quality1WithSellinUnder0DecreasesNormal() {
        Item[] items = new Item[] { new Item("normal", -10, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Disabled
    @Test
    void sellin10QualityUnder0() {
        Item[] items = new Item[] { new Item("normal", 10, -10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Disabled
    @Test
    void sellin10Quality60() {
        Item[] items = new Item[] { new Item("normal", 10, 60) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }
}
