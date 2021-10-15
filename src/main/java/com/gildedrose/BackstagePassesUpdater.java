package com.gildedrose;

public class BackstagePassesUpdater {
    Item[] items;

    public BackstagePassesUpdater(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if(items[i].quality < 50) {
                    items[i].quality++;
                }
                if (items[i].sellIn < 11 && items[i].quality < 50) {
                    items[i].quality++;
                }
                if (items[i].sellIn < 6 && items[i].quality < 50) {
                    items[i].quality++;
                }
                items[i].sellIn--;
                if(items[i].sellIn < 0) {items[i].quality = 0;}
            } else {
                GildedRose gildedRose = new GildedRose(items);
                gildedRose.updateQuality();
            }
        }
    }
}
