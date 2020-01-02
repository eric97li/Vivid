//import javazoom.jl.player.*;
//import java.io.FileInputStream;
//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.awt.Desktop;
//import java.net.URI;

public class VividAppMain {

    public static void main(String[] args) {
        //add lists here songs and associate logic for selection of songs below
        //add a login to access user specific playlist
        //continue the loop to have the app running through songs or available for command

        //Make dynamic to song to play
        //Songs in queue
        //Far Out - On My Own (feat. Karra)
        //Far Out - Lost With You (feat. Ruby Chase)
        //Billie Eilish - everything i wanted (Audio)
        //String songName = "Robin Hustin x TobiMorrow - Light It Up (feat. Jex) [Lyrics]";


        //curr queue songs
        List<String> currSessionSongs = new ArrayList<String>();

        Scanner session = new Scanner(System.in);

        //Commands input
        //Scanner command = new Scanner(System.in);

        //User selected start song
        //Scanner songInput = new Scanner(System.in);


       // System.out.println("Press c to go and create YouTube Link song mp3. For new song" +
        //        " Press p to input song/begin list:" + " Press a to add song to queue");
        //press p to play need to have existing list of songs check song list size

        //String action = command.nextLine();

        System.out.println("Press s to start or anything else to quit");
        String sessionCommand = session.nextLine();

        //SESSION START/or QUIT
        while(sessionCommand.equals("s")) {

            //Commands input
            Scanner command = new Scanner(System.in);

            //User selected start song
            Scanner songInput = new Scanner(System.in);

            //User app function command

            System.out.println("Press c to go and create YouTube Link song mp3. For new song" +
                    " Press p to input song/begin list:" + " Press a to add song to queue");
            //press p to play need to have existing list of songs check song list size

            String action = command.nextLine();

            //Process user command request organize to corresponding command

            //Create mp3 file
            if (action.equals("c")) {
                Command createMp3 = new Command(action);
                createMp3.evalCommand(action);
            }

            //Add song to playlist press a create song obj and call add song
            if (action.equals("a")) {
                Command addSong = new Command(action, command);
                //add the song to this curr session method
                currSessionSongs.add(addSong.getSong());
            }

            //Input song and play it
            if (action.equals("p")) {
                System.out.println("Input select start song file name, without .mp3, or play queue start");
                String songName = songInput.nextLine();
                Command inputAndPlay = new Command(action, songName);
                inputAndPlay.evalCommand(action);
                //action = "p";
                //Play other songs in the queue
                while (action.equals("p")) {
                    //Song nextSong = new Song();
                    if (currSessionSongs.size() != 0) {
                        //for(int i = 0; i < nextSong.getSongs().size(); i++) {
                        //}
                        //increment to next song
                        int nextSongIndex = currSessionSongs.indexOf(songName) + 1;
                        //if last song is reached loop back to the first song
                        if(nextSongIndex == currSessionSongs.size()) {
                            System.out.println("Loop to beginning and keep playing press p. " +
                                    "Click anything else to quit this queue");
                            action = command.nextLine();
                            //regardless set to 0 to prepare for loop
                            nextSongIndex = 0;
                        }
                        songName = currSessionSongs.get(nextSongIndex);
                        Command continuePlay = new Command(action, songName);
                        continuePlay.evalCommand(action);
                    }
                    //quit out of this play queue
                    else {
                        action = "q";
                    }
                }
            }

            System.out.println("Continue session press s to" +
                    " go back to options: play current queue, create mp3, or add to queue" +
                    " Otherwise press any other key to quit session");
            sessionCommand = session.nextLine();


            //add logic to choose song to start in the queue, add logic to not start if queue hasn't been added


            //Create mp3 file
            //if (action.equals("c")) {
            //    Command createMp3 = new Command(action);
            //    createMp3.evalCommand(action);
            //}

            //Add song to playlist press a create song obj and call add song
            //if (action.equals("a")) {
            //    Command addSong = new Command(action, command);
            //    addSong.evalCommand(action);
            //}
        }
        //if(action.equals("a")) {
        //    System.out.println("File title?");
        //    fileTitle = command.nextLine();

        //    Song objSong = new Song(fileTitle);
        //    objSong.addSong(fileTitle);

        }

    }
