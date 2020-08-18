package com.sendtomoon.jwt;

import java.util.HashMap;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class JWTAuth {

	public String auth() {
		return JWT.create().withHeader(new HashMap<String, Object>()).withClaim("username", "123")
				.sign(Algorithm.HMAC256("123445"));
	}

}
