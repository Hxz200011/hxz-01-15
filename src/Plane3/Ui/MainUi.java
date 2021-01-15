package Plane3.Ui;

import Bean.Flight;
import Bll.impl.FlightServiceimpl;
import Bll.impl.IFlightService;
import javafx.scene.chart.ScatterChart;
import jdk.nashorn.internal.objects.NativeError;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUi {
    public MainUi() {
    }
    public static void main(String[] args) throws SQLException {

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("hxz");
            System.out.println("请输入相应的数字进行操作:");
            System.out.println("请按1，录入航班信息:");
            System.out.println("按2，显示所有航班信息:");
            System.out.println("按3，查询航班信息:");
            System.out.println("按4，机票预订:");
            System.out.println("按6，退出系统:");

            int choice = sc.nextInt();

            String id = UUID.randomUUID().toString().replace("-", "");

            if (choice == 1) {
                System.out.println("请输入航班编号：");
                String flightid = sc.next();
                System.out.println("请输入机型：");
                String planeType = sc.next();
                System.out.println("请输入座位数：");
                int currentseatsNumber = sc.nextInt();
                System.out.println("请输入起飞机场：");
                String departureAirport = sc.next();
                System.out.println("请输入目的机场：");
                String destinationAirPort = sc.next();
                System.out.println("请输入起飞时间：");
                String departureTime = sc.next();

                Flight flight = new Flight(id, flightid, planeType, currentseatsNumber,
                        departureAirport, destinationAirPort,departureTime);
                IFlightService iFlightService = new FlightServiceimpl();

                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                        // 按指定模式在字符串查找
                        String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {
                            String tableName = m.group(4);
                            String columnName = m.group(5);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }
                    }
                }


            } else if (choice == 2) {
                IFlightService iFlightService = new FlightServiceimpl();
                try {
                    Set<Flight> allFlights = iFlightService.getAllFlights();
                    /*Set的遍历需要用到迭代器*/
                    for (Flight flight : allFlights) {
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (choice == 3) {
                System.out.println("请输入起飞时间");
                System.out.println("1.按起飞时间查询");
                System.out.println("2.按空座信息查询");
                System.out.println("3.按起飞目的地查询");
                System.out.println("4.按目的地查询");
                int choose = sc.nextInt();

                if (choose == 1) {
                    System.out.println("请输入起飞时间：");
                    String departureTime = sc.next();
                    IFlightService iFlightService = new FlightServiceimpl();
                    try {
                        Flight flight = iFlightService.getFlightByDepartureTime(departureTime);
                        if (flight != null) {
                            System.out.println("查询结果：" + flight);
                        } else {
                            System.out.println("没有查询到的航班时间");
                        }
                    }catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

}
