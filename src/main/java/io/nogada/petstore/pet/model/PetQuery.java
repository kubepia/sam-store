package io.nogada.petstore.pet.model;

/**
 * PetQuery
 */
public class PetQuery {

    String keyword;
    String message;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}