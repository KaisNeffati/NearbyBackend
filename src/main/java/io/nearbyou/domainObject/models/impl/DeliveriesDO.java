package io.nearbyou.domainObject.models.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.nearbyou.domainObject.models.PersistedEntity;
import io.nearbyou.domainValue.GeoLocation;
import io.nearbyou.utils.CascadeSave;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "deliveries")
public class DeliveriesDO extends PersistedEntity {

    private String title;

    private String description;

    private GeoLocation location;

    private List<String> mediaIds;

    @JsonIgnore
    private int min_price;

    private long radius;

    @DBRef
    @CascadeSave
    private List<DeliverableDO> deliverableDOItems;

    @DBRef
    private User user;

    @DBRef
    private List<User> favoriteForUsers;

    public DeliveriesDO() {
    }

    public DeliveriesDO(long id, String title, String description, GeoLocation location, List<String> mediaIds, long radius, List<DeliverableDO> deliverableDOItems, User user) {
        super(id);
        this.title = title;
        this.description = description;
        this.location = location;
        this.mediaIds = mediaIds;
        this.radius = radius;
        this.deliverableDOItems = deliverableDOItems;
        this.user = user;
        this.setMin_price();
    }

    public List<String> getMediaIds() {
        return mediaIds;
    }

    public void setMediaIds(List<String> mediaIds) {
        this.mediaIds = mediaIds;
    }

    public List<DeliverableDO> getDeliverableDOItems() {
        return deliverableDOItems;
    }

    public void setDeliverableDOItems(List<DeliverableDO> deliverableDOItems) {
        this.deliverableDOItems = deliverableDOItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getMin_price() {
        return min_price;
    }

    public User getUsers() {
        return user;
    }

    public void setUsers(User user) {
        this.user = user;
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

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public List<User> getFavoriteForUsers() {
        return favoriteForUsers;
    }

    public void setFavoriteForUsers(List<User> favoriteForUsers) {
        this.favoriteForUsers = favoriteForUsers;
    }

    public void setMin_price() {
        this.deliverableDOItems.stream().min((e1, e2) -> e1.getPrice() - e2.getPrice()).ifPresent(e -> this.min_price = e.getPrice());
    }
}
