package com.jobs.apidemo;

import com.google.gson.annotations.SerializedName;

public class ImagesItem{

	@SerializedName("image")
	private String image;

	@SerializedName("image_link")
	private String imageLink;

	@SerializedName("is_profile_pic")
	private boolean isProfilePic;

	public String getImage(){
		return image;
	}

	public String getImageLink(){
		return imageLink;
	}

	public boolean isIsProfilePic(){
		return isProfilePic;
	}
}