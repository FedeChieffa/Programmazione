package progetto_2;

import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Progetto2 {
    public static final String DB_NAME = "Database.db";
    private static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Federico Chieffa\\Desktop\\" + DB_NAME;
    private static final String REGION_TABLE = "Region";
    private static final String COUNTRY_TABLE = "Country";
    private static final String ITEM_TYPE_TABLE = "Item_type";
    private static final String SALES_CHANNEL_TABLE = "Sales_channel";
    private static final String ORDER_TABLE = "Order_";
    private static final String COLUMN_REGION = "region";
    private static final String COLUMN_COUNTRY = "country";
    private static final String COLUMN_ITEM_TYPE = " item_type";
    private static final String COLUMN_SALES_CHANNEL = "sales_channel";
    private static final String COLUMN_ORDER_PRIORITY = "order_priority";
    private static final String COLUMN_ORDER_DATE = "order_date";
    private static final String COLUMN_ORDER_ID = "order_ID";
    private static final String COLUMN_SHIP_DATE = "ship_date";
    private static final String COLUMN_UNITS_SOLD = "units_sold";
    private static final String COLUMN_UNIT_PRICE = "unit_price";
    private static final String COLUMN_UNIT_COST = "unit_post";
    private static final String COLUMN_TOTAL_REVENUE = "total_revenue";
    private static final String COLUMN_TOTAL_COST = "total_cost";
    private static final String COLUMN_TOTAL_PROFIT = "total_profit";
    private static Connection conn;
    private static Statement statement;

    public static void main(String[] args) throws IOException {

        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            statement = conn.createStatement();

            long sec = System.currentTimeMillis();

            statement.execute("DROP TABLE IF EXISTS " + REGION_TABLE);
            statement.execute("DROP TABLE IF EXISTS " + COUNTRY_TABLE);
            statement.execute("DROP TABLE IF EXISTS " + ITEM_TYPE_TABLE);
            statement.execute("DROP TABLE IF EXISTS " + SALES_CHANNEL_TABLE);
            statement.execute("DROP TABLE IF EXISTS " + ORDER_TABLE);


            statement.execute("CREATE TABLE IF NOT EXISTS " + REGION_TABLE + "(" + COLUMN_REGION + " TEXT PRIMARY KEY) ");

            statement.execute("CREATE TABLE IF NOT EXISTS " + COUNTRY_TABLE + "(" + COLUMN_REGION + " INTEGER, " + COLUMN_COUNTRY + " TEXT PRIMARY KEY, FOREIGN KEY (" + COLUMN_REGION + ") REFERENCES " + REGION_TABLE + "(" + COLUMN_REGION + "))");

            statement.execute("CREATE TABLE IF NOT EXISTS " + ITEM_TYPE_TABLE + " (" + COLUMN_ITEM_TYPE + " TEXT PRIMARY KEY) ");

            statement.execute("CREATE TABLE IF NOT EXISTS " + SALES_CHANNEL_TABLE + " (" + COLUMN_SALES_CHANNEL + " text PRIMARY KEY) ");

            statement.execute("CREATE TABLE IF NOT EXISTS " + ORDER_TABLE + " (" + COLUMN_COUNTRY + " TEXT, " + COLUMN_ITEM_TYPE + " TEXT, " + COLUMN_SALES_CHANNEL + " TEXT, " + COLUMN_ORDER_PRIORITY + " TEXT, " +
                    COLUMN_ORDER_DATE + " TEXT , " + COLUMN_ORDER_ID + " TEXT PRIMARY KEY, " + COLUMN_SHIP_DATE + " TEXT, " + COLUMN_UNITS_SOLD + " TEXT, " + COLUMN_UNIT_PRICE + " TEXT, " + COLUMN_UNIT_COST + " TEXT, " +
                    COLUMN_TOTAL_REVENUE + " TEXT, " + COLUMN_TOTAL_COST + " TEXT, " + COLUMN_TOTAL_PROFIT + " TEXT, FOREIGN KEY (" + COLUMN_COUNTRY + ") REFERENCES " + COUNTRY_TABLE + " ( " + COLUMN_REGION + "), " +
                    " FOREIGN KEY ( " + COLUMN_ITEM_TYPE + " ) REFERENCES " + ITEM_TYPE_TABLE + "( " + COLUMN_ITEM_TYPE + "), FOREIGN KEY (" + COLUMN_SALES_CHANNEL + " ) REFERENCES " + SALES_CHANNEL_TABLE + "( " + COLUMN_SALES_CHANNEL + "))");

            File f = new File("C:\\Users\\Federico Chieffa\\Desktop\\sales_records.csv");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            String linea = bf.readLine();
            while (linea != null) {
                ArrayList<String> r = new ArrayList<>();
                linea = bf.readLine();
                if (linea == null) {
                    System.out.println("FILE FINITO");
                    break;
                }
                StringTokenizer st = new StringTokenizer(linea, ",", false);
                while (st.hasMoreTokens()) {
                    String k = st.nextToken();
                    r.add(k);
                }
                ArrayList<String> provaID = new ArrayList<>();
                if (provaID.contains(r.get(6))) {
                    System.out.println("due uguali");
                    System.out.println(r.get(6));
                } else provaID.add(r.get(6));

                String region = r.get(0);
                String country = r.get(1);
                String item_type = r.get(2);
                String sales_channel = r.get(3);
                String order_priority = r.get(4);
                String order_date = r.get(5);
                String order_ID = r.get(6);
                String ship_date = r.get(7);
                String units_sold = r.get(8);
                String unit_price = r.get(9);
                String unit_cost = r.get(10);
                String total_revenue = r.get(11);
                String total_cost = r.get(12);
                String total_profit = r.get(13);

                statement.execute("INSERT OR IGNORE INTO " + REGION_TABLE + "(" + COLUMN_REGION + ") VALUES(\"" + region + "\")");

                statement.execute("INSERT OR IGNORE INTO " + COUNTRY_TABLE + "(" + COLUMN_REGION + "," + COLUMN_COUNTRY + ") VALUES( \"" + region + "\" " + ", \"" + country + "\" )");

                statement.execute("INSERT OR IGNORE INTO " + ITEM_TYPE_TABLE + "(" + COLUMN_ITEM_TYPE + ") VALUES(\"" + item_type + "\")");

                statement.execute("INSERT OR IGNORE INTO " + SALES_CHANNEL_TABLE + "(" + COLUMN_SALES_CHANNEL + ") VALUES(\"" + sales_channel + "\")");

                statement.execute("INSERT OR IGNORE INTO " + ORDER_TABLE + "(" + COLUMN_COUNTRY + "," + COLUMN_ITEM_TYPE + "," + COLUMN_SALES_CHANNEL + "," + COLUMN_ORDER_PRIORITY + "," + COLUMN_ORDER_DATE + "," + COLUMN_ORDER_ID + "," +
                        COLUMN_SHIP_DATE + "," + COLUMN_UNITS_SOLD + "," + COLUMN_UNIT_PRICE + "," + COLUMN_UNIT_COST + "," + COLUMN_TOTAL_REVENUE + "," + COLUMN_TOTAL_COST + "," + COLUMN_TOTAL_PROFIT + ") " +
                        "VALUES(\"" + country + "\" , \"" + item_type + "\" , \"" + sales_channel + "\" , \"" + order_priority + "\" , \"" + order_date + "\" , \"" + order_ID + "\" , \"" + ship_date + "\" ," +
                        "  \"" + units_sold + "\" , \"" + unit_price + "\" , \"" + unit_cost + "\" , \"" + total_revenue + "\" , \"" + total_cost + "\" , \"" + total_profit + "\" )");

                r.clear();
            }
            long sec2 = System.currentTimeMillis() - sec;
            System.out.println(sec2 + " ms");
            esegui();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void esegui() {
        Scanner sc = new Scanner(System.in);
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            statement = conn.createStatement();

            Datasource dt = new Datasource();

            dt.queryRegion();
            System.out.println("SCEGLI UNA REGIONE TRA LE SEGUENTI: ");

            statement.executeQuery("SELECT * FROM " + REGION_TABLE);

            String scelta = sc.nextLine();
            dt.queryCountry(scelta);

            System.out.println("Ok, hai scelto " + scelta + ", se vuoi sapere ora le zone che comprendre scegliere..");
            scelta = sc.nextLine();
            dt.queryOrderByCountry(scelta);

            System.out.println("E questi erano tutti gli id degli ordini eseguiti dalla zona scelta ");
            System.out.println("\n \n \n");
            System.out.println("Se vuoi continuare digita S, altrimenti un carattere qualsiasi... ");
            scelta = sc.nextLine().toUpperCase();
            if (scelta.equals("S")) {
                esegui();
            } else return;
        } catch (SQLException ex) {
            System.out.println("INSERISCI PER BENE I DATI, TOCCA RICOMINCIARE TUTTO!!!");
            esegui();
        }
    }

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            statement = conn.createStatement();
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (statement != null) {
                statement.close();
            }

            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }
}

