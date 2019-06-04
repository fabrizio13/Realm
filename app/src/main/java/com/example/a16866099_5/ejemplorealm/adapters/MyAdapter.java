package com.example.a16866099_5.ejemplorealm.adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a16866099_5.ejemplorealm.R;
import com.example.a16866099_5.ejemplorealm.models.Dog;
import com.example.a16866099_5.ejemplorealm.models.Person;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Person> list;
    private int layout;
    private Context context;

    public MyAdapter(List<Person> list, int layout, Context context) {
        this.list = list;
        this.layout = layout;
        this.context = context;
    }

   @Override
    public int getCount(){
        return list.size();
   }

   @Override
    public Person getItem (int position){
        return list.get(position);
   }

   @Override
    public long getItemId(int id){
        return id;
   }

   @Override
    public View getView(int position, View convertView, ViewGroup viewGroup){
        ViewHolder vh;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout, null);
            vh = new ViewHolder();
            vh.id = (TextView) convertView.findViewById(R.id.textViewId);
            vh.name = (TextView) convertView.findViewById(R.id.textViewName);
            vh.dogs = (TextView) convertView.findViewById(R.id.textViewDogs);
            convertView.setTag(vh);
        }else {
            vh = (ViewHolder) convertView.getTag();
        }
        Person p = list.get(position);
        vh.id.setText(p.getId() + "");
        vh.name.setText(p.getName());
        String dogsInfo = "";
        for (Dog dog : p.getDogs()){
            dogsInfo += dog.getId() + "-" + dog.getName() + "\n";
        }
        vh.dogs.setText(dogsInfo);
        return convertView;
   }
   public class ViewHolder{
        TextView id;
        TextView name;
        TextView dogs;
   }
}
