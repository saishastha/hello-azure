/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.amock.helloazure.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
/*import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;*/
import org.springframework.stereotype.Repository;

import com.amock.helloazure.model.TodoItem;

@Repository
public interface TodoItemRepository extends MongoRepository<TodoItem, String> {
}
