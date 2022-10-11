package com.prapser.prapser.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.prapser.prapser.R;

import java.util.List;
import java.util.Objects;

public class ImageAdapter extends PagerAdapter {
    private Context context;

        private int[] mImageIds = new int[]{R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    LayoutInflater mLayoutInflater;

    public ImageAdapter(Context context,int[] mImageIds) {
        this.context = context;
        this.mImageIds = mImageIds;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mImageIds.length;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // inflating the item.xml
        View itemView = mLayoutInflater.inflate(R.layout.view_pager_image, container, false);

        // referencing the image view from the item.xml file
        ImageView imageView = (ImageView) itemView.findViewById(R.id.viewImage);

        // setting the image in the imageView
//        imageView.setImageResource(mImageIds[position]);
        Glide.with(context).load(mImageIds[position]).placeholder(R.drawable.logo).into(imageView);

        // Adding the View
        Objects.requireNonNull(container).addView(itemView);



//        ImageView imageView = new ImageView(mContext);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        imageView.setImageResource(mImageIds[position]);
//        container.addView(imageView, 0);
        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((CardView) object);
    }
}
