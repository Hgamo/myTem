
/**
 * Die klasse FeedItem ist die Contentklasse zum Feed.
 * 
 * @author Gareth
 * @version 06.01.2021
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class FeedItem {
	// Die instanzvarieablen werden deklareirt
	private LocalDateTime time;
	private String imageSrc;
	private int id;

	/**
	 * Der Construktor der Klasse FeedItem Den instanzvariablen werden Beispile
	 * zugewiesen, wobei auch eine id erzeugt wird, die maxiaml 9 Stellig ist. Die
	 * wahrscheinlichkeit, dass zwei Feedistems die gleiche id haben ist seht gering
	 * und damit vernachläßigbar.
	 */
	public FeedItem() {
		time = LocalDateTime.now();
		imageSrc = "https://developers.google.com/maps/documentation/streetview/images/error-image-generic.png";
		id = ThreadLocalRandom.current().nextInt(0, 1000000000);
	}

	/**
	 * Dne Pfad zum Image ändern
	 * 
	 * @param newImageSrc der neu Pfad
	 */
	public void changeImageSrc(String newImageSrc) {
		imageSrc = newImageSrc;
	}

	/**
	 * Die Zeit ändern,
	 * 
	 * @param newTime die neue Zeit
	 */
	public void changeTime(LocalDateTime newTime) {
		time = newTime;
	}

	/**
	 * die id ausgeben
	 * 
	 * @return die id als int
	 */
	public int getId() {
		return id;
	}

	/**
	 * den Imaga Pfad ausgeben
	 * 
	 * @return den Image Pfad als String
	 */
	public String getImageSrc() {
		return imageSrc;
	}

	/**
	 * die Zeit ausgeben
	 * 
	 * @return die Zeit als LocalDateTime
	 */
	public LocalDateTime getTime() {
		return time;
	}

	/**
	 * den Inhalt des Objetes ausgeben
	 * 
	 * @return der Inhalt im folgendem Muster als String: "id: <id> imageSrc:
	 *         <imageSrc> time: DD.MM.YYYY"
	 */
	public String toString() {
		String returnString = "id: " + id + " imageSrc: " + imageSrc + " time: "
				+ time.format(DateTimeFormatter.ofPattern("DD.MM.YYYY"));
		return returnString;
	}

	/**
	 * Überprüfung, ob ein anders FeedItem vom selben Tag ist
	 * 
	 * @param compareFeedItem das andere FeedItem
	 * @return den Wahrheitswert
	 */

	public boolean isFromSameData(LocalDateTime compareFeedItemDate) {
		if (compareFeedItemDate.getDayOfYear() == time.getDayOfYear()
				|| compareFeedItemDate.getYear() == time.getYear()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Überprüfung, ob das FeedItem neuer ist
	 * 
	 * @param compareFeedItem das andere FeedItem
	 * @return den Wahrheitswert
	 */

	public boolean isNewer(FeedItem compareFeedItem) {
		return compareFeedItem.time.isAfter(time);

	}

	/**
	 * Überprüfun, ob nicht der sehr unwarscheinlcihe Fall eingetreten ist, dass
	 * zwei FeedItmes die selbe id haben
	 * 
	 * @param compareFeedItem das andere FeedItem
	 * @return den Wahrheitswert
	 */

	public boolean hasSameId(FeedItem compareFeedItem) {
		return compareFeedItem.id == id;
	}

}