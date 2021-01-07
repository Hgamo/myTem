import java.time.LocalDateTime;

public class Test {
    Test() {
    }

    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.addFeedItem(LocalDateTime.now(),
                "https://www.viktoriaschule-aachen.de/wp-content/uploads/2020/08/81724947_2742373012508692_7114063905017561088_n__1_-removebg-preview-300x300.png");
        feed.addFeedItem(LocalDateTime.now(),
                "https://www.viktoriaschule-aachen.de/wp-content/uploads/2020/08/81724947_2742373012508692_7114063905017561088_n__1_-removebg-preview-300x300.png");
        feed.addFeedItem(LocalDateTime.now(),
                "https://www.viktoriaschule-aachen.de/wp-content/uploads/2020/08/81724947_2742373012508692_7114063905017561088_n__1_-removebg-preview-300x300.png");
        feed.addFeedItem(LocalDateTime.now(),
                "https://www.viktoriaschule-aachen.de/wp-content/uploads/2020/08/81724947_2742373012508692_7114063905017561088_n__1_-removebg-preview-300x300.png");
        feed.printOutput();
    }
    
}
