package es.ieslavereda.nacionalidad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyOwnArrayAdapter<T extends Listable> extends ArrayAdapter<T> {
    private int resource;

    public MyOwnArrayAdapter(@NonNull Context context, int resource, @NonNull T[] objects) {
        super(context, resource, new ArrayList<>(List.of(objects)));
        this.resource=resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItems = convertView;
        if(listItems==null)
            listItems= LayoutInflater.from(getContext()).inflate(resource,parent,false);

        T item = getItem(position);

        TextView nation = listItems.findViewById(R.id.nation);
        ImageView flag = listItems.findViewById(R.id.flag);

        nation.setText(item.getDescription());
        flag.setImageResource(item.getDrawableSymbol());

        return listItems;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItems = convertView;
        if(listItems==null)
            listItems= LayoutInflater.from(getContext()).inflate(resource,parent,false);

        T item = getItem(position);

        TextView nation = listItems.findViewById(R.id.nation);
        ImageView flag = listItems.findViewById(R.id.flag);

        nation.setText(item.getDescription());
        flag.setImageResource(item.getDrawableImage());

        return listItems;
    }
}
