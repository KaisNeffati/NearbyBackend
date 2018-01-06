package io.nearbyou.datatransferobject.impl;

import io.nearbyou.datatransferobject.DTO;
import io.nearbyou.domainValue.DeliverableQuantity;
import org.springframework.web.multipart.MultipartFile;

import java.util.Currency;
import java.util.List;


public class DeliverableDTO extends DTO {
    private String title;
    private DeliverableQuantity quantities;
    private Currency currency;
    private int price;
    private List<MultipartFile> mediaFiles;

    public DeliverableDTO(long id, String title, DeliverableQuantity quantities, int price) {
        super(id);
        this.title = title;
        this.quantities = quantities;
        this.price = price;
    }

    public DeliverableDTO(long id, String title, DeliverableQuantity quantities, int price, List<MultipartFile> mediaFiles) {
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

    public List<MultipartFile> getMediaFiles() {
        return mediaFiles;
    }

    public void setMediaFiles(List<MultipartFile> mediaFiles) {
        this.mediaFiles = mediaFiles;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    private static class DeliverableDTOResponse extends DeliverableDTO {
        private List<byte[]> mediaFiles;

        public DeliverableDTOResponse(long id, String title, DeliverableQuantity quantities, int price, List<byte[]> mediaFiles) {
            super(id, title, quantities, price);
            this.mediaFiles = mediaFiles;
        }
    }

    private static class DeliverableDTOBuilder {
        private long id;
        private String title;
        private DeliverableQuantity quantities;
        private int price;
        private List<byte[]> mediaFiles;

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
            return new DeliverableDTOResponse(id, title, quantities, price, mediaFiles);
        }

        public DeliverableDTOBuilder setMediaFiles(List<byte[]> mediaFiles) {
            this.mediaFiles = mediaFiles;
            return this;
        }

        public DeliverableDTOBuilder setId(long id) {
            this.id = id;
            return this;
        }
    }
}
