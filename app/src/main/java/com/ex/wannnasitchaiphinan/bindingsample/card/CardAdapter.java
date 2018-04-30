package com.ex.wannnasitchaiphinan.bindingsample.card;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wannnasitchaiphinan.bindingsample.R;
import com.example.wannnasitchaiphinan.bindingsample.databinding.ItemCardBinding;
import com.ex.wannnasitchaiphinan.bindingsample.card.model.Card;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private List<Card> cards;

    public CardAdapter(List<Card> cards) {
        this.cards = cards;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.binding.setCard(cards.get(position));
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {
        ItemCardBinding binding;

        public CardViewHolder(View itemView) {
            super(itemView);
            binding = ItemCardBinding.bind(itemView);
        }
    }
}
