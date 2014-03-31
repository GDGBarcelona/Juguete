package com.google.gdg.bcn.juguete.core.presenter;


import com.google.gdg.bcn.juguete.core.model.BrowseTransactionsModel;
import com.google.gdg.bcn.juguete.core.view.BrowseTransactionsView;

public class BrowseTransactionsPresenter {

    private final BrowseTransactionsModel model;
    private final BrowseTransactionsView view;

    public BrowseTransactionsPresenter(BrowseTransactionsModel model, BrowseTransactionsView view) {
        this.model = model;
        this.view = view;
    }

    public void render() {
        view.displayNumberOfTransactions(model.countTransactions());
    }
}
