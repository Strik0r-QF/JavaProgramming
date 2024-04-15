import java.time.*;

public class CalendarTest
{
    public static void main(String[] args){
        LocalDate date = LocalDate.now(); // 获取当前日期
        int month = date.getMonthValue(); // 获取“月”参数
        int today = date.getDayOfMonth(); // 获取“日”参数

        date = date.minusDays(today - 1); // 获得本月的第一天
        DayOfWeek weekday = date.getDayOfWeek();        // 获取本月第一天的对应星期
        int value = weekday.getValue();                 // 获取对应星期的值, 周一为 1, 周日为 7.

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");  // 打印日历第一行
        for (int i=1; i < value; i++)
            System.out.print("    ");                       // 遍历本月第一周, 生称本月1日前的缩进空格
        while (date.getMonthValue() == month) {             // 在当前月内循环
            System.out.printf("%3d", date.getDayOfMonth()); // 用三位十进制整数打印“日”参数
            if (date.getDayOfMonth() == today)
                System.out.print("*");                      // 今天的日参数后加星号
            else
                System.out.print(" ");
            date = date.plusDays(1);             // 日期+1
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();                       // 轮到星期一时换行
        }
    if (date.getDayOfWeek().getValue() != 1)
        System.out.println();                               // 如果最后一天不是周一没有换行, 则换行来避免后续输出出错
    }
}

