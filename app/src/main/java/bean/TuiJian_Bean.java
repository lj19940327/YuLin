package bean;

/**
 * Created by lenovo on 2016/11/2.
 */
public class TuiJian_Bean {
    public String img;
    public String userName;
    public int userAge;
    public String occupation;
    public String introduction;
    private String url;

    public String getImg() {
        return img;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getUrl() {
        return url;
    }

    public TuiJian_Bean(String img, String userName, int userAge, String occupation, String introduction, String url) {
        this.img = img;
        this.userName = userName;
        this.userAge = userAge;
        this.occupation = occupation;
        this.introduction = introduction;
        this.url = url;

    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TuiJian_Bean{" +
                "img='" + img + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", occupation='" + occupation + '\'' +
                ", introduction='" + introduction + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
