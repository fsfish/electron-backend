package com.electron.mfs.pg.mdm.service.impl;

import com.electron.mfs.pg.mdm.service.CustomerTypeService;
import com.electron.mfs.pg.mdm.domain.CustomerType;
import com.electron.mfs.pg.mdm.repository.CustomerTypeRepository;
import com.electron.mfs.pg.mdm.service.dto.CustomerTypeDTO;
import com.electron.mfs.pg.mdm.service.mapper.CustomerTypeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link CustomerType}.
 */
@Service
@Transactional
public class CustomerTypeServiceImpl implements CustomerTypeService {

    private final Logger log = LoggerFactory.getLogger(CustomerTypeServiceImpl.class);

    private final CustomerTypeRepository customerTypeRepository;

    private final CustomerTypeMapper customerTypeMapper;

    public CustomerTypeServiceImpl(CustomerTypeRepository customerTypeRepository, CustomerTypeMapper customerTypeMapper) {
        this.customerTypeRepository = customerTypeRepository;
        this.customerTypeMapper = customerTypeMapper;
    }

    /**
     * Save a customerType.
     *
     * @param customerTypeDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public CustomerTypeDTO save(CustomerTypeDTO customerTypeDTO) {
        log.debug("Request to save CustomerType : {}", customerTypeDTO);
        CustomerType customerType = customerTypeMapper.toEntity(customerTypeDTO);
        customerType = customerTypeRepository.save(customerType);
        return customerTypeMapper.toDto(customerType);
    }

    /**
     * Get all the customerTypes.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<CustomerTypeDTO> findAll() {
        log.debug("Request to get all CustomerTypes");
        return customerTypeRepository.findAll().stream()
            .map(customerTypeMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    /**
     * Get one customerType by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<CustomerTypeDTO> findOne(Long id) {
        log.debug("Request to get CustomerType : {}", id);
        return customerTypeRepository.findById(id)
            .map(customerTypeMapper::toDto);
    }

    /**
     * Delete the customerType by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete CustomerType : {}", id);
        customerTypeRepository.deleteById(id);
    }
}
