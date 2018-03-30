package droid.demos.com.ex0.models;

import android.net.Uri;

public class ImageModel {

    private String uriImage;

    public ImageModel(String uriImage) {
        this.uriImage = uriImage;
    }

    public String getUriImage() {
        return uriImage;
    }

    public void setUriImage(String uriImage) {
        this.uriImage = uriImage;
    }
}
