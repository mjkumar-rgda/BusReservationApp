/**
 * Copyright (C) 2020 Covalensedigital 
 * <br />
 * Licensed under the CDS,Version 1.0,you may not use this file except in compliance with
 * the license. You may obtain a copy of the License at 
 * <br />
 * http://www.covalensedigital.com/
 * <br />
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,either express or
 * implied.See the License for the specific language governing permissions and limitations.
*/

package com.altimetrik.brs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j2;

/**
 * .
 * @author: Manoj Kumar.
 * @version: 1.0.
 */
@ControllerAdvice
@Log4j2
public class BRSExceptionHandler {
  
  /**
   * The method will receive exceptions if user provides invalid credential.
   */
  @ResponseBody
  @ExceptionHandler(InvalidCredentialException.class)
  public ResponseEntity<Object> noRecordFoundException(final InvalidCredentialException ex) {
    
    final String response = ex.getMessage();

    return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
  } // End of handling @Valid errors.
  
  @ResponseBody
  @ExceptionHandler(Exception.class)
  public ResponseEntity<Object> genericExceptionHandler(final Exception e) {

    log.error(e.getMessage());
    
    final String response = e.getMessage();

    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  } // End of handling Generic Exception.
} // End of TransactionExceptionHandler.