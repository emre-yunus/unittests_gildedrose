package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemUpdaterTest {

    @Test
    void fooS0Q0() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        ItemUpdater app = new ItemUpdater(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void fooS5Q10() {
        Item[] items = new Item[] { new Item("foo", 5, 10) };
        ItemUpdater app = new ItemUpdater(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void fooS5Q50() {
        Item[] items = new Item[] { new Item("foo", 5, 50) };
        ItemUpdater app = new ItemUpdater(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    void fooS0Q10() {
        Item[] items = new Item[] { new Item("foo", 0, 10) };
        ItemUpdater app = new ItemUpdater(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void fooS0Q2() {
        Item[] items = new Item[] { new Item("foo", 0, 2) };
        ItemUpdater app = new ItemUpdater(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void fooS0Q1() {
        Item[] items = new Item[] { new Item("foo", 0, 1) };
        ItemUpdater app = new ItemUpdater(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

}
