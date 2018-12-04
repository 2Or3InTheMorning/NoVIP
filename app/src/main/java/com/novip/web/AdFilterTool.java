package com.novip.web;

import android.content.Context;
import android.content.res.Resources;

import com.novip.R;
/*
*  广告过滤规则，参考360过滤：http://rules.wd.360.cn/
* */
public class AdFilterTool {
    private  static String[] filterUrls;

    public static boolean isAd(Context context, String url) {
        Resources res = context.getResources();
        if(filterUrls == null || filterUrls.length == 0){
            filterUrls = res.getStringArray(R.array.adUrls);
        }
        for (String adUrl : filterUrls ) {
            if (url.contains(adUrl)) {
                return true;
            }
        }
        return false;
    }
}