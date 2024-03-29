package io.nearbyou.datatransferobject.impl;

import io.nearbyou.datatransferobject.DTO;
import io.nearbyou.domainValue.GeoLocation;

import java.util.List;


public class DeliveriesDTO extends DTO {

    private String title;

    private String description;

    private GeoLocation location;

    private List<String> mediaIds;

    private long radius;

    private List<DeliverableDTO> deliverableDTOs;

    private long userId;

    public DeliveriesDTO() {

    }

    public DeliveriesDTO(long id, String title, String description, GeoLocation location, long radius, List<DeliverableDTO> deliverableDTOs, long userId) {
        super(id);
        this.title = title;
        this.description = description;
        this.location = location;
        this.radius = radius;
        this.deliverableDTOs = deliverableDTOs;
        this.userId = userId;
    }

    public DeliveriesDTO(long id, String title, String description, GeoLocation location, List<String> mediaIds, long radius, List<DeliverableDTO> deliverableDTOs, long userId) {
        super(id);
        this.title = title;
        this.description = description;
        this.location = location;
        this.mediaIds = mediaIds;
        this.radius = radius;
        this.deliverableDTOs = deliverableDTOs;
        this.userId = userId;
    }

    public DeliveriesDTO(long id, String title, String description, GeoLocation location, List<String> mediaIds, long radius, List<DeliverableDTO> deliverableDTOs) {
        super(id);
        this.title = title;
        this.description = description;
        this.location = location;
        this.mediaIds = mediaIds;
        this.radius = radius;
        this.deliverableDTOs = deliverableDTOs;
    }

    public static DeliveriesDTOBuilder newBuilder() {
        return new DeliveriesDTOBuilder();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    public List<String> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<String> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public List<DeliverableDTO> getDeliverableDTOs() {
        return deliverableDTOs;
    }

    public void setDeliverableDTOs(List<DeliverableDTO> deliverableDTOs) {
        this.deliverableDTOs = deliverableDTOs;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public static class DeliveriesDTOBuilder {
        private long id;

        private String title;

        private String description;

        private GeoLocation location;

        private List<String> mediaIds;

        private long radius;

        private List<DeliverableDTO> deliverableDTOs;

        private long userId;

        public DeliveriesDTOBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public DeliveriesDTOBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public DeliveriesDTOBuilder setLocation(GeoLocation location) {
            this.location = location;
            return this;
        }

        public DeliveriesDTOBuilder setMediaIds(List<String> mediaIds) {
            this.mediaIds = mediaIds;
            return this;
        }

        public DeliveriesDTOBuilder setRadius(long radius) {
            this.radius = radius;
            return this;
        }

        public DeliveriesDTOBuilder setDeliverableDTOs(List<DeliverableDTO> deliverableDTOs) {
            this.deliverableDTOs = deliverableDTOs;
            return this;
        }

        public DeliveriesDTOBuilder setUserID(long userId) {
            this.userId = userId;
            return this;
        }

        public DeliveriesDTOBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public DeliveriesDTO createDeliveriesDTO() {
            return new DeliveriesDTO(id, title, description, location, mediaIds, radius, deliverableDTOs, userId);
        }

    }
}
