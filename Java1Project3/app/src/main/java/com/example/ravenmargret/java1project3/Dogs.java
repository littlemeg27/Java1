//Created by Brenna Pavlinchak on 1/21/15

package com.example.ravenmargret.java1project3;




public class Dogs
{
    //All the private variables
    private  String breed;
    private  String type;
    private  String hairType;
    private  String color;
    private  String temperament;
    private  String age;

    public Dogs(String mBreed, String mType, String mHairType, String mColor, String mTemperament, String mAge)
    {
        breed = mBreed;
        type = mType;
        hairType = mHairType;
        color = mColor;
        temperament = mTemperament;
        age = mAge;
    }


    public String getBreed() {return breed;}
    public String getType() {return type;}
    public String getHairType() {return hairType;}
    public String getColor() {return color;}
    public String getTemperament() {return temperament;}
    public String getAge() {return age;}

}
