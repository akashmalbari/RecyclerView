package malbari.akash.recyclerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by akash on 8/1/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<Bitmap> images = new ArrayList<Bitmap>();
    public MyAdapter(Context context) {
        this.context = context;
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.w_wdg1));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.w_wdg2));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.w_wdg3));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.w_wdg4));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.w_wdg5));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.w_wdg6));

    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageBitmap(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.my_imageView);
        }
    }
}
