package com.example.wannnasitchaiphinan.bindingsample.binder;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewBinder {
    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView view, String url) {
        Glide.with(view).load(url).into(view);
    }
}
