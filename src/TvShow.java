import java.util.ArrayList;

public class TvShow implements PublisherBase {

    private String name;

    private String latestEpisode;

    private ArrayList<SubscriberBase> subscribers = new ArrayList<SubscriberBase>();

    public TvShow(String name) {
        this.name = name;
        this.latestEpisode = "Episode 1";
    }

    String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatestEpisode(String latestEpisode) {
        this.latestEpisode = latestEpisode;
        notifySubscribers();
    }

    public String getLatestEpisode() {
        return this.latestEpisode;
    }

    public void subscribe(SubscriberBase sub) {
        subscribers.add(sub);
    }

    public void unsubscribe(SubscriberBase sub) {
        subscribers.remove(sub);
    }

    public void notifySubscribers() {
        for (SubscriberBase sub : subscribers) {
            sub.updateSelf(this.latestEpisode);
        }
    }


}

