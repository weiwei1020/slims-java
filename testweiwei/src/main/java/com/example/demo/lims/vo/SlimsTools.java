package com.example.demo.lims.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SlimsTools {
    public String gainOrderNumber(){
        //系统时间格式
        String x;
        //最后输出的号码
        String z;
        //4位随机数
        Integer y;
        SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
        //把Date型的字符串转换成特定格式的String类型
        x=df.format(new Date());
        //带参的nextInt(int x)则会生成一个范围在0~x（不包含X）内的任意正整数
        Random ne = new Random();
        y = ne.nextInt(9999-1000+1)+1000;
        z=x+y;
        return z;
    }

    public String gainSystemTime(){
//        yyyy-MM-dd hh:mm:ss
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //把Date型的字符串转换成特定格式的String类型
        return df.format(new Date());
    }

}
