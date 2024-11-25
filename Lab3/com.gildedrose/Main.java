package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void nameNotEqualsAgedBrieOrBackstage(){
        if (items[i].quality > 0 && !items[i].name.equals("Sulfuras, Hand of Ragnaros") {
                items[i].quality = items[i].quality - 1;

        }
    }
    public void qualityLessThan50(){
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
        }
    }
    public void nameEqualsBackstage(){
        if (items[i].sellIn < 11) {
            qualityLessThan50();
        }

        if (items[i].sellIn < 6) {
            qualityLessThan50();
        }
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert"))
            {
                nameNotEqualsAgedBrieOrBackstage();
            }else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                qualityLessThan50();
                nameEqualsBackstage();
            }else if (items[i].name.equals("Aged Brie")){
                qualityLessThan50();
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0 && !items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                nameNotEqualsAgedBrieOrBackstage();
            }

            if (items[i].sellIn < 0 && items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                items[i].quality = items[i].quality - items[i].quality;
            }

            if (items[i].sellIn < 0 && items[i].name.equals("Aged Brie")) {
                qualityLessThan50();
            }
        }
    }
}