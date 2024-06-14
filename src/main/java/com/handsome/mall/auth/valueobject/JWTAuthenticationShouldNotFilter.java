package com.handsome.mall.auth.valueobject;

public class JWTAuthenticationShouldNotFilter {
  public static final String LOGIN_ANT = "/login";
  public static final String SIGNUP_ANT = "/signup";
  public static final String POST_SEE_REGEX = "^/posts/\\d+$";
  public static final String POST_SEARCH ="/posts?post-name";
  public static final String TAG_SEARCH ="/tags?tag-name";
}
