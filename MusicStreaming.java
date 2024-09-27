// Problem Statement:
// Create a system for managing music tracks and playlists.

// Classes:
// Base Class: Track (attributes like title and duration)
// Subclasses: Song, Podcast (with different playback features)
// Methods:
// A method to calculate total duration of a playlist.

class Track{
    private String title;
    private int duration;
    public Track(String title,int duration){
        this.title=title;
        this.duration=duration;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }   
    public void display(){
        System.out.println("Title : "+title+", Duration : "+duration);
    }
}
class Song extends Track{
    private String artist;
    public Song(String title,int duration,String artist){
        super(title,duration);
        this.artist=artist;
    }
    public String getArtist(){
        return artist;
    }
    public void display(){
       
        System.out.println("Song  : "+getTitle()+", Duration : "+getDuration()+", Artist : "+getArtist());
    }

}
class Podcast extends Track{
    private String host;
    public Podcast(String title,int duration,String host){
        super(title,duration);
        this.host=host;}
        public String getHost(){
            return host;
        }
        public void display(){
            
            System.out.println("Podcast : "+getTitle()+", Duration : "+getDuration()+", Host : "+getHost());
        }

}
class Playlist{
    private String name;
    private Track[] tracks;
    private int trackCount;
    public Playlist(String name,int maxTracks){
        this.name=name;
        this.tracks=new Track[maxTracks];
        this.trackCount=0;
    }
    public void addTrack(Track track){
        if(trackCount<tracks.length){
            tracks[trackCount]=track;
            trackCount++;
    }
    else{
        System.out.println("Playlist is full");
    }
}
 public double calculateTotalDuration(){
    int totalDuration=0;
    for(int i=0;i<trackCount;i++){
        totalDuration+=tracks[i].getDuration();
 }
 return totalDuration;
}
 public void displayPlayListDetails(){
    System.out.println("Playlist Name : "+name);
    for(int i=0;i<trackCount;i++){
        tracks[i].display();
    }
    System.out.println("Total Duration: "+calculateTotalDuration()+" minutes");

 }
}
public class MusicStreaming{
    public static void main(String[] args) {
        Song s1=new Song("Believer",3,"justin");
        Song s2=new Song("BlindingLights",5,"TheWeekend");
        Podcast p1=new Podcast("TechTalk",45,"JohnDoe");
        Playlist playlist=new Playlist("Myplaylist",5);
        playlist.addTrack(s1);
        playlist.addTrack(s2);
        playlist.addTrack(p1);
       playlist.displayPlayListDetails();


    }
}