package org.college.practice2.task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Gallery gallery = new Gallery("Галерея папппая");

        gallery.addPicture(new Picture("Mona Lisator", 1231, "artur Purojkov"));
        gallery.addPicture( new Picture("Moxnatka artist" , 1356 , "ja"));
        gallery.addPicture(new Picture("ararararararra", 1764, "Vragalik"));

        gallery.removePicture( new Picture("Moxnatka artist" , 1356 , "ja"));
        System.out.println(new Picture("Mona Lisator", 1231, "artur Purojkov"));
        System.out.println("Count of pictures " + gallery.getPictureCount());

        System.out.println("Gallery name: " + gallery.getName());

        gallery.setArticle("It is a famous gallery");
        System.out.println("Article: " + gallery.getArticle());

        System.out.println(gallery.toString());
    }
}
