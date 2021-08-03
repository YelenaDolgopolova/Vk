package domain;

public class Post {
    private int id;
    private int ownerId; // поле из документации
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private boolean friendsOnly;
    private Сopyright copyright;
    private Likes likes;
    private Reports reports;
    private Views views;
    private PostType postType;
    private int attachments;
    private Geo geo;
    private int signerId;
    private int copyHistory;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private  int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
    public int getFromId() {
        return fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public boolean getFriendsOnly() {
        return friendsOnly;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }
    public domain.Сopyright getCopyright() {
        return copyright;
    }

    public void setCopyright(domain.Сopyright copyright) {
        this.copyright = copyright;
    }

    public domain.Likes getLikes() {
        return likes;
    }

    public void setLikes(domain.Likes likes) {
        this.likes = likes;
    }

    public domain.Reports getReports() {
        return reports;
    }

    public void setReports(domain.Reports reports) {
        this.reports = reports;
    }

    public domain.Views getViews() {
        return views;
    }

    public void setViews(domain.Views views) {
        this.views = views;
    }

    public domain.PostType getPostType() {
        return postType;
    }

    public void setPostType(domain.PostType postType) {
        this.postType = postType;
    }

    public int getAttachments() {
        return attachments;
    }

    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }

    public domain.Geo getGeo() {
        return geo;
    }

    public void setGeo(domain.Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCopyHistory() {
        return copyHistory;
    }

    public void setCopyHistory(int copyHistory) {
        this.copyHistory = copyHistory;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
