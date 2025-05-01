package Entertainment;

public class Movie {
    private String name;
    private String nickname;
    private int duration;

    public Movie(String name, String nickname, int duration) {
        this.duration = duration;
        this.nickname = nickname;
        this.name = name;
    }


    public String getNickname() {
        return this.nickname;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getName() {
        return this.name;
    }


}
