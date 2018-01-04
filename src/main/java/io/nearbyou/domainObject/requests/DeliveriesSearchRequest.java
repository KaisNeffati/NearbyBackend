package io.nearbyou.domainObject.requests;

import io.nearbyou.domainValue.Category;
import io.nearbyou.domainValue.Ranking;

/**
 * Created by Kais NEFFATI on 19/12/2017.
 */
public class DeliveriesSearchRequest {
    private String location;
    private Category category;
    private Ranking rank;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Ranking getRank() {
        return rank;
    }

    public void setRank(Ranking rank) {
        this.rank = rank;
    }
}
