package com.vlccinstitute.ashish.vlcc.Gallery;

/**
 * Created by Abhi on 12/31/2017.
 */
import android.os.Parcel;
import android.os.Parcelable;

public class SpacePhoto implements Parcelable {

    private String mUrl;
    private String mTitle;

    public SpacePhoto(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    protected SpacePhoto(Parcel in) {
        mUrl = in.readString();
        mTitle = in.readString();
    }

    public static final Creator<SpacePhoto> CREATOR = new Creator<SpacePhoto>() {
        @Override
        public SpacePhoto createFromParcel(Parcel in) {
            return new SpacePhoto(in);
        }

        @Override
        public SpacePhoto[] newArray(int size) {
            return new SpacePhoto[size];
        }
    };

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static  SpacePhoto[] getSpacePhotos() {

        return new SpacePhoto[]{
                new SpacePhoto("https://dl.dropboxusercontent.com/s/dh65vx7rqvar1dr/1.jpeg?dl=0", "pic1"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/wklhn6d0wakkf5k/2.jpeg?dl=0", "pic2"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/2kytzdm3fgg01wj/3.jpeg?dl=0", "pic3"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/9i6bcy9gwsucw0u/4.jpeg?dl=0", "pic4"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/qoalwd4avkrccfg/5.jpeg?dl=0", "pic5"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/x6qjffx9ln7qrpw/7.jpeg?dl=0", "pic6"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/okrc1uyawoy5wh8/8.jpeg?dl=0", "pic7"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/0ioay0acf0dvcf4/9.jpeg?dl=0", "pic8"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/h8jrc7ygm3nrgbt/10.jpeg?dl=0", "pic9"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/v65r9ad0qu1ldom/11.jpeg?dl=0", "pic10"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/2oaigxaiojv1zh4/12.jpeg?dl=0", "pic11"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/xunthpfo7fikkqm/13.jpeg?dl=0", "pic12"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/flrgje51dg1uif7/14.jpeg?dl=0", "pic13"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/636e41wkqd7ugl2/15.jpeg?dl=0", "pic14"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/lg4pctacjrwpjyh/16.jpeg?dl=0", "pic15"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/vgfe4ycvs9ri5vp/18.jpeg?dl=0", "pic16"),
                new SpacePhoto("https://dl.dropboxusercontent.com/s/3doqefrvmp3mq95/19.jpeg?dl=0", "pic17"),

                new SpacePhoto("https://dl.dropboxusercontent.com/s/xjri8g2g8b8lvu7/6.jpeg?dl=0", "pic18"),
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
        parcel.writeString(mTitle);
    }
}