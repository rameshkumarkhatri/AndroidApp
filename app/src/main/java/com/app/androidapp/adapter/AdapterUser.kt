package com.app.androidapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.app.androidapp.R
import com.app.androidapp.model.Model
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule

class AdapterUser(private val data : List<Model.User>): RecyclerView.Adapter<ViewHolderUsesr>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUsesr {

        val view = parent.inflate(R.layout.row_user, false);
        return  ViewHolderUsesr(view);

    }

    override fun getItemCount(): Int {
        return data?.size

    }

    override fun onBindViewHolder(holder: ViewHolderUsesr, position: Int) {
        holder.setData(data[position]);
  }
    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
}

class  ViewHolderUsesr(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener{

    private val view : View = v;

    init {
        v.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
    }

    fun setData(model : Model.User)
    {
        val iv = view.findViewById<ImageView>(R.id.iv)
        Log.e("Value images", model.images.toString());
        Glide.with(view.context).load(model.images.get("100")).into(iv);

        view.findViewById<TextView>(R.id.tv).setText(model.display_name);
    }

    companion object {

    }

}

