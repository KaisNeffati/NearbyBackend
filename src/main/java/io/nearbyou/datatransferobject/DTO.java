package io.nearbyou.datatransferobject;


public abstract class DTO {
    private long id;

    public DTO() {
    }

    public DTO(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}