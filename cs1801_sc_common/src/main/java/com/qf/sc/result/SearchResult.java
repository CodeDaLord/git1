package com.qf.sc.result;

import org.springframework.util.StringUtils;
import java.io.Serializable;

public class SearchResult implements Serializable{

    private Long id;
    //item_title 是solr定义的渔民 如果我们的字段和yumin 不一样 要加上("item_title")
    private String itemTitle;
    private String itemSellPoint;
    private Long itemPrice;
    private String itemImage;
    private String itemCategoryName;
    private String itemDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemSellPoint() {
        return itemSellPoint;
    }

    public void setItemSellPoint(String itemSellPoint) {
        this.itemSellPoint = itemSellPoint;
    }

    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemImage() {
        if(StringUtils.isEmpty(this.itemImage)==false){
            return this.itemImage.split(",")[0];
        }
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemCategoryName() {
        return itemCategoryName;
    }

    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @Override
    public String toString() {
        return "TbItem{" +
                "id=" + id +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemSellPoint='" + itemSellPoint + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemImage='" + itemImage + '\'' +
                ", itemCategoryName='" + itemCategoryName + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                '}';
    }
}
