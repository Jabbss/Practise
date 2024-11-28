package org.college.practice2.task2;

public class Main {
    public static void main(String[] args){
        Picture usaPicture = new Picture("trump", (short) 2015, "biden", "i do not know", "prezident","red, dark, white, yellow", new Size(1600,900),"vertical", "zaq");
        Picture uaPicture = new Picture("Kozak", (short) 1998, "ja", "i do not know", "village","red, dark, blue, yellow", new Size(1600,900),"gorizontal", "qwe");
        UsaPiictureBuilder usaPiictureBuilder = new UsaPiictureBuilder(usaPicture);
        UaPictureBuilder uaPictureBuilder = new UaPictureBuilder(uaPicture);
        uaPictureBuilder.build();
        System.out.println(uaPictureBuilder);
        usaPiictureBuilder.build();
        System.out.println(usaPiictureBuilder);
    }
}
