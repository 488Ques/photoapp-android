package com.tri.photoapp_android;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<>();

        int id = 0;
        photos.add(new Photo(id++, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Blackberryraspberrystrawberry.jpg/800px-Blackberryraspberrystrawberry.jpg", "Fresh fruits on bowl", "Fresh fruit mix of blackberries, strawberries, and raspberries"));
        photos.add(new Photo(id++, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/FruitArrangement.jpg/1280px-FruitArrangement.jpg", "An arrangement of fruits", "An arrangement of fruits commonly thought of as culinary vegetables, including corn (maize), tomatoes, and various squash"));
        photos.add(new Photo(id++, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Pomegranate_fruit_-_whole_and_piece_with_arils.jpg/1280px-Pomegranate_fruit_-_whole_and_piece_with_arils.jpg", "Pomegranate fruit", "Pomegranate fruit – whole and piece with arils"));
        photos.add(new Photo(id++, "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Tweelinggroei_appels.jpg/1920px-Tweelinggroei_appels.jpg", "Twin apples", "Twin apples"));

        return photos;
    }

    public static Photo getPhotoFromId(int id) {
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id) {
                return phs.get(i);
            }
        }
        return null;
    }
}
