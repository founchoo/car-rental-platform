package com.dart.carrentalplatform.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dart.carrentalplatform.entity.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.dart.carrentalplatform.util.Constant.SECRET_KEY;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 2:27 PM
 */
public class JwtUtil {

    private static final long EXPIRE = 1000 * 60 * 60 * 24;

    public static String createToken(User user){
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
        Map<String,Object> map = new HashMap<>();
        map.put("typ","JWT");
        map.put("alg","HS256");
        String token = JWT.create().withHeader(map)
                .withIssuer("dart")
                .withSubject("login")
                .withAudience("users")
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRE))
                .withClaim("username",user.getUsername())
                .sign(algorithm);
        return token;
    }
    public static Map<String,Object> verifyToken(String token){
        Map<String,Object> map = new HashMap<>();
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
        JWTVerifier verifier = JWT.require(algorithm).withIssuer("dart").build();
        DecodedJWT jwt = verifier.verify(token);
        map.put("username", jwt.getClaim("username").asString());
        return map;
    }
}
