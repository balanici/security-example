package com.balanici.securityexample.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Builder
public class ApplicationUserDetails implements UserDetails {

    private final Collection<? extends GrantedAuthority> authorities;
    private final String username;
    @JsonIgnore
    private final String password;
    @JsonIgnore
    private final boolean accountNonExpired;
    @JsonIgnore
    private final boolean accountNonLocked;
    @JsonIgnore
    private final boolean credentialsNonExpired;
    @JsonIgnore
    private final boolean enabled;

    public ApplicationUserDetails(Collection<? extends GrantedAuthority> authorities,
                                  String username,
                                  String password,
                                  boolean accountNonExpired,
                                  boolean accountNonLocked,
                                  boolean credentialsNonExpired,
                                  boolean enabled) {
        this.authorities = authorities;
        this.password = password;
        this.username = username;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
