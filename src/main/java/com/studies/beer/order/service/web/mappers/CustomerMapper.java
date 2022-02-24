package com.studies.beer.order.service.web.mappers;

import com.studies.beer.order.service.domain.Customer;
import com.studies.brewery.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {

    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);

}
