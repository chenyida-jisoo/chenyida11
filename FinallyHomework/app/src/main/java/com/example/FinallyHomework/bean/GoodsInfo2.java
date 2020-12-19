package com.example.FinallyHomework.bean;

import com.example.FinallyHomework.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "卫衣男圆领秋季", "短袖T恤加绒", "男版韩式秋季潮流", "ins潮流韩版", "冬季短袖日系", "夏季韩版宽松","潮流卫衣百搭","chic男士秋季"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "ins超火情侣 晒衣BF原宿风全员恶人连帽一条文艺跑男同款衣服",
            "纯棉长袖t恤男士秋冬季款圆领打底衫潮牌宽松大码中年男装上衣服",
            "秋冬新款原宿休闲针织衫男百搭潮流韩版套头卡通印花毛衣男",
            "冬港风大码棉服男ins保暖面包服加棉加厚棉袄情侣外套",
            "精致韩版个性提花毛衣男冬季保暖新潮流男士宽松休闲针织衫",
            "2020冬圣诞麋鹿情侣款撞色提花宽松圆领毛衣男慵懒加厚保暖针织衫",
            "2002港风新款雪人圣诞宽松休闲中性情侣圆领潮流印花毛衣男打底衫",
            "墨岚棉衣男加厚保暖面包服冬季外套男士潮品上衣短款"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {199,299, 399, 499, 599, 699,799,899};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.m1, R.drawable.m2, R.drawable.m3,
            R.drawable.m4, R.drawable.m5, R.drawable.m6,R.drawable.m7,R.drawable.m8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.m1, R.drawable.m2, R.drawable.m3,
            R.drawable.m4, R.drawable.m5, R.drawable.m6,R.drawable.m7,R.drawable.m8
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}//These codes are from Peter Pang.