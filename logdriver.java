import java.util.ArrayList;
public class logdriver {
	
	public static void main (String [] args) {
		ArrayList<String> songTitles = new ArrayList<String>();
		MusicDownloads webMusicA = new MusicDownloads();
		MusicDownloads webMusicB = new MusicDownloads();
			
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		
		for(int index = 0; index < songTitles.size(); index++) {
			webMusicA.getDownloadInformation(songTitles.get(index));
		}//end for
		webMusicA.updateDownloads(songTitles);
		System.out.println(webMusicA);
		
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Rosemary"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Be Quiet And Drive"));
		songTitles.add(("Effect On Me"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Hole In The Earth"));
		songTitles.add(("Ice Dancer"));
		songTitles.add(("Effect On Me"));
		
		for(int index = 0; index < songTitles.size(); index++) {
			webMusicB.getDownloadInformation(songTitles.get(index));
		}//end for
		webMusicB.updateDownloads(songTitles);
		System.out.println("\n" + webMusicB);
	}//end class
}//end main
