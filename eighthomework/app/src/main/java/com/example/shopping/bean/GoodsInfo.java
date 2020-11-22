package com.example.shopping.bean;

import com.example.shopping.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
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
            "款式1", "款式2", "款式3", "款式4", "款式5", "款式6","款式7","款式8"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "款式1 ：宽松",
            "款式2 ：显瘦",
            "款式3：清凉",
            "款式4：舒适",
            "款式5：春季",
            "款式6：冬季",
            "款式7：夏季",
            "款式8：秋季"
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
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
