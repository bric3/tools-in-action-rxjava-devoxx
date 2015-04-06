package com.github.devoxx.sandbox.panic;

import com.github.devoxx.sandbox.model.Movie;
import com.github.devoxx.sandbox.retrofit.ApiFactory;
import com.github.devoxx.sandbox.retrofit.ObservableServerApi;
import rx.Observable;

// B parle. D reprend la main après le code
public class F1_ErrorHandling {

    public static void main(String[] args) {

        ObservableServerApi api = new ApiFactory().observable();

        // concaptMap permet de traiter les events dans l'ORDRE.
        // alors que flatMap ne garanti pas l'ordre
        Observable.just("thedarkknight", "the2godfather", "pulpfiction", "fightclub")
                .concatMap((id) -> api.traduction(id, "FR"))
                .onErrorReturn((e) -> new Movie("oups"))
                .toBlocking().forEach(System.out::println);
    }
}
