/*
 * Copyright © 2015 - 2018 camunda services GmbH and various authors (info@camunda.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.dmn.feel.impl.juel;

import org.camunda.bpm.dmn.feel.impl.FeelException;

/**
 * Exception thrown if a variable used in a FEEL expression is not available.
 */
public class FeelMissingVariableException extends FeelException {

  private final String variable;

  public FeelMissingVariableException(String message, String variable) {
    super(message);
    this.variable = variable;
  }

  public FeelMissingVariableException(String message, Throwable cause, String variable) {
    super(message, cause);
    this.variable = variable;
  }

  public String getVariable() {
    return variable;
  }

}
