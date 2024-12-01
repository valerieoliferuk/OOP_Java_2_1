package org.example;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public static enum ItemName{
        AGED_BRIE("Aged Brie"),
        BACKSTAGE_PASS("Backstage passes to a TAFKAL80ETC concert"),
        SULFURAS("Sulfuras, Hand of Ragnaros");

        public final String name;

        ItemName(String name) {
            this.name = name;
        }
    }

    public void reduceQuality(int i){
        if (items[i].quality > 0 && !items[i].name.equals(ItemName.SULFURAS.name)) {
            items[i].quality--;
        }
    }
    public void increaseQuality(int i){
        if (items[i].quality < 50) {
            items[i].quality++;
        }
    }
    public void nameEqualsBackstage(int i){
        if (items[i].sellIn >= 11) return;
        increaseQuality(i);
        if (items[i].sellIn < 6) increaseQuality(i);
    }
    public void sellInLessThan0(int i){
        if (!items[i].name.equals(ItemName.AGED_BRIE.name)
                && !items[i].name.equals(ItemName.BACKSTAGE_PASS.name))
        {
            reduceQuality(i);
        }else if (items[i].name.equals(ItemName.BACKSTAGE_PASS.name)){
            items[i].quality = 0;
        }else if (items[i].name.equals(ItemName.AGED_BRIE.name)){
            increaseQuality(i);
        }
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(ItemName.AGED_BRIE.name)
                    && !items[i].name.equals(ItemName.BACKSTAGE_PASS.name))
            {
                reduceQuality(i);
            }else if (items[i].name.equals(ItemName.BACKSTAGE_PASS.name)){
                increaseQuality(i);
                nameEqualsBackstage(i);
            }else if (items[i].name.equals(ItemName.AGED_BRIE.name)){
                increaseQuality(i);
            }
            if (!items[i].name.equals(ItemName.SULFURAS.name)) {
                items[i].sellIn--;
            }

            if (items[i].sellIn < 0) {
                sellInLessThan0(i);
            }
        }
    }
}
