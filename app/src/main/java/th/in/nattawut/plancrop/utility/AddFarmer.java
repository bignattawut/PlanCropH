package th.in.nattawut.plancrop.utility;

import android.content.Context;
import android.os.AsyncTask;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class AddFarmer extends AsyncTask<String, Void, String> {

    private Context context;

    public AddFarmer(Context context){
        this.context = context;
    }
    @Override
    protected String doInBackground(String... strings) {
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("user", strings[0])
                    .add("password", strings[1])
                    .add("id", strings[2])
                    .add("name", strings[3])
                    .add("address", strings[4])
                    .add("vid", strings[5])
                    .add("sid", strings[6])
                    .add("tel", strings[7])
                    .add("email", strings[8])
                    .add("area", strings[9])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[10]).post(requestBody).build();
            Response response=okHttpClient.newCall(request).execute();
            return response.body().string();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
