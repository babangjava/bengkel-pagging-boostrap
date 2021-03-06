/*
 * Created on 25 Jul 2021 ( Time 02:07:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.demo.bean.Login;
import org.demo.bean.jpa.LoginEntity;
import org.demo.business.service.LoginService;
import org.demo.business.service.mapping.LoginServiceMapper;
import org.demo.data.repository.jpa.LoginJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of LoginService
 */
@Component
@Transactional
public class LoginServiceImpl implements LoginService {

	@Resource
	private LoginJpaRepository loginJpaRepository;

	@Resource
	private LoginServiceMapper loginServiceMapper;
	
	@Override
	public Login findById(String userName) {
		LoginEntity loginEntity = loginJpaRepository.findOne(userName);
		return loginServiceMapper.mapLoginEntityToLogin(loginEntity);
	}

	@Override
	public List<Login> findAll() {
		Iterable<LoginEntity> entities = loginJpaRepository.findAll();
		List<Login> beans = new ArrayList<Login>();
		for(LoginEntity loginEntity : entities) {
			beans.add(loginServiceMapper.mapLoginEntityToLogin(loginEntity));
		}
		return beans;
	}

	@Override
	public Login save(Login login) {
		return update(login) ;
	}

	@Override
	public Login create(Login login) {
		LoginEntity loginEntity = loginJpaRepository.findOne(login.getUserName());
		if( loginEntity != null ) {
			throw new IllegalStateException("already.exists");
		}
		loginEntity = new LoginEntity();
		loginServiceMapper.mapLoginToLoginEntity(login, loginEntity);
		LoginEntity loginEntitySaved = loginJpaRepository.save(loginEntity);
		return loginServiceMapper.mapLoginEntityToLogin(loginEntitySaved);
	}

	@Override
	public Login update(Login login) {
		LoginEntity loginEntity = loginJpaRepository.findOne(login.getUserName());
		loginServiceMapper.mapLoginToLoginEntity(login, loginEntity);
		LoginEntity loginEntitySaved = loginJpaRepository.save(loginEntity);
		return loginServiceMapper.mapLoginEntityToLogin(loginEntitySaved);
	}

	@Override
	public void delete(String userName) {
		loginJpaRepository.delete(userName);
	}

	public LoginJpaRepository getLoginJpaRepository() {
		return loginJpaRepository;
	}

	public void setLoginJpaRepository(LoginJpaRepository loginJpaRepository) {
		this.loginJpaRepository = loginJpaRepository;
	}

	public LoginServiceMapper getLoginServiceMapper() {
		return loginServiceMapper;
	}

	public void setLoginServiceMapper(LoginServiceMapper loginServiceMapper) {
		this.loginServiceMapper = loginServiceMapper;
	}

}
