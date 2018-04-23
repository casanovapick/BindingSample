package com.example.wannnasitchaiphinan.bindingsample.card;

import com.example.wannnasitchaiphinan.bindingsample.card.data.CardApi;
import com.example.wannnasitchaiphinan.bindingsample.card.data.CardResponse;
import com.example.wannnasitchaiphinan.bindingsample.card.model.Card;
import com.example.wannnasitchaiphinan.bindingsample.utility.RxSchedulersOverrideRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CardPresenterTest {
    @Rule
    public TestRule testRule = new RxSchedulersOverrideRule();
    @Mock
    CardContract.View view;
    private List<Card> cards;
    @Mock
    CardApi cardApi;
    private CardPresenter presenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cards = new ArrayList<>();
        presenter = new CardPresenter(view, cards, cardApi);
    }

    @Test
    public void loadCard() {
        CardResponse response = new CardResponse();
        Card card = new Card();
        response.getCards().add(card);
        when(cardApi.getCard(anyInt())).thenReturn(Observable.just(response));
        presenter.loadCard();
        verify(view).updateList();
    }
}