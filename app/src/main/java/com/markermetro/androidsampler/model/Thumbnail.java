package com.markermetro.androidsampler.model;

import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("path")
    String path;

    @SerializedName("extension")
    String extension;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getThumbnailURL() {
        if (extension.isEmpty()) {
            return path;
        }
        return path + "." + extension;
    }
}
