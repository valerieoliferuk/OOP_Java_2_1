package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public static enum ItemName{
        AGED_BRIE("Aged Brie"),
        BACKSTAGE_PASS("Backstage passes to a TAFKAL80ETC concert"),
        SULFURAS("Sulfuras, Hand of Ragnaros");

        public final String name;

        // Constructor
        Message(String name) {
            this.name = name;
        }
    }

    public void nameNotEqualsAgedBrieOrBackstage(){
        if (items[i].quality > 0 && !items[i].name.equals(ItemName.SULFURAS.name)) {
                items[i].quality--;
        }
    }
    public void qualityLessThan50(){
        if (items[i].quality < 50) {
            items[i].quality++;
        }
    }
    public void nameEqualsBackstage(){
        if (items[i].sellIn < 6) {
            qualityLessThan50();
            qualityLessThan50();
        }else if (items[i].sellIn < 11){
            qualityLessThan50();
        }
    }

    public void sellInLessThan0(){
        if (!items[i].name.equals(ItemName.AGED_BRIE.name)
                && !items[i].name.equals(ItemName.BACKSTAGE_PASS.name))
        {
            nameNotEqualsAgedBrieOrBackstage();
        }else if (items[i].name.equals(ItemName.BACKSTAGE_PASS.name)){
            items[i].quality = 0;
        }else if (items[i].name.equals(ItemName.AGED_BRIE.name)){
            qualityLessThan50();

        }

    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(ItemName.AGED_BRIE.name)
                    && !items[i].name.equals(ItemName.BACKSTAGE_PASS.name))
            {
                nameNotEqualsAgedBrieOrBackstage();
            }else if (items[i].name.equals(ItemName.BACKSTAGE_PASS.name)){
                qualityLessThan50();
                nameEqualsBackstage();
            }else if (items[i].name.equals(ItemName.AGED_BRIE.name)){
                qualityLessThan50();
            }

            if (!items[i].name.equals(ItemName.SULFURAS.name)) {
                items[i].sellIn--;
            }

            if (items[i].sellIn < 0){
                sellInLessThan0();
            }

        }
    }
}