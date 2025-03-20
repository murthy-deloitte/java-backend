package com.udemy.spring.mapper;

import com.udemy.spring.dto.CustomerDto;
import com.udemy.spring.entity.Customer;

public class CustomerMapper {

    /**
     * Maps the properties from a Customer entity to a CustomerDto object.
     *
     * @param customer The source Customer entity containing the data.
     * @param customerDto The target CustomerDto object where the data is placed.
     * @return The populated CustomerDto object.
     */
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    /**
     * Maps the properties from a CustomerDto object to a Customer entity.
     *
     * @param customerDto The source CustomerDto object containing the data.
     * @param customer The target Customer entity to which the data is mapped.
     * @return The updated Customer entity with data from the CustomerDto.
     */
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
