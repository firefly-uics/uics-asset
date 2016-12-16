/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.uics.asset.repository;

import com.uics.asset.entity.Message;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageDao extends PagingAndSortingRepository<Message, Long> {

}
