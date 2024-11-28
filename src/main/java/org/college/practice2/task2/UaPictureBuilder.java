package org.college.practice2.task2;

public class UaPictureBuilder extends PictureBuilder{
    private Picture picture;

    public UaPictureBuilder(Picture picture) {
        this.picture = picture;
    }

    public void setBasicParams(String author, short year, String name) {
        picture.set_author(author);
        picture.set_year(year);
        picture.set_name(name);
    }


    public void setSizeParams(Size size) {
        picture.set_size(size);
    }

    public void setColorParams(String color, boolean isWithFrame, String canvas) {
        picture.set_color(color);
        picture.set_canvas(canvas);
    }


    public void setCategoryParams(String theme, String category) {
        picture.set_theme(theme);
        picture.set_category(category);
    }


    public Picture build() {
        System.out.println("You have a UA picture ");
        return picture;
    }

    @Override
    public String toString() {
        return "UaPictureBuilder " +
                "picture = " + picture;
    }
}