package pear.gumeniuk.retrofit2;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ваня on 22.03.2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Contributor> contributors;

    public MyAdapter(List<Contributor> contributors) {
        this.contributors = contributors;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contributor contr = contributors.get(position);

            holder.owner.setText(contr.getLogin());
            holder.repo.setText("trololo");

        Log.d("conPos", String.valueOf(position));

    }

    @Override
    public int getItemCount() {
        return contributors.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView owner;
        TextView repo;

        public ViewHolder(View itemView) {
            super(itemView);
            owner = (TextView) itemView.findViewById(R.id.owner);
            repo = (TextView) itemView.findViewById(R.id.repo);
        }
    }
}

