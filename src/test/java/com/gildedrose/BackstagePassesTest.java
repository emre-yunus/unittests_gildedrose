package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesTest {

    @Test
    void PassesS12Q5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 12, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void PassesDifferentName() {
        Item[] items = new Item[] { new Item("BackstagePasses to a TAFKAL80ETC concert", 5, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("BackstagePasses to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }

    @Test
    void PassesS11Q5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void PassesS10Q5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }

    @Test
    void PassesS6Q5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }

    @Test
    void PassesS5Q5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void PassesS0Q5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void PassesS4Q48() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 48) };
        BackstagePassesUpdater app = new BackstagePassesUpdater(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

}
