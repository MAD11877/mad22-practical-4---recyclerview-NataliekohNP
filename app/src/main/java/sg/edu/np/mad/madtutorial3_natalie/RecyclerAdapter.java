package sg.edu.np.mad.madtutorial3_natalie;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<User> userlist;
    public RecyclerAdapter(ArrayList<User> userlist){
        this.userlist = userlist;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtname ;
        private TextView descriptiontxt;
        public MyViewHolder(final View view){
            super(view);
            txtname = view.findViewById(R.id.nametxt);
            descriptiontxt = view.findViewById(R.id.description);
        }
    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        String name = userlist.get(position).getName();
        String des = userlist.get(position).getDescription();
        holder.txtname.setText("Name: " + name);
        holder.descriptiontxt.setText("Description: "+ des);
    }

    @Override
    public int getItemCount() {
        int size = userlist.size();
        return size;

    }
}
