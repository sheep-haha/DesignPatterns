package 消息总线;


public class Test {

    public static void main(String[] args) {
        MessageBus messageBus = new MessageBus();

        // 订阅者A订阅事件
        messageBus.subscribe("event", "Subscriber A");

        // 订阅者B订阅事件
        messageBus.subscribe("event", "Subscriber B");

        // 发布事件
        messageBus.publish("event", "Event message");
    }

}
