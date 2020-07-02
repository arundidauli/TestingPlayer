package com.wingshield.technologies.testingplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.potyvideo.library.AndExoPlayerView;
import com.wingshield.technologies.testingplayer.R;
import com.wingshield.technologies.testingplayer.UserClips;

import java.util.List;

import hb.xvideoplayer.MxVideoPlayer;
import hb.xvideoplayer.MxVideoPlayerWidget;


public class MagicalExoPlayerAdapter extends RecyclerView.Adapter<MagicalExoPlayerAdapter.MyViewHolder> {
    private static String TAG = MagicalExoPlayerAdapter.class.getSimpleName();
    private Context context;
    private List<UserClips> userClipsList;
    public MagicalExoPlayerAdapter(Context context, List<UserClips> userClipsList) {
        this.context = context;
        this.userClipsList = userClipsList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.magical_item_row_video, parent, false);



        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        holder.andExoPlayerView.setSource("http://ia800208.us.archive.org/4/items/Popeye_forPresident/Popeye_forPresident_512kb.mp4");
        holder.andExoPlayerView.setPlayWhenReady(true);

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private AndExoPlayerView andExoPlayerView;

        MyViewHolder(View view) {
            super(view);
            andExoPlayerView = view.findViewById(R.id.andExoPlayerView);



        }
    }


}
