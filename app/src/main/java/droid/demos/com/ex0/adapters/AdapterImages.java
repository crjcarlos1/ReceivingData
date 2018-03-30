package droid.demos.com.ex0.adapters;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import droid.demos.com.ex0.R;
import droid.demos.com.ex0.models.ImageModel;

public class AdapterImages extends RecyclerView.Adapter<AdapterImages.ViewHolder> {

    private List<ImageModel> listImagesUries;

    public AdapterImages(List<ImageModel> listImagesUries) {
        this.listImagesUries = listImagesUries;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imgvFinal.setImageURI(Uri.parse(listImagesUries.get(position).getUriImage()));
    }

    @Override
    public int getItemCount() {
        return listImagesUries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgvFinal;

        public ViewHolder(View itemView) {
            super(itemView);
            imgvFinal = (ImageView) itemView.findViewById(R.id.imgvFinal);
        }
    }

}
