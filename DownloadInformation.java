
public class DownloadInformation {
		
		private String title;
		private int timesDownload = 0;
		
		public DownloadInformation(String title){
			this.title = title;
		}//end argument constructor

		public String getTitle() {
			return title;
		}//end getter

		public void incrementTimesDownloaded() {
			timesDownload++;
		}//end incrementTimesDownloaded

		public String toString() {
			String output = "";
			output += "\n" + title + "\n" + timesDownload;
			return output;

		}//end toString
	}//end class

