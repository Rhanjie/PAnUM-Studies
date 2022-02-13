package pl.rhanjie.lab5_zad5;

import androidx.annotation.NonNull;

public class Cafe
{
    private final String name;
    private final String address;
    private final String openingHours;

    public static final Cafe[] cafes = {
            new Cafe("Cafe-Terra Królewska", "Warszawa, Kościuszki 12/3", "07.00 - 19.00"),
            new Cafe("Cafe-Terra Fabryczna", "Bydgoszcz, Szara 5", "07.00 - 17.30"),
            new Cafe("Cafe-Terra Nadmorska", "Gdynia, Morska 12/21a", "07.00 - 17.30")
    };

    private Cafe(String name, String address, String openingHours) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    @NonNull
    public String toString() {
        return this.name;
    }
}