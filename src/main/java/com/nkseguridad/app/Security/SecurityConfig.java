package com.nkseguridad.app.Security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.nkseguridad.app.Service.Implementation.UsuarioService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UsuarioService UsuarioServicedetail;
	
	@Autowired
	private void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(UsuarioServicedetail).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*http.authorizeRequests()
		.antMatchers("/css/*","/images/*").permitAll()
		.anyRequest().authenticated()
		.and()
	.formLogin().loginPage("/login").loginProcessingUrl("/logincheck")
	.usernameParameter("username").passwordParameter("password")
	.defaultSuccessUrl("/loginsuccess").permitAll();*/
		super.configure(http);
	}
}
