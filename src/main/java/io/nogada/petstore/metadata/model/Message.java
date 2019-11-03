package io.nogada.petstore.metadata.model;

import java.io.Serializable;

/**
 * Message
 */
public class Message implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String code;
    String message;

    public Message(){
        this.code="";
        this.message="";
    }
    public Message(String code, String message){
        this.code=code;
        this.message = message;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
    
}