package org.college.practice2.task2;

public class UsaPiictureBuilder extends PictureBuilder {
    private Picture picture;

    public UsaPiictureBuilder(Picture usaPicture) {
        this.picture = usaPicture;
    }

    public void setBasicParams(String name, short year, String author) {
        picture.set_name(name);
        picture.set_year(year);
        picture.set_author(author);
    }


    public void setSizeParams(Size size) {
        picture.set_size(size);
    }

    @Override
    public void setColorParams(String color, boolean isWithFrame, String canvas) {
       if (isWithFrame) {
           picture.set_color(color);
           picture.set_canvas(canvas);
       }
    }


    public void setColorParams(String color, String canvas) {
        picture.set_color(color);
        picture.set_canvas(canvas);
    }


    public void setCategoryParams(String theme, String category) {
        picture.set_theme(theme);
        picture.set_category(category);
    }




    public Picture build() {
        System.out.println("You have a USA picture");
        return picture;
    }


    @Override
    public String toString() {
        return "UsaPiictureBuilder " +
                "picture = " + picture ;
    }
}