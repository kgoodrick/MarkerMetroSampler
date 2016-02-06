package com.markermetro.androidsampler.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kevin on 6/02/16.
 */
public class Data {

    @SerializedName("offset")
    int offset;

    @SerializedName("limit")
    int limit;

    @SerializedName("total")
    int total;

    @SerializedName("count")
    int count;

    @SerializedName("results")
    List<Character> characters;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
