/*
 * Created on 25 Jul 2021 ( Time 02:07:42 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.business.service.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.demo.bean.Barang;
import org.demo.bean.jpa.BarangEntity;

/**
 * Mapping between entity beans and display beans.
 */
@Component
public class BarangServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;
	
	/**
	 * Constructor.
	 */
	public BarangServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'BarangEntity' to 'Barang'
	 * @param barangEntity
	 */
	public Barang mapBarangEntityToBarang(BarangEntity barangEntity) {
		if(barangEntity == null) {
			return null;
		}

		//--- Generic mapping 
		Barang barang = map(barangEntity, Barang.class);

		return barang;
	}
	
	/**
	 * Mapping from 'Barang' to 'BarangEntity'
	 * @param barang
	 * @param barangEntity
	 */
	public void mapBarangToBarangEntity(Barang barang, BarangEntity barangEntity) {
		if(barang == null) {
			return;
		}

		//--- Generic mapping 
		map(barang, barangEntity);

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