package yh.contactmanage.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


import yh.contactmanage.Models.ContactModel;

/**
 * Created by Magnus on 2014-09-16.
 */
public class PicassoAdapter extends ArrayAdapter<ContactModel> {

    private Context context;
    private ArrayList<ContactModel> contactArrayList;

    public PicassoAdapter(Context context, ArrayList<ContactModel> contactArrayList) {
        super(context, R.layout.row_gallery_frame, contactArrayList);

        this.context = context;
        this.contactArrayList = contactArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        {
            ViewHolder viewHolder;

            if(convertView == null){

                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.row_gallery_frame, parent, false);

                viewHolder = new ViewHolder();

                viewHolder.nameHolder = (TextView) convertView.findViewById(R.id.nameTv);
                viewHolder.imageHolder = (ImageView) convertView.findViewById(R.id.portraitIv);

                convertView.setTag(viewHolder);
            }
            else{

                viewHolder = (ViewHolder)convertView.getTag();
            }

            ContactModel galleryFrame = contactArrayList.get(position);

            viewHolder.nameHolder.setText(galleryFrame.getName());
            Picasso.with(context).load(galleryFrame.getUrl()).into(viewHolder.imageHolder);

            return convertView;
        }
    }

    public static class ViewHolder{
        public TextView nameHolder;
        public ImageView imageHolder;
    }
}