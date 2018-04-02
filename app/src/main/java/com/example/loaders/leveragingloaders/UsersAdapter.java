package com.example.loaders.leveragingloaders;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.loaders.leveragingloaders.models.User;

import java.util.List;

/**
 * Created by henrick on 4/2/18.
 */

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {
    List<User> mUsers;

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View inflatedView = inflater.inflate(R.layout.user_list_item, parent, false);
        return new UserViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.mNameTextView.setText(mUsers.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        if (mUsers == null) {
            return 0;
        }
        else {
            return mUsers.size();
        }
    }

    public void swapData(List<User> users) {
        mUsers = users;
        notifyDataSetChanged();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        TextView mNameTextView;

        UserViewHolder(View parentView) {
            super(parentView);
            mNameTextView = parentView.findViewById(R.id.text_view_name);
        }
    }
}
