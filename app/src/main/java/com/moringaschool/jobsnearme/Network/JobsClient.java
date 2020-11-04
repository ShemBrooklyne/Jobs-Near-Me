package com.moringaschool.jobsnearme.Network;

import com.moringaschool.jobsnearme.Constants;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.moringaschool.jobsnearme.Constants.JOBS_BASE_URL;

public class JobsClient {

    private static Retrofit retrofit = null;

    public static JobsApi getClient() {
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        if(retrofit == null){
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            okHttpClient.addInterceptor(httpLoggingInterceptor);
            okHttpClient.build();
        }
        retrofit = new Retrofit
                .Builder()
                .baseUrl(JOBS_BASE_URL)
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(JobsApi.class);
    }

}


////
////        if (retrofit == null) {
//            OkHttpClient okHttpClient = new OkHttpClient.Builder();
//////                    .addInterceptor(new Interceptor() {
//////                        @Override
//////                        public Response intercept(Chain chain) throws IOException {
//////                            Request newRequest = chain.request().newBuilder()
//////                                    .build();
//////                            return chain.proceed(newRequest);
//////                        }
//////                    })
//////                    .build();
////
//            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//            OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                    .addInterceptor(interceptor)
//                    .build();
//
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(JOBS_BASE_URL)
//                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//        return retrofit.create(JobsApi.class);
//    }
//    }
//}
