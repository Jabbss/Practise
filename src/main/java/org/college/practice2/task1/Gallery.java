package org.college.practice2.task1;

import java.util.HashMap;

class Gallery {
    private HashMap<String, Integer> pictures;
    private String _name;
    private String _article;
    private static HashMap<String, Gallery> _instances = new HashMap<>();

    public Gallery(String name) {
        this._name = name;
        this.pictures = new HashMap<>();
        this._article = "";
        _instances.put(name, this);
    }

    public static Gallery getInstance(String name) {
        return _instances.get(name);
    }

    public boolean addPicture(Picture picture) {
        if (!pictures.containsKey(picture.get_name())) {
            pictures.put(picture.get_name(), picture.get_year());
            return true;
        }
        return false;
    }

    public boolean removePicture(Picture picture) {
        if (pictures.containsKey(picture.get_name())) {
            pictures.remove(picture.get_name());
            return true;
        }
        return false;
    }

    public String describePicture(Picture picture) {
        if (pictures.containsKey(picture.get_name())) {
            return "Картина: " + picture.get_name() + ", Рiк: " + pictures.get(picture.get_name());
        }
        return "Картина не знайдена.";
    }


    public HashMap<String, Integer> getPictures() {
        return new HashMap<>(pictures);
    }

    public long getPictureCount() {
        return pictures.size();
    }

    public String getName() {
        return _name;
    }

    public void setArticle(String article) {
        this._article = article;
    }

    public String getArticle() {
        return _article;
    }

    @Override
    public String toString() {
        return "Gallery " +
                "pictures =" + pictures +
                ", name='" + _name + '\'' +
                ", article='" + _article ;
    }
}