public class MediaAdapter implements MediaPlayer {
   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType) {
      switch (audioType.toLowerCase()) {
         case "vlc":
            advancedMusicPlayer = new VlcPlayer();
            break;
         case "mp4":
            advancedMusicPlayer = new Mp4Player();
            break;
         case "avi":
            advancedMusicPlayer = new AviPlayer();
            break;
      }
   }

   @Override
   public void play(String audioType, String fileName) {
      switch (audioType.toLowerCase()) {
         case "vlc":
            advancedMusicPlayer.playVlc(fileName);
            break;
         case "mp4":
            advancedMusicPlayer.playMp4(fileName);
            break;
         case "avi":
            advancedMusicPlayer.playAvi(fileName);
            break;
      }
   }
}
