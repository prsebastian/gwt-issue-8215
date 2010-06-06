/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.sample.expenses.gwt.request;

import com.google.gwt.requestfactory.shared.ServerType;
import com.google.gwt.valuestore.shared.Property;
import com.google.gwt.valuestore.shared.Record;

/**
 * "API Generated" DTO interface based on
 * {@link com.google.gwt.sample.expenses.server.domain.Employee}.
 * <p>
 * IRL this class will be generated by a JPA-savvy tool run before compilation.
 */
@ServerType(type = com.google.gwt.sample.expenses.server.domain.Employee.class)
public interface EmployeeRecord extends Record {

  /**
   * Used as input to {@link com.google.gwt.valuestore.shared.DeltaValueStore#create(Record)
   * DeltaValueStore#create()} and in the wire format during sync requests.
   */
  String TOKEN = "EmployeeRecord";

  Property<String> userName = new Property<String>("userName", String.class);
  Property<String> displayName = new Property<String>("displayName",
      String.class);
  Property<String> password = new Property<String>("password", String.class);
  Property<String> supervisorKey = new Property<String>("supervisorKey",
      String.class);

  String getDisplayName();

  String getPassword();

  String getSupervisorKey();

  String getUserName();
}