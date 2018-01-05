package io.nearbyou.domainObject.models;

import java.util.Calendar;
import java.util.GregorianCalendar;


public abstract class PersistedEntity {
    private long id;
    private boolean deleted;
    private Calendar deletedAt;
    private Calendar createdAt;
    private Calendar updatedAt;

    public PersistedEntity(long id) {
        this.id = id;
        this.createdAt = new GregorianCalendar();
        this.deleted = false;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Calendar getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Calendar deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public Calendar getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Calendar updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
