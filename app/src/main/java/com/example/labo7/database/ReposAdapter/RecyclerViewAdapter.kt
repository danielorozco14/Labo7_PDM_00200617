package com.example.labo7.database.ReposAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labo7.R
import com.example.labo7.database.entities.GithubRepo
import kotlinx.android.synthetic.main.repo_cardview.view.*

class RecyclerViewAdapter(var repos:List<GithubRepo>): RecyclerView.Adapter<RecyclerViewAdapter.ReposAdapter>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReposAdapter {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.repo_cardview,parent,false)
        return ReposAdapter(view)
    }

    override fun getItemCount(): Int {
        return repos.size
    }

    override fun onBindViewHolder(holder: ReposAdapter, position: Int) {
        holder.bind(repos[position])
    }

    fun updateList(newRepos:List<GithubRepo>){
        this.repos=newRepos
        notifyDataSetChanged()
    }


    class ReposAdapter(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(repo:GithubRepo)= with(itemView){
            tv_repo_name.text=repo.name
        }
    }


}