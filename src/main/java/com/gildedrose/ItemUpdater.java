package com.gildedrose;

class ItemUpdater {
    Item[] items;

    public ItemUpdater(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if(items[i].quality > 0) {items[i].quality--;}
            items[i].sellIn--;
            if(items[i].sellIn < 0 && items[i].quality > 0) {items[i].quality--;}
        }
    }
}
