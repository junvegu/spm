package com.sumroch.spotme.api.command;


import com.sumroch.spotme.api.ApiResponse;
import com.sumroch.spotme.api.HttpClient;
import com.sumroch.spotme.api.impl.ApiService;
import com.sumroch.spotme.models.db.MasterData;

import retrofit2.Call;


/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 19-11-2017
 * ------------------------------
 * This class for
 */

public class MasterDataCommand extends ApiService<String, MasterData> {

    public MasterDataCommand(String s) {
        super(s);
    }

    @Override
    public Call<ApiResponse<MasterData>> getApi() {
        return HttpClient.getInstance().getApi().getMasterData(request);
    }
}
