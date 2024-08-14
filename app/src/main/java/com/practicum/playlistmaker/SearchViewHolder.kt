package com.practicum.playlistmaker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;


class SearchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val trackNameView: TextView
    private val artistNameAndTimeView: TextView
    private val artworkUrl100View: ImageView

    init {
        trackNameView = itemView.findViewById(R.id.track_name)
        artistNameAndTimeView = itemView.findViewById(R.id.arist_and_time)
        artworkUrl100View = itemView.findViewById(R.id.cover)
    }

    fun bind(model: Track) {
        trackNameView.text = model.trackName
        artistNameAndTimeView.text = model.artistNameAndTime
    }

}