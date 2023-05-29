package com.jobs.apidemo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("ass")
	private String ass;

	@SerializedName("shoe_size")
	private String shoeSize;

	@SerializedName("piercings")
	private String piercings;

	@SerializedName("ethnicity")
	private String ethnicity;

	@SerializedName("date_of_birth")
	private String dateOfBirth;

	@SerializedName("boobs")
	private String boobs;

	@SerializedName("pornpics_link")
	private String pornpicsLink;

	@SerializedName("eyes")
	private String eyes;

	@SerializedName("hip")
	private int hip;

	@SerializedName("hair")
	private String hair;

	@SerializedName("rank")
	private int rank;

	@SerializedName("tats")
	private String tats;

	@SerializedName("bust")
	private int bust;

	@SerializedName("slug")
	private String slug;

	@SerializedName("height")
	private String height;

	@SerializedName("raw_measurement")
	private String rawMeasurement;

	@SerializedName("height_ft")
	private int heightFt;

	@SerializedName("images")
	private List<ImagesItem> images;

	@SerializedName("weight")
	private String weight;

	@SerializedName("freeones_link")
	private String freeonesLink;

	@SerializedName("nationality")
	private String nationality;

	@SerializedName("name")
	private String name;

	@SerializedName("height_in")
	private int heightIn;

	@SerializedName("waist")
	private int waist;

	@SerializedName("age")
	private int age;

	@SerializedName("cup_size")
	private String cupSize;

	public String getAss(){
		return ass;
	}

	public String getShoeSize(){
		return shoeSize;
	}

	public String getPiercings(){
		return piercings;
	}

	public String getEthnicity(){
		return ethnicity;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}

	public String getBoobs(){
		return boobs;
	}

	public String getPornpicsLink(){
		return pornpicsLink;
	}

	public String getEyes(){
		return eyes;
	}

	public int getHip(){
		return hip;
	}

	public String getHair(){
		return hair;
	}

	public int getRank(){
		return rank;
	}

	public String getTats(){
		return tats;
	}

	public int getBust(){
		return bust;
	}

	public String getSlug(){
		return slug;
	}

	public String getHeight(){
		return height;
	}

	public String getRawMeasurement(){
		return rawMeasurement;
	}

	public int getHeightFt(){
		return heightFt;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public String getWeight(){
		return weight;
	}

	public String getFreeonesLink(){
		return freeonesLink;
	}

	public String getNationality(){
		return nationality;
	}

	public String getName(){
		return name;
	}

	public int getHeightIn(){
		return heightIn;
	}

	public int getWaist(){
		return waist;
	}

	public int getAge(){
		return age;
	}

	public String getCupSize(){
		return cupSize;
	}
}