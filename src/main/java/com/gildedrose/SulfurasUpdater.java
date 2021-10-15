package com.gildedrose;

public class SulfurasUpdater {
    Item[] items;

    public SulfurasUpdater(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                GildedRose gildedRose = new GildedRose(items);
                gildedRose.updateQuality();
            }
        }
    }
}
