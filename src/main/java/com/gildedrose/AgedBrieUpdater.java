package com.gildedrose;

public class AgedBrieUpdater {
    Item[] items;

    public AgedBrieUpdater(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                if(items[i].quality < 50) {items[i].quality++;}
                items[i].sellIn--;
                if(items[i].sellIn < 0 && items[i].quality < 50) {items[i].quality++;}
            } else {
                ItemUpdater itemUpdater = new ItemUpdater(items);
                itemUpdater.updateQuality();
            }
        }
    }
}
