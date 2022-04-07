package com.arun.retrofitsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    Context context;
    List<Post> postList;

    PostAdapter(Context context,List<Post> postList){
        this.context = context;
        this.postList = postList;
    }


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.id.setText("id : " + post.getId());
        holder.userId.setText("userId : " + post.getUserId());
        holder.title.setText("title :" + post.getTitle());
        holder.body.setText("body :" + post.getBody());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        TextView title , id , userId , body;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_tv);
            id = itemView.findViewById(R.id.id_tv);
            userId = itemView.findViewById(R.id.user_id_tv);
            body = itemView.findViewById(R.id.body_tv);
        }
    }
}
