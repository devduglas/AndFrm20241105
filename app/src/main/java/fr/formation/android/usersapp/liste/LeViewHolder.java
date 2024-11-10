package fr.formation.android.usersapp.liste;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.formation.android.usersapp.R;

public class LeViewHolder extends RecyclerView.ViewHolder {


    private TextView nameTextView;
    private TextView emailTextView;


    public LeViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.txt_name_user);
        emailTextView = itemView.findViewById(R.id.txt_email_user);
    }

    public TextView getNameTextView() {
        return nameTextView;
    }

    public void setNameTextView(TextView nameTextView) {
        this.nameTextView = nameTextView;
    }

    public TextView getEmailTextView() {
        return emailTextView;
    }

    public void setEmailTextView(TextView emailTextView) {
        this.emailTextView = emailTextView;
    }
}
