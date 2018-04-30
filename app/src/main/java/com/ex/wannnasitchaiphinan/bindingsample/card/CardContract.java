package com.ex.wannnasitchaiphinan.bindingsample.card;

public interface CardContract {
    interface View {
        void updateList();
    }

    interface Action {
        void loadCard();
    }
}
