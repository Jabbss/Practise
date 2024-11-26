package org.college.practice2.task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        class Picture {
            private  String _name;
            private int _year;
            private String _author;

            public Picture(String _name, int _year, String _author) {
                this._name = _name;
                this._year = _year;
                this._author = _author;
            }
            public String get_name() {
                return _name;
            }
            public int get_year() {
                return _year;
            }
            public String get_author() {
                return _author;
            }
            public String toString() {
                return "Picture{" +
                        "name='" + name + '\'' +
                        ", year=" + year +
                        ", author='" + author + '\'' +
                        '}';
            }

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

            // Получение названия галереи
            public String getName() {
                return _name;
            }

            // Установка и получение статьи о галерее
            public void setArticle(String article) {
                this._article = article;
            }

            public String getArticle() {
                return _article;
            }
        }


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

        // Информация о галерее
        System.out.println(gallery);

    }
}
