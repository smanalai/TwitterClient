package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {

    public String name;
    public String screenName;
    public String profileImageUrl;

    // empty constructor needed by the Parceler library
    public User(){}

    public static User fromJson(JSONObject jsonObject) throws JSONException {

        User User = new User();
        User.name = jsonObject.getString("name");
        User.screenName = jsonObject.getString("screen_name");
        User.profileImageUrl = jsonObject.getString("profile_image_url_https");
        return User;
    }

}
