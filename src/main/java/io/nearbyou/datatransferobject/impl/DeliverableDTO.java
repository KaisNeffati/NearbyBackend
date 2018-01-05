package io.nearbyou.datatransferobject.impl;

import io.nearbyou.datatransferobject.DTO;
import io.nearbyou.domainValue.DeliverableQuantity;

import java.io.File;
import java.util.Currency;
import java.util.List;


public class DeliverableDTO extends DTO {
    private String title;
    private DeliverableQuantity quantities;
    private Currency currency;
    private int price;
    private List<File> mediaFiles;

    public DeliverableDTO(long id, String title, DeliverableQuantity quantities, int price, List<File> mediaFiles) {
        super(id);
        this.title = title;
        this.quantities = quantities;
        this.price = price;
        this.mediaFiles = mediaFiles;
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

    public List<File> getMediaFiles() {
        return mediaFiles;
    }

    public void setMediaFiles(List<File> mediaFiles) {
        this.mediaFiles = mediaFiles;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    private static class DeliverableDTOBuilder {
        private long id;
        private String title;
        private DeliverableQuantity quantities;
        private int price;
        private List<File> mediaFiles;

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
            return new DeliverableDTO(id, title, quantities, price, mediaFiles);
        }

        public DeliverableDTOBuilder setMediaFiles(List<File> mediaFiles) {
            this.mediaFiles = mediaFiles;
            return this;
        }

        public DeliverableDTOBuilder setId(long id) {
            this.id = id;
            return this;
        }
    }
}
