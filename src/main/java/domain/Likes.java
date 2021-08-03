package domain;

public class Likes {
    private int count;
    private boolean userLikes;
    private boolean canLikes;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public boolean isCanLikes() {
        return canLikes;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public void setCanLikes(boolean canLikes) {
        this.canLikes = canLikes;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

}
