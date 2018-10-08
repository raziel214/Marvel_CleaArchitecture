package com.johnquimbaya.marvel_cleaarchitecture.Home.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class SuperHero implements Parcelable{

    private int id;
    private String name;
    private String description;
    private Thumbnail thumbnail;


    public SuperHero(){}

    protected SuperHero(Parcel in) {
        id = in.readInt();
        name = in.readString();
        description = in.readString();
    }

    public static final Creator<SuperHero> CREATOR = new Creator<SuperHero>() {
        @Override
        public SuperHero createFromParcel(Parcel in) {
            return new SuperHero(in);
        }

        @Override
        public SuperHero[] newArray(int size) {
            return new SuperHero[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }


    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;//we don't used
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(description);
        dest.writeValue(thumbnail);

    }
}
