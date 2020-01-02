import javazoom.jl.player.Player;

//import java.util.List;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Command {
    String action;
    Scanner command;
    String songName;
    String songNameInput;
    //Song info
    String fileTitle;

    //Create mp3, start playing queue if list is not empty(add in pause and skip, back)
    public Command(String action){
        this.action = action;
        //this.command = command;
    }

    //Add Song
    public Command(String action, Scanner command) {
        this.action = action;
        this.command = command;
    }

    //Play a song (but not added to queue store list) and play the queue (add in a pause and skip, back)
    public Command(String action, String songName){
        this.action = action;
        this.songName = songName;
        //this.command = command;
    }

    //Continue playing songs
    //public Command(String songName) {
    //    this.songName = songName;
    //}

    //Evaluate non-Add commands
    public void evalCommand(String action) {

        //Add song
        //if(action.equals("a")) {
        //    System.out.println("File title?");
        //    fileTitle = command.nextLine();

        //    Song objSong = new Song(fileTitle);
        //    objSong.addSong(fileTitle);

            //Test
           // for(int i = 0; i < objSong.getSongs().size(); i++) {
           //     System.out.println(objSong.getSong(fileTitle));
           // }

        //}

        //Go to create song mp3 press c, user add mp3 file to projects folder
        if (action.equals("c")) {
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://ytmp3.cc/en3/"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            //System.out.println("Play existing list press p or if queue empty input song press i");
            //action = command.nextLine();
        }

        //Play/Input song to be played press p
        if (action.equals("p")) {
            try {
                //System.out.println("Enter file name:");
                //songName = command.nextLine();
                songNameInput = songName + ".mp3";
            } catch (Exception e) {
                e.printStackTrace();
            }

            //System.out.println("Press p to play queue or anything else to quit");
            //action = command.nextLine();
            // }

            //Play queue press p
            //if (action.equals("p")) {
            try {

                //FileInputStream fis = new FileInputStream("Robin Hustin x TobiMorrow - Light It Up (feat. Jex) [Lyrics].mp3");
                FileInputStream fis = new FileInputStream(songNameInput);

                Player playMP3 = new Player(fis);

                playMP3.play();


            } catch (Exception e) {
                System.out.println(e);
            }
            //}
        }


    }

    public String getSong () {
        System.out.println("File title?");
        fileTitle = command.nextLine();

        Song objSong = new Song(fileTitle);
        objSong.addSong(fileTitle);
        return objSong.getSong(fileTitle);
    }
}
