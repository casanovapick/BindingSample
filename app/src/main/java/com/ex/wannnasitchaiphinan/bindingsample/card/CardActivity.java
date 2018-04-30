package com.ex.wannnasitchaiphinan.bindingsample.card;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.ex.wannnasitchaiphinan.bindingsample.card.data.CardApi;
import com.ex.wannnasitchaiphinan.bindingsample.card.model.Card;
import com.ex.wannnasitchaiphinan.bindingsample.retrofit.RetrofitFactory;
import com.example.wannnasitchaiphinan.bindingsample.R;
import com.example.wannnasitchaiphinan.bindingsample.databinding.ActivityCardBinding;

import java.util.ArrayList;

public class CardActivity extends AppCompatActivity implements CardContract.View {

    private ArrayList<Card> cards = new ArrayList<>();
    private CardContract.Action presenter;
    private CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        initView();
        initPresenter();
        presenter.loadCard();
    }

    private void initPresenter() {
        CardApi cardApi = RetrofitFactory.createApi(CardApi.class);
        presenter = new CardPresenter(this, cards, cardApi);
    }

    private void initView() {
        ActivityCardBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_card);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CardAdapter(cards);
        binding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void updateList() {
        adapter.notifyDataSetChanged();
    }
}
