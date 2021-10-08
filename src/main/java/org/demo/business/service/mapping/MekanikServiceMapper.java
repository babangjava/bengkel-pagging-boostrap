/*
 * Created on 25 Jul 2021 ( Time 02:07:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.Mekanik;
import org.demo.bean.jpa.MekanikEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class MekanikServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public MekanikServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'MekanikEntity' to 'Mekanik'
	 * @param mekanikEntity
	 */
	public Mekanik mapMekanikEntityToMekanik(MekanikEntity mekanikEntity) {
		if(mekanikEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Mekanik mekanik = map(mekanikEntity, Mekanik.class);

		return mekanik;
	}
	
	/**
	 * Mapping from 'Mekanik' to 'MekanikEntity'
	 * @param mekanik
	 * @param mekanikEntity
	 */
	public void mapMekanikToMekanikEntity(Mekanik mekanik, MekanikEntity mekanikEntity) {
		if(mekanik == null) {
			return;
		}

		//--- Generic mapping 
		map(mekanik, mekanikEntity);

	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}