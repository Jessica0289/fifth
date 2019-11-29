//package com.example.fifthjob;
//
//import android.app.ActionBar;
//import android.graphics.Color;
//import android.os.Build;
//import android.view.View;
//import android.view.Window;
//
//import androidx.annotation.RequiresApi;
//
//public class ImmersiveStatusbar {
//    private static ImmersiveStatusbar immersiveStatusbar;
//    private ImmersiveStatusbar(){}
//
//    public static ImmersiveStatusbar getInstance(){
//        if(immersiveStatusbar == null){
//            immersiveStatusbar = new ImmersiveStatusbar();
//        }
//    return immersiveStatusbar;
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    public void Immersive(Window window, ActionBar actionBar){
//        View view = window.getDecorView();
//        int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
//        view.setSystemUiVisibility(option);
//        window.setStatusBarColor(Color.TRANSPARENT);
//
//        actionBar.hide();
//    }
//}
