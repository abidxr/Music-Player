

import java.lang.*;

public class Music{
	String name;
	String artist;
	String duration;
	//String genre;
	String Musicpath,thumpath;
	
	public Music(String name, String artist, String duration,String Musicpath,String thumpath){
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		//this.genre = genre;
		this.Musicpath = Musicpath;
		this.thumpath = thumpath;
	}
	
    //Setter
	public void setName(String name){
		this.name = name;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	public void setDuration(String duration){
		this.duration = duration;
	}
	
	public void setMusicpath(String Musicpath){
		this.Musicpath = Musicpath;
	}
	public void setThumpath(String thumpath){
		this.thumpath = thumpath;
	}
	
	
	
	//Getter
	public String getName(){
		return name;
	}
	public String getArtist(){
		return artist;
	}
	public String getDuration(){
		return duration;
	}
	
	public String getMusicpath(){
		return Musicpath;
	}
	public String getThumpath(){
		return thumpath;
	}
	

}