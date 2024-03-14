package homeWorks.homeWork40.homeWork40_8;

import projects.project2.entitys.Department;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HomeWork40_8 {
    public static void main(String[] args) throws ParseException {
        List <Order> orders=new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        orders.add(new Order(1,1000,2, format.parse("20.02.2024")));
        orders.add(new Order(2,500,2, format.parse("20.02.2024")));
        orders.add(new Order(3,600,2, format.parse("20.03.2024")));
        orders.add(new Order(4,700,2, format.parse("20.03.2024")));
        orders.add(new Order(5,10,2, format.parse("20.04.2024")));
        orders.add(new Order(6,30,2, format.parse("20.04.2024")));

        Map<Integer,Double> ordersSum=orders.stream().
                collect(Collectors.groupingBy(
                        order->order.getDt().getMonth()+1,
                        Collectors.summingDouble(Order::getSum)
                ));
        System.out.println(ordersSum);

    }
    static class Order{
        int id;
        int sum;
        int status;
        Date dt;

        public Order(int id, int sum, int status, Date dt) {
            this.sum = sum;
            this.status = status;
            this.dt = dt;
            this.id=id;
        }

        public int getSum() {
            return sum;
        }

        public int getStatus() {
            return status;
        }

        public Date getDt() {
            return dt;
        }

    }
}
