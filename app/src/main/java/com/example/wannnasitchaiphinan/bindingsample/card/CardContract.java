package com.example.wannnasitchaiphinan.bindingsample.card;

public interface CardContract {
    interface View {
        void updateList();
    }

    interface Action {
        void loadCard();
    }
}
