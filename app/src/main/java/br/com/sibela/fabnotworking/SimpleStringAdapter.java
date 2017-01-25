package br.com.sibela.fabnotworking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SimpleStringAdapter extends RecyclerView.Adapter<SimpleStringAdapter.SimpleStringViewHolder> {


    private List<String> list;

    public SimpleStringAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public SimpleStringAdapter.SimpleStringViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new SimpleStringViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleStringAdapter.SimpleStringViewHolder holder, int position) {
        String string = list.get(position);
        holder.textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    static class SimpleStringViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public SimpleStringViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }


}
