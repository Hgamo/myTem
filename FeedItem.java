import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class FeedItem {

	private LocalDateTime time;
	private String imageSrc;
	private int id;

	public FeedItem() {
		time = LocalDateTime.now();
		imageSrc = "https://developers.google.com/maps/documentation/streetview/images/error-image-generic.png";
		id = ThreadLocalRandom.current().nextInt(0, 1000000000);
	}

	public void changeImageSrc(String newImageSrc) {
		imageSrc = newImageSrc;
	}

	public void changeTime(LocalDateTime newTime) {
		time = newTime;
	}

	public int getId() {
		return id;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public String toString() {
		String returnString = "id: " + id + " imageSrc: " + imageSrc + " time: "
				+ time.format(DateTimeFormatter.ofPattern("DD.MM.YYYY"));
		return returnString;
	}

	public boolean isFromSameData(FeedItem compareFeedItem) {
		if (compareFeedItem.time.getDayOfYear() == time.getDayOfYear()
				|| compareFeedItem.time.getYear() == time.getYear()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isNewer(FeedItem compareFeedItem) {
		return compareFeedItem.time.isAfter(time);

	}

	public boolean hasSameId(FeedItem compareFeedItem) {
		return compareFeedItem.id == id;
	}

}