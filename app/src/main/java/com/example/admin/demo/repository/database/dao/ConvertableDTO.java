package com.example.admin.demo.repository.database.dao;


/**
 * @author : lent
 * @version 1.0
 * @since : 27/07/2014
 */
public interface ConvertableDTO<E, DTO>
{
// -------------------------- OTHER METHODS --------------------------

    E convertFromDTO(DTO dto);

    DTO convertToDTO(E e);
}
