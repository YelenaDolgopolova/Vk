package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupCanPost;
    private boolean canClose;
    private boolean canOpen;


    public int getCount() {
        return count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
    public boolean isGroupCanPost() {
        return groupCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setGroupCanPost(boolean groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

}
