package com.configuration.property;

public class PasswordKeyConfig {
    private String publicKey;

    private String privateKey;

    public String getPublicKey(){
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * Gets private key.
     *
     * @return the private key
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Sets private key.
     *
     * @param privateKey the private key
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }


}
