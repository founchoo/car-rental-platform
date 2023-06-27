package com.dart.carrentalplatform.util;

import org.springframework.util.DigestUtils;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 9:22 AM
 */
public class EncryptUtil {

    private static final String SALT = "ezd8_!zAzqHtE-H";

    public static String encrypt(String pwd) {
        return DigestUtils.md5DigestAsHex((SALT + pwd).getBytes());
    }
}
