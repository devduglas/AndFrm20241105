package fr.formation.android.usersapp.liste;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.formation.android.usersapp.R;
import fr.formation.android.usersapp.model.User;

public class UserAdapter extends RecyclerView.Adapter<LeViewHolder> {


    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }


    @NonNull
    @Override
    public LeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_detail, parent , false);
        return new LeViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull LeViewHolder holder, int position) {

        User usr = users.get(position);

        holder.getNameTextView().setText(usr.getName());
        holder.getEmailTextView().setText(usr.getEmail());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
