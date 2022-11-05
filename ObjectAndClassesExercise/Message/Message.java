package AdvertisementMessage;

public class Message {
    private String laudatoryPhrase;
    private String event;
    private String author;
    private String city;

    public Message(String laudatoryPhrase, String event, String author, String city) {
        this.laudatoryPhrase = laudatoryPhrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public String getLaudatoryPhrase() {
        return this.laudatoryPhrase;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s - %s", this.laudatoryPhrase,this.event,this.author,this.city);
    }

    public String getEvent() {

        return this.event;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCity() {
        return this.city;
    }
}
