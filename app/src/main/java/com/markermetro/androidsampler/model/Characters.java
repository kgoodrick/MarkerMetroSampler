package com.markermetro.androidsampler.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kevin on 6/02/16.
 */
public class Characters {

    @SerializedName("data")
    Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
