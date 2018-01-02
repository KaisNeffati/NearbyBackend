package io.nearbyou.domainObject.entities;

import java.util.Calendar;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
public abstract class PersistedEntity {
    private String id;
    private boolean deleted;
    private Calendar deletedAt;
    private boolean created;
    private Calendar createdAt;
    private Calendar updatedAt;

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

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
