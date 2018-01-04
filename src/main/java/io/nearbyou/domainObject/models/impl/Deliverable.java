package io.nearbyou.domainObject.models.impl;

import io.nearbyou.domainObject.models.PersistedEntity;
import io.nearbyou.domainValue.DeliverableQuantity;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
@Document
public class Deliverable extends PersistedEntity {
    private String title;
    private DeliverableQuantity quantities;
    private String price;
    private ArrayList<String> mediaIds;

    @DBRef
    private Deliveries partOfDeliveries;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Deliveries getPartOfDeliveries() {
        return partOfDeliveries;
    }

    public void setPartOfDeliveries(Deliveries partOfDeliveries) {
        this.partOfDeliveries = partOfDeliveries;
    }

    public ArrayList<String> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(ArrayList<String> mediaIds) {
        this.mediaIds = mediaIds;
    }
}
