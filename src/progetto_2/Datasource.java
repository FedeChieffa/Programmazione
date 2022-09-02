package progetto_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Datasource {
    public static final String DB_NAME = "Database.db";
    private static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Federico Chieffa\\Desktop\\" + DB_NAME;
    private static final String REGION_TABLE = "Region";
    private static final String COUNTRY_TABLE = "Country";
    private static final String ORDER_TABLE = "Order_";
    private static final String COLUMN_REGION = "region";
    private static final String COLUMN_COUNTRY = "country";
    private static final String COLUMN_ORDER_ID = "order_ID";
   private static final String QUERY_COUNTRY_BY_REGION_START = "SELECT * FROM " + REGION_TABLE;
    private static Connection conn;
    static {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public static List<Region> queryRegion() {
        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(QUERY_COUNTRY_BY_REGION_START)) {
            ArrayList<Region> regionList = new ArrayList<>();
            while (result.next()) {
                Region region = new Region();
                region.setNAME(result.getString(1));
                regionList.add(region);
                System.out.println(regionList.indexOf(region) + 1 + ". " + result.getString(1));
            }
            return regionList;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Country> queryCountry(String region) throws SQLException {

        final String QUERY_FROM_REGION_FOR_COUNTRY = "SELECT " + COUNTRY_TABLE + "." + COLUMN_COUNTRY + " FROM " + COUNTRY_TABLE + " WHERE " + COUNTRY_TABLE + "." + COLUMN_REGION + "==" + "\"" + region + "\"";

        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(QUERY_FROM_REGION_FOR_COUNTRY)) {
            ArrayList<Country> countryList = new ArrayList<>();
            while (result.next()) {
                Country country = new Country();
                country.setCountry(result.getString(1));
                countryList.add(country);
                System.out.println(countryList.indexOf(country) + " " + result.getString(1));
            }
            return countryList;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Order> queryOrderByCountry(String country) throws SQLException {

        final String QUERY_FROM_FROM_COUNTRY_FOR_ORDER = "SELECT " + ORDER_TABLE + "." + COLUMN_ORDER_ID + " FROM " + ORDER_TABLE + " WHERE " + ORDER_TABLE + "." + COLUMN_COUNTRY + " == \"" + country + "\"";

        try (Statement statement = conn.createStatement();
             ResultSet result = statement.executeQuery(QUERY_FROM_FROM_COUNTRY_FOR_ORDER)) {
            ArrayList<Order> orderIdList = new ArrayList<>();
            while (result.next()) {
                Order order = new Order();
                order.setOrder_ID(result.getString(1));
                orderIdList.add(order);
                System.out.println(orderIdList.indexOf(order) + " " + result.getString(1));
            }
            return orderIdList;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}