package cn.gedc.springmall.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by gedc on 2020/12/19.
 */
public class GeneratePassword {
    public static String generatePassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
    public static void main(String[] args) {
        System.out.println(generatePassword("pwd"));
    }
}
