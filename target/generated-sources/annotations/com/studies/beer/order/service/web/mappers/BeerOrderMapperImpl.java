package com.studies.beer.order.service.web.mappers;

import com.studies.beer.order.service.domain.BeerOrder;
import com.studies.beer.order.service.domain.BeerOrderLine;
import com.studies.beer.order.service.domain.Customer;
import com.studies.beer.order.service.web.model.BeerOrderDto;
import com.studies.beer.order.service.web.model.BeerOrderLineDto;
import com.studies.beer.order.service.web.model.OrderStatusEnum;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-03T08:36:51-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class BeerOrderMapperImpl implements BeerOrderMapper {

    @Override
    public BeerOrderDto beerOrderToDto(BeerOrder beerOrder) {
        if ( beerOrder == null ) {
            return null;
        }

        UUID id = null;
        Integer version = null;
        OffsetDateTime createdDate = null;
        OffsetDateTime lastModifiedDate = null;
        UUID customerId = null;
        List<BeerOrderLineDto> beerOrderLines = null;
        OrderStatusEnum orderStatus = null;
        String orderStatusCallbackUrl = null;
        String customerRef = null;

        BeerOrderDto beerOrderDto = new BeerOrderDto( id, version, createdDate, lastModifiedDate, customerId, beerOrderLines, orderStatus, orderStatusCallbackUrl, customerRef );

        return beerOrderDto;
    }

    @Override
    public BeerOrder dtoToBeerOrder(BeerOrderDto dto) {
        if ( dto == null ) {
            return null;
        }

        UUID id = null;
        Long version = null;
        Timestamp createdDate = null;
        Timestamp lastModifiedDate = null;
        String customerRef = null;
        Customer customer = null;
        Set<BeerOrderLine> beerOrderLines = null;
        com.studies.beer.order.service.domain.OrderStatusEnum orderStatus = null;
        String orderStatusCallbackUrl = null;

        BeerOrder beerOrder = new BeerOrder( id, version, createdDate, lastModifiedDate, customerRef, customer, beerOrderLines, orderStatus, orderStatusCallbackUrl );

        return beerOrder;
    }
}
