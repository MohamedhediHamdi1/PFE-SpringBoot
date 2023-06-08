package Cryptoo.com.example.Cryptoo.responses;

public class AnalyticsResponse {

    private int totalServices;
    private int servicesClicks;
    private int servicesImpression;
    private Double avgServicePrice;
    private int totalOrders;
    private int newOrders;
    private int completedOrders;
    private int acceptedOrders;
    private int cancelledOrders;
    private int cancelledOrdersByClient;
    private Double totalEarnings;
    private Double lastMounthEarnings;


    public int getTotalServices() {
        return totalServices;
    }

    public void setTotalServices(int totalServices) {
        this.totalServices = totalServices;
    }

    public int getServicesClicks() {
        return servicesClicks;
    }

    public void setServicesClicks(int servicesClicks) {
        this.servicesClicks = servicesClicks;
    }

    public int getServicesImpression() {
        return servicesImpression;
    }

    public void setServicesImpression(int servicesImpression) {
        this.servicesImpression = servicesImpression;
    }

    public Double getAvgServicePrice() {
        return avgServicePrice;
    }

    public void setAvgServicePrice(Double avgServicePrice) {
        this.avgServicePrice = avgServicePrice;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public int getNewOrders() {
        return newOrders;
    }

    public void setNewOrders(int newOrders) {
        this.newOrders = newOrders;
    }

    public int getCompletedOrders() {
        return completedOrders;
    }

    public void setCompletedOrders(int completedOrders) {
        this.completedOrders = completedOrders;
    }

    public int getAcceptedOrders() {
        return acceptedOrders;
    }

    public void setAcceptedOrders(int acceptedOrders) {
        this.acceptedOrders = acceptedOrders;
    }

    public int getCancelledOrders() {
        return cancelledOrders;
    }

    public void setCancelledOrders(int cancelledOrders) {
        this.cancelledOrders = cancelledOrders;
    }

    public int getCancelledOrdersByClient() {
        return cancelledOrdersByClient;
    }

    public void setCancelledOrdersByClient(int cancelledOrdersByClient) {
        this.cancelledOrdersByClient = cancelledOrdersByClient;
    }

    public Double getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(Double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public Double getLastMounthEarnings() {
        return lastMounthEarnings;
    }

    public void setLastMounthEarnings(Double lastMounthEarnings) {
        this.lastMounthEarnings = lastMounthEarnings;
    }


}
