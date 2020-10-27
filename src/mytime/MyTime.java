package mytime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyTime {

    public static void main(String[] args) {
        //获取年月日时分秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String currentTime = sdf.format(date);
        System.out.println(currentTime);

        Calendar calendar = Calendar.getInstance();
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);//获取本月最大天数
        calendar.set(Calendar.DATE,day);//设置为当月最后一天
        Date date2 = calendar.getTime();
        System.out.println(sdf.format(date2));
    }

}
