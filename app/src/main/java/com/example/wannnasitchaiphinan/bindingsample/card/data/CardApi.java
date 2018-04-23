package com.example.wannnasitchaiphinan.bindingsample.card.data;

        import io.reactivex.Observable;
        import retrofit2.http.GET;
        import retrofit2.http.Query;

public interface CardApi {
    @GET("cards?pageSize=10")
    Observable<CardResponse> getCard(@Query("page") int page);
}
