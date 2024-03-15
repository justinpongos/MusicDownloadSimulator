import java.util.ArrayList;
public class MusicDownloads {

	private ArrayList<DownloadInformation> downloadList;
	
	public MusicDownloads() {
		downloadList = new ArrayList<DownloadInformation>();
	}//end zero argument constructor
	
	public DownloadInformation getDownloadInformation(String title) {
		for(int index = 0; index < downloadList.size(); index ++) {
			if(title.equals(downloadList.get(index).getTitle())) {
				return downloadList.get(index);
			}//end if
		}//end for
		return null;
	}//end getter
	
	public void updateDownloads(ArrayList<String> titles) {
		for(int index = 0; index < titles.size(); index ++) {
			DownloadInformation found = getDownloadInformation(titles.get(index));
			if(found == null) {
				downloadList.add(new DownloadInformation(titles.get(index)));
				DownloadInformation added = getDownloadInformation(titles.get(index));
				added.incrementTimesDownloaded();
		}//end if
			else {
				titles.remove(index);
				index --;
				found.incrementTimesDownloaded();
			}//end else
		}//end for
	}//end updateDownloads
	
	public String toString() {
		String output = "";
		output += downloadList;
		return output;
	}//end toString
}//end class