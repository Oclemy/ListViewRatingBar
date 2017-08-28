package com.tutorials.hp.listviewratingbar.mData;
/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our Spaceship class.
 - Defines our data object with its properties like name, image and rating, with rating being an integer.
 - Then their getters and setters.
 */
public class Spaceship {
    /*
    SPACESHIP PROPERTIES
     */
    private int rating;
    private String name;
    private int image;
    /*
    GETTERS AND SETTERTS
     */
    public float getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
}
