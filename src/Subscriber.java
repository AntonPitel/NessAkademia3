public class Subscriber {

    private final String firstName;
    private final String lastName;
    private final SubscribersAdress subscriberAddress;
    private final String emailAddress;
    private int age;

    public Subscriber(String firstName, String lastName, SubscribersAdress subscriberAddress, String emailAddress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriberAddress = subscriberAddress;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public Subscriber(String firstName, String lastName, SubscribersAdress subscriberAddress, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriberAddress = subscriberAddress;
        this.emailAddress = emailAddress;
    }
}
