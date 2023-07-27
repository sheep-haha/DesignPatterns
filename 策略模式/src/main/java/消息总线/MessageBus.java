package 消息总线;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageBus {
    private Map<String, List<String>> topicSubscribers;

    public MessageBus() {
        topicSubscribers = new HashMap<>();
    }

    public void publish(String topic, String message) {
        List<String> subscribers = topicSubscribers.get(topic);
        if (subscribers != null) {
            for (String subscriber : subscribers) {
                System.out.println("Subscriber " + subscriber + " handles event: " + message);
            }
        }
    }

    public void subscribe(String topic, String subscriber) {
        List<String> subscribers = topicSubscribers.computeIfAbsent(topic, k -> new ArrayList<>());
        subscribers.add(subscriber);
    }
}
