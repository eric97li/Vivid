import java.util.ArrayList;
import java.util.List;

public class Song {
   String fileTitle;
   //String artist;
   List<String> songs = new ArrayList<String>();

    public Song() {

    //add in a remove song functionality and backtrack and forward

    }
    public Song (String fileTitle) {
        this.fileTitle = fileTitle;
        //this.artist = artist;
    }

    public void addSong (String fileTitle) {
        songs.add(fileTitle);
    }

    //public int songsSize(List<String> songs) {
    //       return songs.size();
    //}

    //If songs.size() > 0
    public String getSong (String fileTitle) {
        for(int i = 0; i < songs.size(); i++) {
            if(((songs.get(i)).equals(fileTitle))) {
                return songs.get(i);
            }
        }
        return null;
    }

    public int getSongIndex (String fileTitle) {
        for(int i = 0; i < songs.size(); i++) {
            if(((songs.get(i)).equals(fileTitle))) {
                return i;
            }
        }
        return 0;
    }

    public String getSongStringAtIndex (int j) {
        for(int i = 0; i < songs.size(); i++) {
            if(((songs.get(i)).equals(songs.get(j)))) {
                return songs.get(i);
            }
        }
        return null;
    }


    public List<String> getSongs() {
        return songs;
    }

    //public String getArtist() {
    //    return artist;
    //}

    //public void setArtist(String artist) {
    //    this.artist = artist;
    //}

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

}
