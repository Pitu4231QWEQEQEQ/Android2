package stu.cn.ua.randomgallery.screens;

import android.view.View;

public interface Router {
    void launchDetails(View sharedView, String localPhotoId);
    void back();
}