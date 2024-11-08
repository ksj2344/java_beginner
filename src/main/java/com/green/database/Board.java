package com.green.database;

// 엔터팁은 원래 이름 맞춰야함
public class Board {
        private int boardId;
        private String title;
        private String contents;
        private String writer;
        private String createdAt;
        private String updatedAt;


    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s, %s"
                , boardId, title, contents, writer, createdAt, updatedAt);
    }
}
