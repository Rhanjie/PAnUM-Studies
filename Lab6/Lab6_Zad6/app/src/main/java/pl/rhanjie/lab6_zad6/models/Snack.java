package pl.rhanjie.lab6_zad6.models;

import androidx.annotation.NonNull;

import pl.rhanjie.lab6_zad6.R;

public class Snack implements Item {
    private final String name;
    private final String description;
    private final int imageResourceId;

    public static final Snack[] snacks = {
            new Snack("Zbożowe ciasteczka", "Chrupiące i pachnące ciasteczko to idealny dodatek do kawy", R.drawable.cookies),
            new Snack("Sernik", "Ciasto deserowe z twarogiem i pysznymi rodzynkami", R.drawable.cheesecake),
            new Snack("Tosty", "Lekko przyrumienione grzanki z serem i szynką", R.drawable.toast),
    };

    private Snack(String name, String description, int imageResourceId)
    {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    @NonNull
    public String toString()
    {
        return this.name;
    }
}