package com.johnstrack.picasso

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by John on 4/5/2018 at 1:27 PM.
 */
class ImagesAdapter (val context: Context, val images: List<String>): RecyclerView.Adapter<ImagesAdapter.ImageHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ImageHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.grid_element, parent, false)
        return ImageHolder(view)
    }

    override fun getItemCount(): Int {
        return images.count()
    }

    override fun onBindViewHolder(holder: ImageHolder?, position: Int) {
        holder?.bindImage(position)
    }

    inner class ImageHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val image = itemView?.findViewById<ImageView>(R.id.gridElementImage)

        fun bindImage (index: Int) {
            Picasso.get().load(images[index]).into(image)
        }
    }
}