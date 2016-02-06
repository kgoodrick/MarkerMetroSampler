package com.markermetro.androidsampler.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.markermetro.androidsampler.R;
import com.markermetro.androidsampler.model.Character;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by kevin on 5/02/16.
 */
public class CharactersAdapter extends BaseAdapter {

    private Context context;
    private List<Character> characters;

    public CharactersAdapter(Context context, List<Character> characters){
        this.context = context;
        this.characters = characters;
    }

    @Override
    public int getCount() {
        return characters.size();
    }

    @Override
    public Object getItem(int position) {
        return characters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return characters.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.character_list_item, null);
        }

        ImageView thumbnailImageView = (ImageView) convertView.findViewById(R.id.thumbnail);
        TextView characterNameTextView = (TextView)convertView.findViewById(R.id.name);
        ExpandableTextView descriptionTextView = (ExpandableTextView) convertView.findViewById(R.id.description_text_view);

        final Character rowPos = characters.get(position);

        Picasso.with(context)
                .load(rowPos.getThumbnail().getThumbnailURL())
                .resize(200, 200)
                .into(thumbnailImageView);
        characterNameTextView.setText(rowPos.getName());
        descriptionTextView.setText(rowPos.getDescription());

        return convertView;
    }
}
