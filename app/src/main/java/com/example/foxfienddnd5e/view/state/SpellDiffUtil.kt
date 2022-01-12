package com.example.foxfienddnd5e.view.state

import androidx.recyclerview.widget.DiffUtil
import com.example.foxfienddnd5e.SpellListQuery

class SpellDiffUtil : DiffUtil.ItemCallback<SpellListQuery.Spell>() {
    override fun areItemsTheSame(
        oldItem: SpellListQuery.Spell,
        newItem: SpellListQuery.Spell
    ): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(
        oldItem: SpellListQuery.Spell,
        newItem: SpellListQuery.Spell
    ): Boolean {
        return oldItem == newItem
    }
}