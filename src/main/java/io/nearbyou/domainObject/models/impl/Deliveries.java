package io.nearbyou.domainObject.models.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.nearbyou.domainObject.models.PersistedEntity;
import io.nearbyou.domainValue.GeoLocation;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
@Document
public class Deliveries extends PersistedEntity {

    private String title;

    private String description;

    private GeoLocation location;

    @JsonIgnore
    private int min_price;

    private long radius;

    @DBRef
    private ArrayList<Deliverable> deliverableItems;

    @DBRef
    private Users user;

    @DBRef
    private ArrayList<Users> favoriteForUserss;

    public int getMin_price() {
        return min_price;
    }

    public void setMin_price(int min_price) {
        this.min_price = min_price;
    }

    public Users getUsers() {
        return user;
    }

    public void setUsers(Users user) {
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

    public ArrayList<Users> getFavoriteForUserss() {
        return favoriteForUserss;
    }

    public void setFavoriteForUserss(ArrayList<Users> favoriteForUserss) {
        this.favoriteForUserss = favoriteForUserss;
    }
}
