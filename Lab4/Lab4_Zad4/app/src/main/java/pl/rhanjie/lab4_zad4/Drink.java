package pl.rhanjie.lab4_zad4;

import androidx.annotation.NonNull;

public class Drink {
    private final String name;
    private final String description;
    private final int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Caffè latte", "Nutka espresso skąpana w mlecznym płynie z delikatną pianką i szczyptą cynamonu", R.drawable.latte),
            new Drink("Cappuccino", "Pyszna kawa z dodatkiem spienionego mleka i szczyptą sypkiej czekolady", R.drawable.cappuccino),
            new Drink("Espresso", "Potężna dawka energii pod postacią mocnej esencji kawy", R.drawable.espresso)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @NonNull
    public String toString() {
        return this.name;
    }
}