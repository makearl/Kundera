/*******************************************************************************
 * * Copyright 2012 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.kundera.metadata.validator;

import com.impetus.kundera.KunderaException;


/**
 * @author amresh
 *
 */
public class InvalidEntityDefinitionException extends KunderaException
{

    /**
     * 
     */
    private static final long serialVersionUID = 944429642343486327L;

    /**
     * 
     */
    public InvalidEntityDefinitionException()
    {

    }

    /**
     * @param paramString
     */
    public InvalidEntityDefinitionException(String paramString)
    {
        super(paramString);
    }

    /**
     * @param paramThrowable
     */
    public InvalidEntityDefinitionException(Throwable paramThrowable)
    {
        super(paramThrowable);
    }

    /**
     * @param paramString
     * @param paramThrowable
     */
    public InvalidEntityDefinitionException(String paramString, Throwable paramThrowable)
    {
        super(paramString, paramThrowable);
    }

}
