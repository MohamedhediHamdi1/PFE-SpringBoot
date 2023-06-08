package Cryptoo.com.example.Cryptoo.responses;

public class NotificationResponse {

    private boolean inboxMessages;
    private boolean orderMessages;
    private boolean orderUpdates;
    private boolean ratingReminders;
    private boolean buyerBriefs;

    public boolean isInboxMessages() {
        return inboxMessages;
    }

    public void setInboxMessages(boolean inboxMessages) {
        this.inboxMessages = inboxMessages;
    }

    public boolean isOrderMessages() {
        return orderMessages;
    }

    public void setOrderMessages(boolean orderMessages) {
        this.orderMessages = orderMessages;
    }

    public boolean isOrderUpdates() {
        return orderUpdates;
    }

    public void setOrderUpdates(boolean orderUpdates) {
        this.orderUpdates = orderUpdates;
    }

    public boolean isRatingReminders() {
        return ratingReminders;
    }

    public void setRatingReminders(boolean ratingReminders) {
        this.ratingReminders = ratingReminders;
    }

    public boolean isBuyerBriefs() {
        return buyerBriefs;
    }

    public void setBuyerBriefs(boolean buyerBriefs) {
        this.buyerBriefs = buyerBriefs;
    }
}
