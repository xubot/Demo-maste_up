package com.zhh.test.Bean;

/**
 * Created by Administrator on 2017/9/11.
 */

public class BanBeanData {

    /**
     * code : 1
     * msg : 成功
     * msg_en : success
     * data : {"versionCode":"1","versionName":"0.11","upDate":"0","upDateDesc":"","timestamp":"1505093841","downloadUrl":"http://118.190.91.24/sc./Uploads/Download/2017-09-09/59b3ada5c5f0b.apk"}
     */

    private int code;
    private String msg;
    private String msg_en;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg_en() {
        return msg_en;
    }

    public void setMsg_en(String msg_en) {
        this.msg_en = msg_en;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * versionCode : 1
         * versionName : 0.11
         * upDate : 0
         * upDateDesc :
         * timestamp : 1505093841
         * downloadUrl : http://118.190.91.24/sc./Uploads/Download/2017-09-09/59b3ada5c5f0b.apk
         */

        private String versionCode;
        private String versionName;
        private String upDate;
        private String upDateDesc;
        private String timestamp;
        private String downloadUrl;

        public String getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(String versionCode) {
            this.versionCode = versionCode;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }

        public String getUpDate() {
            return upDate;
        }

        public void setUpDate(String upDate) {
            this.upDate = upDate;
        }

        public String getUpDateDesc() {
            return upDateDesc;
        }

        public void setUpDateDesc(String upDateDesc) {
            this.upDateDesc = upDateDesc;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }
    }
}
