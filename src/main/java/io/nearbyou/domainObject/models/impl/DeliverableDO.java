package io.nearbyou.domainObject.models.impl;

import io.nearbyou.domainObject.models.PersistedEntity;
import io.nearbyou.domainValue.DeliverableQuantity;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Currency;
import java.util.List;

@Document(collection = "deliverable")
public class DeliverableDO extends PersistedEntity {
    private String title;
    private DeliverableQuantity quantities;
    private int price;
    private Currency currency;
    private List<String> mediaIds;

    @DBRef
    private DeliveriesDO partOfDeliveries;

    public DeliverableDO(long id, String title, DeliverableQuantity quantities, int price, Currency currency, List<String> mediaIds) {
        super(id);
        this.title = title;
        this.quantities = quantities;
        this.price = price;
        this.currency = currency;
        this.mediaIds = mediaIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DeliverableQuantity getQuantities() {
        return quantities;
    }

    public void setQuantities(DeliverableQuantity quantities) {
        this.quantities = quantities;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DeliveriesDO getPartOfDeliveries() {
        return partOfDeliveries;
    }

    public void setPartOfDeliveries(DeliveriesDO partOfDeliveries) {
        this.partOfDeliveries = partOfDeliveries;
    }

    public List<String> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<String> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
