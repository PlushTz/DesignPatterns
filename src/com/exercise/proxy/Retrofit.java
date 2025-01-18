package com.exercise.proxy;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2025/1/18
 * Email: lijt@eetrust.com
 */
public class Retrofit implements ApiService {
    @Override
    public void request() {
        System.out.println("request");
    }

    @Override
    public void response() {
        System.out.println("response");
    }
}
