package progetto_2;

public class Order {
    String country, itemType, sales_channel, order_priority, order_date, order_ID,
            ship_date, units_sold, unit_price, unit_post, total_revenue, total_cost,
            total_profit;

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }
}
