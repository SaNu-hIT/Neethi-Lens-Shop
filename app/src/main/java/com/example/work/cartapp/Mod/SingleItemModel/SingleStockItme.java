
package com.example.work.cartapp.Mod.SingleItemModel;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class SingleStockItme {

    @SerializedName("Data")
    private com.example.work.cartapp.Mod.SingleItemModel.Data mData;
    @SerializedName("Message")
    private String mMessage;
    @SerializedName("Status")
    private Long mStatus;
    @SerializedName("Success")
    private Boolean mSuccess;
    @SerializedName("Token")
    private Object mToken;

    public com.example.work.cartapp.Mod.SingleItemModel.Data getData() {
        return mData;
    }

    public void setData(com.example.work.cartapp.Mod.SingleItemModel.Data Data) {
        mData = Data;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String Message) {
        mMessage = Message;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long Status) {
        mStatus = Status;
    }

    public Boolean getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Boolean Success) {
        mSuccess = Success;
    }

    public Object getToken() {
        return mToken;
    }

    public void setToken(Object Token) {
        mToken = Token;
    }

}
