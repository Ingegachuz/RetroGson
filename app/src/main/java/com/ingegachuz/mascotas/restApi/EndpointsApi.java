package com.ingegachuz.mascotas.restApi;

import com.ingegachuz.mascotas.restApi.model.MascotaResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Inge on 24/06/2016.
 */
public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();
}
