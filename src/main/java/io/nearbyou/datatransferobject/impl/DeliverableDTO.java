package io.nearbyou.datatransferobject.impl;

import io.nearbyou.datatransferobject.DTO;
import io.nearbyou.domainValue.DeliverableQuantity;

import java.util.Currency;
import java.util.List;

public class DeliverableDTO extends DTO {
    private String title;
    private DeliverableQuantity quantities;
    private Currency currency;
    private int price;
    private List<String> mediaIds;

    public DeliverableDTO() {
    }

    public DeliverableDTO(long id, String title, DeliverableQuantity quantities, int price) {
        super(id);
        this.title = title;
        this.quantities = quantities;
        this.price = price;
    }

    public DeliverableDTO(long id, String title, DeliverableQuantity quantities, int price, List<String> mediaIds) {
        super(id);
        this.title = title;
        this.quantities = quantities;
        this.price = price;
        this.mediaIds = mediaIds;
    }

    public static DeliverableDTOBuilder newBuilder() {
        return new DeliverableDTOBuilder();
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

    public List<String> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<String> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public static class DeliverableDTOBuilder {
        private long id;
        private String title;
        private DeliverableQuantity quantities;
        private int price;
        private List<String> mediaIds;

        public DeliverableDTOBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public DeliverableDTOBuilder setQuantities(DeliverableQuantity quantities) {
            this.quantities = quantities;
            return this;
        }

        public DeliverableDTOBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public DeliverableDTO createDeliveriesDTO() {
            return new DeliverableDTO(id, title, quantities, price, mediaIds);
        }

        public DeliverableDTOBuilder setMediaIds(List<String> mediaIds) {
            this.mediaIds = mediaIds;
            return this;
        }

        public DeliverableDTOBuilder setId(long id) {
            this.id = id;
            return this;
        }
    }
}
