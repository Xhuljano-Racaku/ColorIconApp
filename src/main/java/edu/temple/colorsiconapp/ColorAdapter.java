package edu.temple.colorsiconapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    private Context c;
    private String[] data;

    ColorAdapter(Context cont, String[] data) {
        this.c = cont;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView text = new TextView(c);
        text.setText(getItem(position).toString());
        text.setBackgroundColor(Color.parseColor(getItem(position).toString()));
        return text;
    }
}